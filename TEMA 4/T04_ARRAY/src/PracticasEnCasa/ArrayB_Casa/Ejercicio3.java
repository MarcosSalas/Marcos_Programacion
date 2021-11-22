package PracticasEnCasa.ArrayB_Casa;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {


        int[]nroArray=new int[10];
        //me puedo confundir con el tamaño del array que si bien es de 10 celdas, la condición siempre tiene que ir en base de 0 a 9

        Scanner ingresaNro= new Scanner(System.in);

        int i;
        for ( i = 0; i < nroArray.length; i++) {
            System.out.println("ingrese el nro ");
            int nro = ingresaNro.nextInt();
            nroArray[i]=nro;
        }
        System.out.printf("INVERSO: %n");
        //si yo inicializo la variable i en 10 cuando imprima el array voy a tener que poner nroArray[-1],porque la posición 10 no la tiene,tiene del 0 al 9
        for ( i = 9; i >=0; i--) {
            System.out.printf(" posición %d nro %d %n",i,nroArray[i]);
        }

        System.out.printf("ORDEN NORMAL: %n");

        for (i =0; i <=9;i++){
            System.out.printf(" posición %d nro %d %n",i,nroArray[i]);

        }

    }

}
    /*Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:

        en orden inverso, es decir, el primero que se introduce es el último en mostrarse
        en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/