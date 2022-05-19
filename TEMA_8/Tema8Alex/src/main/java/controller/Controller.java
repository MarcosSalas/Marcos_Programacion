package controller;

import java.io.*;

public class Controller {
    public void decifrar(){


        File file = new File("src/main/resources/practica.txt");
        FileReader fileReader = null;
        String respuesta = "";

        try {
            fileReader = new FileReader(file);
            // lectura caracter a caracter
            int caracter = -1;
            while ((caracter = fileReader.read())!=-1){
                respuesta +=( (char) (caracter/2));
            }
            System.out.print(respuesta);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        File fileGuardado=new File("src/main/resources/practicaGuardado.txt");
        PrintWriter printWriter = null;

        try {
            printWriter=new PrintWriter(new FileWriter(fileGuardado));
            printWriter.println(respuesta);
            } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}
