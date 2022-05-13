package controller;

import model.Personaje;
import model.Usuario;

import java.io.*;


public class ControllerEjer2 {


    public void lecturaBiniario(){
        File file =new File("C:\\Users\\Usuario DAM1\\Desktop\\ExamenProgramacion\\personajes.bin");

        ObjectInputStream ois= null;



        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Personaje personajeLectura =null;

            try {
                while ((personajeLectura = (Personaje) ois.readObject())!=null)
                {
                    System.out.println(personajeLectura);
                }
            } catch (EOFException e){
                System.out.println("Fichero terminado");
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }




}
