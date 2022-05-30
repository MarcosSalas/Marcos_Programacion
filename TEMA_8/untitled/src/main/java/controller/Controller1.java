package controller;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;


public class Controller1 {
    private ArrayList lista;

    /*private void existeFichero() {
        File file = new File("src/resources/usuarios1.bin");
        if (file.exists()) {
            // leo y cargo en arraylist
            // solo quiero escribir datos
            lecturaFichero(false);
        }
    }*/
    public void lecturaFichero() {
        if (lista == null) {
            lista = new ArrayList<>();
        }
        File file = new File("src/main/resources/facturas.json");

        //System.out.println(urlFormat);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while ((linea = reader.readLine()) != null) {
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
          //  System.out.println(jsonObject);

            JSONArray jsonArray = jsonObject.getJSONArray("results");
            int Acumu=0;
                for (int i = 0; i < jsonArray.length(); i++) {
          //  System.out.println(results);
            JSONObject jsonObject2 = jsonArray.getJSONObject(1);

            int invoice =jsonObject2.getInt("invoice");

                Acumu += invoice;

            }

            System.out.println("Total acumulado "+Acumu);






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


    public void escribirFichero(){
        File file = new File("src/main/resources/usuarios.bin");
        ObjectOutputStream objectOutputStream = null;

        if (file.exists()) {
            System.out.println("Ya existe");
        }else {


        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }

    public void sumaInvoice(){


    }

}

