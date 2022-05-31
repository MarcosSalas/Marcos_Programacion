package controller;
import com.google.gson.Gson;


import database.SchemeDb;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

public class Controller2 {
    private Connection conn;
    // no comprueba tipos
    private Statement statement;
    // comprueba tipos de datos
    private PreparedStatement preparedStatement;
    // obtencion de resultados;
    private ResultSet resultSet;


    private void getConnection(){
        String host = SchemeDb.host;
        String dtbs = SchemeDb.dtbs;
        String user = SchemeDb.user;
        String pass = SchemeDb.pass;


        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void closeConnection(){
        try {
            if (conn!= null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        private ArrayList lista;

        public void leerFicheros() {
            if (lista == null) {
                lista = new ArrayList<>();
            }
            String urlString = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";

            //System.out.println(urlFormat);

            BufferedReader reader = null;
            try {
                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder stringBuffer = new StringBuilder();
                String linea = null;

                while ((linea = reader.readLine()) != null) {
                    stringBuffer.append(linea);
                }

                JSONObject jsonObject = new JSONObject(stringBuffer.toString());
                System.out.println(jsonObject);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }


