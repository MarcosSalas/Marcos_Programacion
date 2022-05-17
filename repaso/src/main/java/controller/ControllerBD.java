package controller;

import database.SchemeDB;

import java.sql.*;

public class ControllerBD {


    Connection connection;

    private void getConnection() {
        /*String newConnectionURL = "jdbc:mysql://" + SchemeDB.host + "/" + SchemeDB.dtbs
                + "?" + "user=" + SchemeDB.user + "&password=" + SchemeDB.pass;*/
        try {
            connection = DriverManager.getConnection(SchemeDB.url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarPerfiles(){
        //Statement --> no trata tipos
        //PrepareStatement --> trata tipos
        Statement statement = null;
        getConnection();
        try {
            statement = connection.createStatement();
            // execute --> bool
            // executeUpdate --> int (afectadas)
            String query1 = "INSERT INTO %s (%s) VALUES ('Gerente')";
            statement.execute(String.format(query1,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query2 = "INSERT INTO %s (%s) VALUES ('Trabajador')";
            statement.execute(String.format(query2,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query3 = "INSERT INTO %s (%s) VALUES ('Director')";
            statement.execute(String.format(query3,SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }
    }

    public void agregarUsuarios(){
        getConnection();
        String query ="Insert Into %s(%s,%s,%s,%s,s%)values (?,?,?,?,?)";
        String queryFormat=String.format(query,SchemeDB.TAB_USUARIOS,SchemeDB.COL_NOMBRE,SchemeDB.COL_APELLIDO,
                SchemeDB.COL_TELEFONO,SchemeDB.COL_PAIS,SchemeDB.COL_FK_ID);
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(queryFormat);
            preparedStatement.setString(1"Heide-Marie");
            preparedStatement.setString(2"Heide-Marie");
            preparedStatement.setString(3"Heide-Marie");
            preparedStatement.setString(4"Heide-Marie");
            preparedStatement.setString(5"Heide-Marie");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
