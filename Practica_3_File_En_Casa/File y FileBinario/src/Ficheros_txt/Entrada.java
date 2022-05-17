package Ficheros_txt;

import Ficheros_txt.controller.EjercicioController;
import Ficheros_txt.controller.FicherosController;

import java.io.File;


public class Entrada {

    public static void main(String[] args) {
    //VA la CREACION DE LOS OBJETOS de tipo FILE"
        File file = null;
        File file1 =null; //ver si está bien
        File directory = null;
        File directory2 = null;
        file = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\ficheros\\fichero.txt");

        file1= new File("C:\\Users\\marco\\OneDrive\\Escritorio\\ficheros\\ficherorw.txt");

        File file2 = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\ficheros\\ficheroEscritura.txt");
        File file3 = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\ficheros\\ficheroEscrituraCompleto.txt");
        directory = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\ficheros");
        directory2 = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\ficheros_nuevo");

         EjercicioController ejercicioController = new EjercicioController();
        // ejercicioController.listaParentDirectory();

        FicherosController ficherosController = new FicherosController();
       // ficherosController.getFileInfo(file);
       // ficherosController.getDirectoryInfo(directory);  //OJO acá llamo al método ## DirectoryInfo pero le paso la variable directory ##, ## NO file ## como figura en el Ficheros.Controller
        //ficherosController.getDirectoryInfo(directory2);

        //ficherosController.lecturaFichero(file);

       // ficherosController.cifrarLinea();
      //  ficherosController.escrituraFichero(file2);
        ficherosController.escribirFicheroCompleto(file3);

        ejercicioController.ejercicioLecturaEscritura(file1);



    }





}
