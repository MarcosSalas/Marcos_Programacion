package Ejercicio_Ejer.Multidimensionales;

import java.util.Scanner;

public class SumaAristas {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);

        int filas, columnas;
        int sumatorioFila1 = 0, sumatorioFilaN = 0, sumatorioColumna1 = 0, sumatorioColumnaN = 0;
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
            for (int j = 0; j < numerosAleatoreos[i].length; j++) {
                //columnas
                numerosAleatoreos[i][j] = (int) (Math.random() * 21);
                System.out.print(numerosAleatoreos[i][j] + " ");
            }
            System.out.println();

        }
      /*  for (int i = 0; i < numerosAleatoreos.length; i++) {
            for (int j = 0; j < numerosAleatoreos[i].length; j++) {

                if (i == 0) {
                    sumatorioFila1 += numerosAleatoreos[i][j];
                }

                if (i == filas - 1) {
                    sumatorioFilaN += numerosAleatoreos[i][j];
                }
                if (i == 0) {
                    sumatorioColumna1 += numerosAleatoreos[i][j];
                }

                if (i == filas - 1) {
                    sumatorioColumnaN += numerosAleatoreos[i][j];
                }

            }


        }*/

        // el el forich a diferencia del for , se tiene que poner el int []

        int numeroFila=0;

        for (int [] fila : numerosAleatoreos){

           if (numeroFila==0){
               for (int columna:fila) {
                   if (numeroFila==0){
                       sumatorioFila1+=columna;
                   }
                  if (numeroFila==filas-1){
                      sumatorioFila1+=columna;

                  }

               }

           }



            numeroFila++;
        }


        System.out.println("La suma de la primera fila es " + sumatorioFila1);
        System.out.println("La suma de la primera fila es " + sumatorioFilaN);
        System.out.println("La suma de la primera fila es " + sumatorioColumna1);
        System.out.println("La suma de la primera fila es " + sumatorioColumnaN);

    }

}
