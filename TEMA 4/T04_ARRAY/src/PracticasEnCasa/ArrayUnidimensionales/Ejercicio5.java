package PracticasEnCasa.ArrayUnidimensionales;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner longiScan = new Scanner(System.in);
        int longiUno = 0;

        do {

            System.out.printf("Ingrese la LONGITUD del 1er y 2do array %n");
            System.out.printf("Ingrese O para salir %n");
            longiUno = longiScan.nextInt();

            //se ingresa un solo Scaner porque la longitud tiene que ser la misma para que se calcule, es decir si el primero ponemos 4
            //el segundo tiene que ser 4, si es 6 falla.para evitar eso ponemos un solo Scaner y reutilizamos para los 3 la variable obtenida

            int arrayUno[] = new int[longiUno];
            int arrayDos[] = new int[longiUno];
            int arrayTres[] = new int[longiUno];

            int i;

            for (i = 0; i < arrayUno.length; i++) {
                arrayUno[i] = (int) (Math.random() * 60);
            }
            for (i = 0; i < arrayDos.length; i++) {
                arrayDos[i] = (int) (Math.random() * 60);
            }

            if (longiUno != 0) {

                for (i = 0; i < arrayTres.length; i++) {
                    arrayTres[i] = arrayUno[i] + arrayDos[i];
                }
                System.out.printf("ARRAY UNO %n");
                for (i = 0; i < arrayUno.length; i++) {
                    System.out.printf("Nro %d %n", arrayUno[i]);
                }
                System.out.println();
                System.out.printf("ARRAY DOS %n");
                for (i = 0; i < arrayDos.length; i++) {
                    System.out.printf("Nro %d %n", arrayDos[i]);
                }
                System.out.println();
                System.out.printf("ARRAY TRES %n");
                for (i = 0; i < arrayTres.length; i++) {
                    System.out.printf("Nro %d %n", arrayTres[i]);
                }
                System.out.println();
            }
        } while (longiUno != 0);
        System.out.println("Has salido \n");
    }
}
/*
(SumaArrays) Crear una aplicación que:

pida la longitud de dos arrays de enteros
crea los array de enteros con las longitudes introducidas
crea un tercer array de la misma longitud que los dos anteriores
rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)
 */




