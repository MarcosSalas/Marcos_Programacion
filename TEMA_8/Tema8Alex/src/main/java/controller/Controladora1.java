package controller;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;

public class Controladora1 {
    private ArrayList lista;



    public void leerFichero() {
        if(lista==null){
            lista = new ArrayList<>();
        }

            File file = new File("src/main/resources/usuarios.bin");
            ObjectInputStream objectInputStream =null;

            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
                lista = (ArrayList) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
