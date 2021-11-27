package PracticasEnCasa.ArrayUnidimensionales;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        int arrayAsignado=1;
        int acuMayor=-99999;
        int acuMenor= 99999;
        do {

        Scanner ingresoLongi = new Scanner(System.in);
        System.out.println("ingrese la LONGITUD del array mayor a 0, ingrese 0 para salir ");
        arrayAsignado= ingresoLongi.nextInt();



        int arrayEnter[]=new int[arrayAsignado];


        for (int i = 0; i < arrayEnter.length; i++) {
            System.out.printf("ingrese los DATOS del array %d mayor a 0 %n",i+1);
            arrayEnter[i]= ingresoLongi.nextInt();

            if (arrayEnter[i]>acuMayor) {
                acuMayor=arrayEnter[i];
            }
            if (arrayEnter[i]<acuMenor){
                acuMenor=arrayEnter[i];
            }
        }
            System.out.println();
            if (arrayAsignado!=0) {
                System.out.printf("el elemento mayor es el %d %n", acuMayor);
                System.out.printf("el elemento menor es el %d %n",acuMenor);
                System.out.println();
            }


    } while (arrayAsignado!=0);


        System.out.println("Salio del programa");
    }
}

/*
(MayorArray) Crea una aplicación que realice lo siguiente:

pida por pantalla la longitud del array de enteros crea el array de enteros con la longitud introducida
pida al usuario que introduzca todos los datos del array saque por pantalla el elemento mayor y el elemento menor



 */