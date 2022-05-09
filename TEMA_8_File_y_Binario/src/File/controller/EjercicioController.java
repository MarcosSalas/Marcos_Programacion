package File.controller;

import java.io.*;
import java.util.Scanner;

public class EjercicioController {
    //lee palabras sueltas
    Scanner scanner = new Scanner(System.in);
    //lee lineas enteras
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//1 ademas del escaner me creo el bufferedReader,Importo la clase

    public void listaParentDirectory() {
        File file = new File("C:\\Users\\marco\\OneDrive\\Escritorio\\ficheros\\ficheros_Ejercicio");
        //     ↑
        //cuidado el file de arriba tiene que coincidir con el file de abajo,el mismo nombre
        //    ↓
        File[] ficherosParent = file.listFiles();
        System.out.println("Imprimiendo Padre = " + file.getName());

        int contador = 0;
        int opcion=0;
        for (File/*2)de File*/ fichero : ficherosParent  /*1)Array de que ← */) {
            if (!fichero.isHidden()) { //## Hidden ( OCULTO ) ###  //Para sacar en linux el DS.STORE que es oculto
                System.out.println(contador + " - " + fichero.getName()); //queremos sacar el Nombre en este caso
                contador ++;
            }
        }

        System.out.println("Que directorio quieres listar? ");
        opcion = scanner.nextInt();
        if (opcion >= 0 && opcion < ficherosParent.length) { // la longitud tiene que ser menor, no puede ser igual por q el array arranca en 0
            if (ficherosParent[opcion].isDirectory()) {
                listarChild(ficherosParent[opcion]);
            } else {
                System.out.println("Error - Es un fichero");
            }
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
    public void listarChild(File child){
        int contador=0;
        int opcion=0;
        File [] ficherosChild = child.listFiles();
        System.out.println("Listando el directorio - " +child.getName());
        for ( File childItem :ficherosChild) {
            System.out.println(contador + " - " + childItem.getName()); //    #############     NNNNNNN AAAAAAAAAAAA MMMMMMMMMMM EEEEEEEEEEEEEEEEE
            contador ++;
        }
        System.out.println(contador + " - Volver al padre ");
        System.out.println("Que opcion quieres? ");
        opcion=scanner.nextInt();
        if (opcion >= 0 && opcion <= ficherosChild.length) {
            //parent
            if (opcion == contador) {
                listarChild(child.getParentFile());
            } else {
                //child
                if (ficherosChild[opcion].isDirectory()) {
                    listarChild(ficherosChild[opcion]); //No vuelvo a poner lo que está identado abajo, este es un método que SE LLAMA ASI MISMO ---RECURSIVO
                } else {
                    System.out.println("Error - es un fichero ");
                }
            }
        } else {
            System.out.println("Opcion incorracta");
        }
    }

    public void ejercicioLecturaEscritura(File file){
        int opcion =0;
        String linea ="";
        FileWriter fileWriter=null;
        PrintWriter printWriter= null;
        //bufferedReader lector de String que va concatenando cosas ,pero es mejor el PrintWriter

    do {

        try {
            System.out.println("Introduce linea");
            linea = bufferedReader.readLine(); // 2.le asigno valor a la linea,me va a salir error,try catch
           // System.out.println(linea);
            fileWriter = new FileWriter(file,true);
            printWriter= new PrintWriter(fileWriter);
            printWriter.println(linea);
        } catch (IOException e) {
            e.printStackTrace();
        }
         finally{
            if (printWriter != null) {
                printWriter.close();
            }
        }

        System.out.println("Quieres crear más lineas? 0(no) 1 (si)");
        opcion=scanner.nextInt();

    } while (opcion!=0);

        //lectura completa del fichero

     //   FileReader fileReader = null; podria sacar esto y abajo ponerlo en una linea para ahorrar
        BufferedReader bufferedReader = null;


            try {
                bufferedReader = new BufferedReader(new FileReader(file)); //Forma resumida de ponerlo
               String lectura ="";
               String lecturaCompleta ="";
               StringBuffer lecturaBuffer = new StringBuffer("");
                while ( (lectura = bufferedReader.readLine())!=null){
                    lecturaBuffer.append(lectura+"\n");//esto es lo que me permite poner todo junto
                }
                //imprimir toda la lectura
                lecturaCompleta = lecturaBuffer.toString();
                System.out.println(lecturaBuffer.toString());


            } catch (IOException e) {
                e.printStackTrace();
            } finally{
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }






}

}
/*
     if (ficherosParent[opcion].isDirectory()) {  // es lo mismo que en el ejercicio FicherosController, es un objero de tipo File, opcion es la pocicion que me indicas
                                                         // si es directorio haré algo
                                                         // sino, no es un directorio
                File[] ficherosChild = ficherosParent[opcion].listFiles();// en el caso que sea direcctorio tengo que listar pero sobre la posicion de los "" HIJOS ""
                int contadorChild=0;
                int opcionChild=0;
                for (File child :ficherosChild) {
                    System.out.println(contadorChild + " - " + child.getName()); //recordar el get NAME de ponerlo
                    contadorChild++;
                }
                System.out.println("Que directorio quieres listar ? ");
                opcionChild=scanner.nextInt();

            } else {
                System.out.println("Error - Selecionado un fichero");
            }

 */
