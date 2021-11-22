package Ejercicio_array_base;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        int[] aleatorios =new int[30];
        int suma=0;
        double media=0;

        for (int i = 0; i < aleatorios.length;i ++){
            //int aleatorio=(int) (Math.random()*11)
                    aleatorios[i] = (int) (Math.random()*11);
        }

        for (int item:aleatorios){
        suma += item;
        }

        media=(double) suma/ (double) aleatorios.length;

        System.out.println("La suma es ;" +suma);
        System.out.println("Media de puntos ;" +media);
//falta los %



    }

}

