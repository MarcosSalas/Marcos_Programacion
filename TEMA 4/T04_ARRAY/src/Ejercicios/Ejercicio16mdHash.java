package Ejercicios;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

//Ejercicios ArrayList / HashTable
public class Ejercicio16mdHash {
    public static void main(String[] args) {

        Scanner entradaTexto = new Scanner(System.in);
        ArrayList<Object[]> listaCoches = new ArrayList(); //si en la parte<Objet[]> no tipamos asi, toma como q es un Objet y no un objet[]
//        Hashtable<String,Object[]> listaCoches=new Hashtable();
        Object coches[] = null;
        int opcion = 0;

        do {
            System.out.println("***Ingresa la opción deseada***");
            System.out.println("Opción 1 Añade coches");
            System.out.println("Opción 2 Lista de coches");
            System.out.println("Opción 3 Buscar coche");
            System.out.println("Opción 4 Mostrar costes");
            System.out.println("Opción 5 Eliminar coche");
            System.out.println("Opción 6 Vaciar garaje");
            System.out.println("Opción 0 PARA SALIR");
            opcion = entradaTexto.nextInt();


            switch (opcion) {
                case 0:
                    break;
                case 1:


                    break;
                case 2:




                    break;
                case 3:




                    break;
                case 4:

                    break;
                case 5:






                    break;
                case 6:


                    break;

            }
            if (opcion<0 ||opcion>6) {
                System.out.println("Nro incorrecto, ingrese un número del 0 al 6");
            }
        } while (opcion != 0);
        System.out.println("Salió del programa");


    }
}
