package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario(){
        File file = new File("src/resourses/objetosprueba.bin");

        //cerrarlo
        ObjectOutputStream oos=null;


        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(new Usuario("Pedro","Herrera","00335"));

            oos.writeObject(new Usuario("Juan","Herrera","00335"));

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos != null){
                   oos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
public void lecturaBinario(){
    File file = new File("src/resourses/objetosprueba.bin");
    ObjectInputStream ois =null;

    Usuario usuario=null;


    try {
        ois = new ObjectInputStream(new FileInputStream(file));
        while ((usuario = (Usuario) ois.readObject()) != null) {
            System.out.println(usuario);
        }
        /*
        Usuario usuario = (Usuario) ois.readObject();
        System.out.println(usuario.toString());
        Usuario usuario1 = (Usuario) ois.readObject();
        System.out.println(usuario1.toString());
        Usuario usuario2 = (Usuario) ois.readObject();
        System.out.println(usuario2.toString());*/
    }
    catch (EOFException e) {
        System.out.println("Fichero terminado");
    }

    catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

    finally {
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