package Ficheros_Binarios.controller;

import Ficheros_Binarios.model.Usuario;

import java.io.*;

public class BinariosController {

public void  escribirBinario(){
    // ABSOLUTA =Desde la raiz
    //RELATIVA = Desde donde estoy ubicado
    File file =new File("src/Ficheros_Binarios/resources/objetos.bin"); //creo el File aqui para no ensuciar mucho la entrada //esta es una ruta del proyecto,en concreto de la carpeta resources
    FileOutputStream fos =null;
    //se cierra el último ⇓
    ObjectOutputStream oos =null;

    //     oos = new ObjectOutputStream(new FileOutputStream(file));

    try {
      //  fos= new FileOutputStream(file);
        oos= new ObjectOutputStream(new FileOutputStream(file,true));// con el true anexa
        oos.writeObject(new Usuario("Marcos","Salas","12345A"));
        oos.writeObject(new Usuario("Sergio","Perez","234567"));
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

public void lecturaBinario(){
    File file =new File("src/Ficheros_Binarios/resources/objetos.bin"); //Mismo File qe el escribirBinarios //esta es una ruta del proyecto,en concreto de la carpeta resources
    // FileInputStream fis=null; ## sobraría por lo ya visto
    ObjectInputStream ois=null;

    try {
        ois = new ObjectInputStream(new FileInputStream(file));
       /* Usuario usuario = (Usuario) ois.readObject();
        System.out.println(usuario.toString());
        Usuario usuario2 = (Usuario) ois.readObject();
        System.out.println(usuario2.toString());*/

        Usuario usuarioLectura=null;
        try {
            while ((usuarioLectura = (Usuario) ois.readObject()) != null) {
                System.out.println(usuarioLectura);
            }
        } catch (StreamCorruptedException | EOFException e){ //PREGUNTAR SI ESTÁ BIEN A BORJA
            System.out.println("Fichero Terminado");
        }

    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        try {
            if (ois != null) {
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}




}
