package controller;

import java.io.*;

public class ControllerEjer1 {

    public void lectura (File file){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader (new FileReader(file));
            char lectura;
            String lectura2 ="";
            //String lectura ="";

            String lecturaCompleta ="";
            StringBuffer lecturaBuffer = new StringBuffer("");

/*
            while ((lectura = bufferedReader.readLine()) != null) {
                //lecturaCompleta += lectura;
                lecturaBuffer.append(lectura+"\n");
            }*/


        /*for (String letra : lectura) {
            int codigo = (byte) (letra.charAt(0));
            int codigoCifrado = codigo / 2;
            char caracterCifrado = (char) codigoCifrado;
            System.out.println(caracterCifrado);
        }*/




            lecturaCompleta = lecturaBuffer.toString();
            System.out.println(lecturaBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
