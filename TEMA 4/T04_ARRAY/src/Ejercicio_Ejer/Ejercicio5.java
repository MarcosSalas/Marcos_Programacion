package Ejercicio_Ejer;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] arrayUno,arrayDos,arrayTres;
        Scanner lecturaTeclado = new Scanner(System.in);

        int numeroIntro=lecturaTeclado.nextInt();
        System.out.println("Ingtrde la longitud");
        int longitud = lecturaTeclado.nextInt();

        arrayUno =new int [longitud];
        arrayDos=new int[longitud];
        arrayTres= new int[longitud];

        for (int i = 0; i < longitud; i++) {
            arrayUno[i]=(int) (Math.random()*21);
            arrayDos[i]=(int) (Math.random()*21);
            arrayTres[i]=arrayUno[i]+arrayDos[i];
            System.out.println("Los numeros del tercer array son: "+arrayTres[i]);

            }
        lecturaTeclado.close();




    }







}
