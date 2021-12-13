package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
//Ejercicios ArrayList / HashTable
public class Ejercicio16md {
    public static void main(String[] args) {

        Scanner entradaTexto=new Scanner(System.in);
        ArrayList<Object[]> listaCoches =new ArrayList();
        Object coches []=null;

        System.out.println("Ingresa la opcion deseada");
        System.out.println("Opcion 1 Añade coches");
        System.out.println("Opcion 2 Lista de coches");
        System.out.println("Opcion 3 Buscar coche");
        System.out.println("Opcion 4 Mostrar costes");
        System.out.println("Opcion 5 Eliminar coche");
        System.out.println("Opcion 6 Vaciar garaje");
        int opcion=entradaTexto.nextInt();


        do {

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la marca");
                    String marca= entradaTexto.next();
                System.out.println("Ingrese la modelo");
                    String modelo= entradaTexto.next();
                System.out.println("Ingrese la coste");
                    int coste= entradaTexto.nextInt();
                System.out.println("Ingrese la matricula");
                    String matricula= entradaTexto.next();

                coches=new Object[]{marca,modelo,coste,matricula};

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
        } while (opcion!=0);



    }
}
