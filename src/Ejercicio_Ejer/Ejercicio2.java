package Ejercicio_Ejer;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[]args){
        Scanner lecturaTeclado = new Scanner(System.in);

        int numeroIntro=0;
        double media=0,suma=0;
        int [] numeros=new int[5];

        for (int i = 0; i <numeros.length; i++) {
            System.out.println("introduce el nro");
            numeroIntro=lecturaTeclado.nextInt();
            numeros[i]=numeroIntro;
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=numeros[i]*2;

        }
        //System.out.println(numeros);  mal x q imprime el espacio de memoria en el array
        for (int item : numeros) {
            suma+=item;

        }
        System.out.println("la suma de los nros es"+suma);
        System.out.println("la media de los es"+suma/(double) numeros.length);

    }

}
