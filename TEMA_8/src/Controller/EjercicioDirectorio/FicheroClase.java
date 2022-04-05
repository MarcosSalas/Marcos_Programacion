package Controller.EjercicioDirectorio;

import java.io.File;
import java.util.Scanner;

public class FicheroClase {

    int opcion,cont;



    public void getFileInfo(File file){
        Scanner scanner= new Scanner(System.in);
        int  opcion;


        File [] ficheros=file.listFiles();
        System.out.println("Inprimiendo "+file.getName());
        cont=0;
        for (File fichero:ficheros) {
            System.out.println(cont +". "+ fichero.getName());
            cont=cont+1;
        }

        System.out.println("Que directorio quieres imprimir");
        opcion=scanner.nextInt();


        if (opcion >= 0 && opcion < ficheros.length) {
            if (ficheros[opcion].isDirectory()) {
                
            }
        } else {
            System.out.println("Error-Seleccionado un ficjero");
        }

        else {
            System.out.println("Error-Opcion Incorrecta");
        }



    }





}
