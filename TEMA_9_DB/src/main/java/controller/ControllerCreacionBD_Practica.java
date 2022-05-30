package controller;


import DataBase.SchemaCreacionBd_Practica;
import model.Usuario;

import java.sql.*;

public class ControllerCreacionBD_Practica {

    private Connection conn;

    public void getConnection(){
        try {
            conn=DriverManager.getConnection(SchemaCreacionBd_Practica.url );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        try {
            if (conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarPerfiles(){
                //Statement no trata
                //PrepareStatement trata
        //Para la creacion de cualquiera de los 2 preciso la coneccion
        Statement statement=null;
        getConnection();
        try {
            statement=conn.createStatement();
            //Execute -->bolean
            //ExecuteUpdate -->int (afectadas)
            // ** Primero te digo esto
            // String query1="INSERT INTO perfiles (nombre) VALUES ('trabajador')";
            // ** Luego lo reemplazo poe esto
             String query1="INSERT INTO %s (%s) VALUES ('trabajador')";
             //para que se ejecute la accion de insertar lo formateo
            statement.execute(String.format(query1,SchemaCreacionBd_Practica.TAB_PERFILES,SchemaCreacionBd_Practica.COL_NOMBRE));
            String query2="INSERT INTO %s (%s) VALUES ('director')";
            statement.execute(String.format(query2,SchemaCreacionBd_Practica.TAB_PERFILES,SchemaCreacionBd_Practica.COL_NOMBRE));
            String query3="INSERT INTO %s (%s) VALUES ('gerente')";
            statement.execute(String.format(query3,SchemaCreacionBd_Practica.TAB_PERFILES,SchemaCreacionBd_Practica.COL_NOMBRE));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null ) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }



    }

    public void insertarUsuarios(){
        //Para el Prepared NECESITO crear las clases en este caso Usuario y Perfil
        getConnection();
        PreparedStatement preparedStatement=null;
        //Quiero insertar esto sin pk x q es autoIncrement,pero si con fk para indicarle la posicion
        String query ="INSERT INTO %s (%s,%s,%s,%s,%s) VALUE ( ?,?,?,?,? ) ";
        //para que se inserte debo formatearlo en 1 SOLA Query
        String queryFormat= String.format(query,SchemaCreacionBd_Practica.TAB_USUARIOS,SchemaCreacionBd_Practica.COL_NOMBRE,
                SchemaCreacionBd_Practica.COL_APELLIDO,SchemaCreacionBd_Practica.COL_TELEFONO,
                SchemaCreacionBd_Practica.COL_PAIS,SchemaCreacionBd_Practica.COL_FK_ID);

        //Le paso 1 sola QUERY
        try {
            preparedStatement=conn.prepareStatement(queryFormat);
            //Acá cargo los valores seteandolos
            preparedStatement.setString(1,"Heide-Marie");
            preparedStatement.setString(2,"Rausch");
            preparedStatement.setInt(3,2145024);
            preparedStatement.setString(4,"Holanda");
            preparedStatement.setInt(5,1);
            //ejecuto
            preparedStatement.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }


}

public void insertarUsuarioIndividual(Usuario usuario){
    //Para el Prepared NECESITO crear las clases en este caso Usuario y Perfil
    getConnection();
    PreparedStatement preparedStatement=null;
    //Quiero insertar esto sin pk x q es autoIncrement,pero si con fk para indicarle la posicion
    String query ="INSERT INTO %s (%s,%s,%s,%s,%s) VALUE ( ?,?,?,?,? ) ";
    //para que se inserte debo formatearlo en 1 SOLA Query
    String queryFormat= String.format(query,SchemaCreacionBd_Practica.TAB_USUARIOS,SchemaCreacionBd_Practica.COL_NOMBRE,
            SchemaCreacionBd_Practica.COL_APELLIDO,SchemaCreacionBd_Practica.COL_TELEFONO,
            SchemaCreacionBd_Practica.COL_PAIS,SchemaCreacionBd_Practica.COL_FK_ID);

    //Le paso 1 sola QUERY
    try {
        preparedStatement=conn.prepareStatement(queryFormat);
        //Acá cargo los valores seteandolos
        preparedStatement.setString(1,usuario.getNombre());
        preparedStatement.setString(2, usuario.getApellido());
        preparedStatement.setInt(3,usuario.getTelefono());
        preparedStatement.setString(4,usuario.getPais());
        preparedStatement.setInt(5,usuario.getId_perfil());
        //ejecuto
        preparedStatement.execute();


    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    finally {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }

}
}