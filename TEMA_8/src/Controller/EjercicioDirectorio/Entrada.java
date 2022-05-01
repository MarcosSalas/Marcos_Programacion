package Controller.EjercicioDirectorio;



import java.io.File;

public class Entrada {
    public static void main(String[] args) {
        // RUTA DE CASA
        //C:\Users\marco\OneDrive\Escritorio\ficheros
        File file=null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\FicheroEjemplo.txt");

        File directory=null;
        directory =new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");


        FicheroClase ficherosClase =new FicheroClase(); //nombre de la clase a la que quiero listar
        ficherosClase.getFileInfo(directory);



    }

}
