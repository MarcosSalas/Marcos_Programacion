package FicherosTexto.controller;

import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("C:\\\\Users\\\\Usuario DAM1\\\\Desktop\\\\Ficheros\\\\FicheroEjemplo.txt");
        File file2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros1\\Ficheros1\\fichero1.1.txt");
        File file3 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros1\\Ficheros1\\fichero1.2.txt");
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros1\\Ficheros1");
        directory2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2");



        /*
        File file=null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\FicheroEjemplo.txt");

        File directory=null;
        directory =new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");

       *
        * */




        FicherosController ficherosController = new FicherosController();
        //ficherosController.getFileInfo(file);
        //ficherosController.getDirectoryInfo(directory2);
        //ficherosController.lecturaFichero(file);
        //ficherosController.lecturaBuffer(file);
        //ficherosController.escrituraFichero(file2);
        ficherosController.escribirFicheroCompleto(file3);





    }
}