package Ficheros_Binarios.controller;

import Ficheros_Binarios.model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class EjercicioController {
    private ArrayList <Usuario> listaUsuarios;

    public EjercicioController() {
        listaUsuarios= new ArrayList<>();
    }

    public void addUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }

    public void existeFichero(){
        File file = new File("src/Ficheros_Binarios/resources/usuarios.bin");
        FileReader fileReader= null;
        if (file.exists()) {// si existe leo y cargo el arraylist
            //solo quiero escribir datos (llamando al mismo método,lecturaFichero)
            lecturaFichero(false); // aqui quiero leer entonces le paso la condicion falsa,habiendo hecho primero la condicion del método lectura

        }
    }

    public void escrituraUsuarios(){
        File file =new File("src/Ficheros_Binarios/resources/usuarios.bin");
        //FileOutputStream fos=null;
        ObjectOutputStream oos = null;

        try {
            oos=new ObjectOutputStream(new FileOutputStream(file));// para anexar no le puedo poner el true de apend , porque no deja que sea objeto,soluciono con Array
            //oos.writeObject(usuario);

            //ESCRIBO TODOS LOS USUARIOS - OBJETOS A FICHERO ##

            /*for (Usuario itemUser:listaUsuarios) {
                // ESTO ESTÁ MAL System.out.println(itemUser); ##Porque tengo que escribir NO imprimir
                oos.writeObject(itemUser);
            }*/  //EN VEZ DE HACER ESTE FOR EN LA ESCRITURA,SE PODRIA HACER LO DE DEBAJO
            oos.writeObject(listaUsuarios);// mas sencillo lo unico que tiene que ser un Arraylist de objetos,Estar TIPADO con objetos "SERIALIZABLES"-LO MISMO EL EN LA LECTURA


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void mostrarDatosUsuarios(Usuario usuario){
        System.out.println("Nombre "+usuario.getNombre());
        System.out.println("Apellido "+usuario.getApellido());
    }

    public void lecturaFichero(boolean lectura){ //para tener la opcion de leer o agregar en el mismo método te paso por variable un bolean y en la condicion
        File file =new File("src/Ficheros_Binarios/resources/usuarios.bin");
        //FileInputStream fis= null;
        ObjectInputStream ois=null;

        try {
            ois= new ObjectInputStream(new FileInputStream(file));
            Usuario usuarioleer=null;
            try {

                if (!lectura) {// si lectura es false, lo que haria en vez de leer usuario a usuario , un conjunto de COSAS enteras(Arraylist)
                    listaUsuarios = (ArrayList<Usuario>) ois.readObject(); // casteo
                }else{
                    while ((usuarioleer = (Usuario) ois.readObject()) != null) {
                        mostrarDatosUsuarios(usuarioleer);
                    }
                }

                // ####  EN VEZ DE HACER ESTE WHILE en la  lECTURA,SE PODRIA HACER LO DE ARRIBA
                /*  #### mas sencillo lo unico que tiene que ser un Arraylist de objetos,Estar TIPADO con objetos "SERIALIZABLES"-LO MISMO EL EN LA LECTURA

                while ((usuarioleer = (Usuario) ois.readObject()) != null) { //Add catch  y Cast to Ficheros_Binario...Usuario,luego ))!= null
                    if (lectura) { // si quiero leer haz esto //aqui lectura sería TRUE
                        mostrarDatosUsuarios(usuarioleer);
                    } else { // si no haz esto otro
                        listaUsuarios.add(usuarioleer); //CARGAR USUARIO DENTRO DE ARRAILIST
                    }
                 }*/

            } catch (StreamCorruptedException | EOFException e){ //PREGUNTAR SI ESTÁ BIEN A BORJA
                System.out.println("Fichero Terminado");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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

    //EJECUTE NADA MAS ARRANCAR CARGA LOS USUARIOS ANTERIOR##


}
