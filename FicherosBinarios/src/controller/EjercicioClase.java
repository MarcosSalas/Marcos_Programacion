package controller;

import model.Usuario;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioClase {

    public void escribirBinario(){
        File file= new File("src/resourses/objetosEjercicoClase.bin");

        ObjectOutputStream oos=null;
        Scanner scanner =new Scanner(System.in);
        int opcion;
        ArrayList listarUsuario= new ArrayList();

            try {
                oos= new ObjectOutputStream(new FileOutputStream(file));

                do {
                    System.out.println("Ingrese 0 para salir 1 para cargar los datos");
                    opcion=scanner.nextInt();
                    if (opcion==1) {
                        System.out.println("Ingrese su nombre");
                        String nombre =scanner.next();
                        System.out.println("Ingrese su apellido");
                        String apellido =scanner.next();
                        System.out.println("Ingrese su password");
                        String password =scanner.next();

                        listarUsuario.add(new Usuario(nombre,apellido,password);

                    }

                } while (opcion!=0);




            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }



