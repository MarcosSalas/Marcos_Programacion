package controller;

import DataBase.SchemaPracticaBD;

import java.sql.*;

public class ControllerPractica {


    private Connection conn;
    //no comprueba tipos
    private Statement statement;
    //comprueba tipos
    private PreparedStatement preparedStatement;
    //Obtencion de resultados
    private ResultSet resultSet;

    public void getConnection(){
        //TOTAL 4
        String host= SchemaPracticaBD.URL_SERVER;
        String dtbs=SchemaPracticaBD.DB_NAME;
        String user=SchemaPracticaBD.COL_USER;
        String pass=SchemaPracticaBD.COL_PASS;
        //DENTRO DEL GET VIENE LAS LIBRERIAS DEL TEMA 9

        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
