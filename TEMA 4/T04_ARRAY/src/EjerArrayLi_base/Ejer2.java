package EjerArrayLi_base;

import ArrayLi.ColeccionesTipadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
        ArrayList <Integer>numerosEnt=new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int numeroAlea, suma=0, max=-99999, min=90000;
        double media=0.0;

        System.out.println("Escribe el nro de posiciones");
        numeroAlea=entrada.nextInt();
        for (int i = 0; i < numeroAlea; i++) {
            numerosEnt.add((int)(Math.random()*101));
        }
        System.out.println(numerosEnt);

        double acumulador=0;
        for (int item:numerosEnt) {
            if (item>max) {
                max=item;
            }
            if (item<min) {
                min=item;
            }
            acumulador+=item;
        }
        //el sort ordena y nos dice el max y el min
        Collections.sort(numerosEnt);
        Collections.max(numerosEnt);
        Collections.min(numerosEnt);

     //falta VER EN EJERCICIOS

        System.out.println(max);
        System.out.println(min);
        System.out.println(acumulador);

    }
}

//Crea un ArrayList de numeros enteros que guarde valores aleatorios (entre 0 y 100). Una vez introducidos todos calcula la suma, la media, el máximo y el mínimo de esos números.