package Ejercicio_Ejer;
import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int longitud;
        int[] numeros;
        int max=-99999, min=99999;

        System.out.println("De que longitud quieres crear el array");
        longitud=lecturaTeclado.nextInt();
        numeros =new int[longitud];

        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Por favor introduce el nro");
            int numeroIntro=lecturaTeclado.nextInt();
            numeros[i]=numeroIntro;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<min){
                min = numeros[i];
            }
            if (numeros[i]>max){
                max =numeros[i];
            }
        }
        for (int item:numeros) {
            System.out.println(item);

        }
        System.out.println("Ordenados");

        Arrays.sort(numeros);
        //el sort compara entre 2 si es mas grande el nro de la derecha q el de la izquierda lo da vuelta,se aplica 2 for para hacerlo
        //

        for (int item:numeros) {
            System.out.println("item");

        }
        System.out.println("El mayor es" +numeros[numeros.length-1]);
        System.out.println("El menor es" +numeros[0]);


        //segunda opcion de como hacerlo
        /*
        for (int item:numeros) {
            if (numeros[item]<min) {
                min = numeros[item];
            }
            if (numeros[item]>max){
                max =numeros[item];}

        }
*/





    }

}
