package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

//Ejercicios ArrayList / HashTable
public class Ejercicio16mdHash {
    public static void main(String[] args) {

        Scanner entradaTexto = new Scanner(System.in);
        ArrayList<Object[]> listaCoches = new ArrayList(); //si en la parte<Objet[]> no tipamos asi, toma como q es un Objet y no un objet[]
        Object coches[] = null;
        int opcion = 0;

        do {
            System.out.println("Ingresa la opcion deseada");
            System.out.println("Opcion 1 Añade coches");
            System.out.println("Opcion 2 Lista de coches");
            System.out.println("Opcion 3 Buscar coche");
            System.out.println("Opcion 4 Mostrar costes");
            System.out.println("Opcion 5 Eliminar coche");
            System.out.println("Opcion 6 Vaciar garaje");
            opcion = entradaTexto.nextInt();


            switch (opcion) {
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
        } while (opcion != 0);


    }
}
