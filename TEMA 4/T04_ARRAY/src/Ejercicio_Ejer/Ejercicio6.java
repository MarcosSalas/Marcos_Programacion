package Ejercicio_Ejer;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroIntro=lecturaTeclado.nextInt();
        System.out.println("Ingtrde la longitud");
        int longitud = lecturaTeclado.nextInt();



       int ultimo = numeros[numeros.length-1];
       int primero = numeros[0];

        for (int i = 0; i< numeros.length-1; i++) {

            numeros[i] =numeros[i+1];

        }
        numeros[numeros.length-1]=primero;


        for (int item:numeros){
            System.out.println(item+ " ");
        }

        /*solamente el lenght lo usamos para sacar el ultimo numero del array , el 1er nro es 0,es decir
        minimo[0]
                maximo[lenght-1]*/

    }











}
