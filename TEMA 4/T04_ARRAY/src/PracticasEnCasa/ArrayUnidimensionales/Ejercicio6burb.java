package PracticasEnCasa.ArrayUnidimensionales;
import java.util.Scanner;

class Ejercicio6_burb {
    public static void main(String[] args) {

        Scanner longiArray= new Scanner(System.in);
        System.out.println("ingrese la LONGITUD");
        int nElementos=longiArray.nextInt();

        int arreglo []= new int[nElementos];
        int aux;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Introduzca los datos del Array");
            arreglo[i]= longiArray.nextInt();
        }

        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("\nArreglo ordenado en forma creciente:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
       // System.out.println("");


        System.out.println("\nArreglo ordenado en forma decreciente");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

    //    System.out.println("");










    }
}

/*
 el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente







pida al usuario que introduzca todos los datos del array mueva una posición todos los elementos.





pida por teclado la longitud de un array cree el array de enteros de la longitud introducida




 */