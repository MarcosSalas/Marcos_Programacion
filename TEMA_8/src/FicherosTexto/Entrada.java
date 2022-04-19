package FicherosTexto;

import Controller.FicherosController;

import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {

File file=null;

File directory=null;
File directory2=null;

file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\FicheroEjemplo.txt");
       /* C:\Users\Usuario DAM1\Desktop\Ficheros*/

directory =new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");
directory2 =new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros-nuevo");


        FicherosController ficherosController =new FicherosController();


       // ficherosController.getFileInfo(file); //sobre el que diga,audio min 45 aprox
   //     ficherosController.getFileInfo(directory);
        //ficherosController.getDirectoryInfo(directory);
       // ficherosController.lecturaFichero(file);
        
        ficherosController.bufferedReader(file);
        
        
        
        

    }


}
