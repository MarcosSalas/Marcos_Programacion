package controller;

import DataBase.SchemeDB;
import model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ControllerBD {


    private Connection conn; /*#ITEM 2 lo de la Izquierda, Sustituye esto Connection conn = null;  que estaba debajo de String pass = SchemeDB.COL_PASS;*/
    // no comprueba tipos
    private Statement statement; /*Me lo creo acá arriba para reutilizarlo en otros lugares*/


/* #ITEM5 como los métodos getConecion-closeConnection solo van a ser llamados
 de la misma controladora y no de otro lado SON Private */

    private void getConecion() { /*ESTE MÉTODO LO QUE VA A HACER ES ABRIR LA CONECCION*/
        /*
        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "";

        // jdbc:mysql://127.0.0.1:3306/colegio?user=root&pass=
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = SchemeDB.COL_USER;
        String pass = SchemeDB.COL_PASS;


        /*#ITEM 1*/
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /*En el min 33:43 esta como publico el método close y luego pasa a privado*/
    private void closeConnection() {
        /* #ITEM 3 */
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


/*#ITEM 6 */
    public void insertarAlumnoStatement() {
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;
        // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('BORJA','MARTIN',38)
        // a)  ABRO CONECCIÓN  # ITEM 7 (pertenece al a),b),c) lo que decia el #ITEM 4)
        try {
            getConecion();
            //b) ACTÚO
            statement = conn.createStatement();
            String query = "INSERT INTO" + SchemeDB.TAB_ALU + " (" + SchemeDB.COL_NOMBRE + "," + SchemeDB.COL_APELLIDO + "," + SchemeDB.COL_EDAD + ") " +
                    "VALUES ('" + nombre + "','" + apellido + "'," + edad + ")";
            String queryFormat = String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s','%s',%d)", SchemeDB.TAB_ALU,
                    SchemeDB.COL_NOMBRE, SchemeDB.COL_APELLIDO, SchemeDB.COL_EDAD,
                    nombre, apellido, edad);
            int numeroRow = statement.executeUpdate(queryFormat);
            //System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //c) CIERRO CONECCIÓN
        finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }
    public void insertarAlumnoStatement(Alumno alumno) {
        String nombre = alumno.getNombre();
        String apellido = alumno.getApellido();
        int edad = alumno.getEdad();
        // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('BORJA','MARTIN',38)
        // a)  ABRO CONECCIÓN  # ITEM 7 (pertenece al a),b),c) lo que decia el #ITEM 4)
        try {
            getConecion();
            //b) ACTÚO
            statement = conn.createStatement();
            String query = "INSERT INTO" + SchemeDB.TAB_ALU + " (" + SchemeDB.COL_NOMBRE + "," + SchemeDB.COL_APELLIDO + "," + SchemeDB.COL_EDAD + ") " +
                    "VALUES ('" + nombre + "','" + apellido + "'," + edad + ")";
            String queryFormat = String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s','%s',%d)", SchemeDB.TAB_ALU,
                    SchemeDB.COL_NOMBRE, SchemeDB.COL_APELLIDO, SchemeDB.COL_EDAD,
                    alumno.getNombre(), alumno.getApellido(), alumno.getEdad());

           // int numeroRow = statement.executeUpdate(queryFormat); ESTO ES PARA SABER LA CANTIDAD
            //System.out.println(numeroRow);

            if(statement.executeUpdate(queryFormat)>0){// al mismo tiempo que hago la comprobación, hago la ejecución
                System.out.println("Alumno insertado correctamente");  //ESTO ES PARA SABER SI SE HA HECHO O NO,SI SI MUESTRA EL PRINT
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //c) CIERRO CONECCIÓN
        finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    // Desde la entrada, pedir al usuario datos para introducir alumnos (recursivo)
    // el alumno se mete en base de datos
    // mediante un modelo


    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }


}

    /* CLASE VIDEO 1
        //en el caso que no me llegara a tomar el main como Clase tengo que poner en el pom reload proyect de nuevo, si nl crear una clase dentro de test en el pom reload proyect y borramos la clase creada

        //## CONECTARSE A BD
        //0)c-Reemplazamos valores
        String host= SchemeDB.URL_SERVER;//este es para todos igual (el puerto 3306 tmb)
        String dtbs= SchemeDB.DB_NAME; // nombre de bd ya creada
        // String user="root";
        String user="programacion";
        String pass="programacion";
        // String pass=""; //todos tenemos root con contraseña vacía,pero habría que ponerle
      //  Connection conn=null;//3)b
        //### 5 UNA VEZ CREADO T@DO Y NO DAR FALLO PUEDO EMPEZAR A UTILIZARLA ,MEDIANTE EL STATEMENT Y EL RESURCE
        //##### Statement st = conn.createStatement(); //No puedo EJECUTAR UN Statement si no tengo previamente una coneccion //me va a pedir trycathc, lo vemos hoy
     //   ResultSet rs; //Lo puedo ir recorriendo mediante sus métodos..ej abajo
        //rs.next();
        //rs.findColumn();
        //   PreparedStatement ps;
        // ps.//Aquí la comprobación de tipos te la doy antes de ejecutar la query



        // 0)b EN LA PARTE DE ARRIBA REEMPLAZAMOS ESTOS VALORES
        //0)a- copiamos y pegamos lo de abajo
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;
        try {
            // 3)a para sacar el error de conn, me Creo arriba un Obj de tipo Connection=conn y lo igualo a null,para poder trabajarlo en el trycatch
            conn = (Connection) DriverManager.getConnection(newConnectionURL);//1)DriverManager altEnter import  2)getConection TryCathc(con el finally etc)
            System.out.println(conn.getCatalog()); //4 una vez cargado t@do si hago el print de conn.getCatalog me da colegio,el nombre de mi bd
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (conn != null) {
                    conn.close();//para poder cerrarlo primero tengo que crearlo al conn
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
       // Connection connection =


    }

    public void Connection(){
        try {

        }*/
