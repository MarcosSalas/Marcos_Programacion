package Ejercicio_Ejer.Multidimensionales;

import java.util.Scanner;

public class SumaAristas {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);

        int filas, columnas;
        //tiene que ingresar el usuario
        int numerosAleatoreos[][];

        System.out.println("Cuantas filas tendra");
        filas = lecturaTeclado.nextInt();
        System.out.println("Cuantas columnas tendra");
        columnas = lecturaTeclado.nextInt();
        numerosAleatoreos = new int[filas][columnas];

        //si yo pregunto por el lenght me dice el nro de filas , si yo en lugar de lenght pongo 0 me da el nro de columnas.
        //si pongo[0].lenth la primera fila que longitud tiene.

        for (int i = 0; i < numerosAleatoreos.length; i++) {
            //filas
            for (int j = 0; j <numerosAleatoreos[i].length ; j++) {
                //columnas
                numerosAleatoreos[i][j]=(int)Math.random()*21;
                System.out.println(numerosAleatoreos[i][j] + "\t");
            }
            System.out.println();

            
            
        }

    }

}
