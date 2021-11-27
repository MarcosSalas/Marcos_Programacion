package PracticasEnCasa.ArrayUnidimensionales;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner longiArray= new Scanner(System.in);
        System.out.println("ingrese la LONGITUD");
        int lgtudArray=longiArray.nextInt();

        int arrayUser []= new int[lgtudArray];

        for (int i = 0; i < arrayUser.length; i++) {
            System.out.println("Introduzca los datos del Array");
            arrayUser[i]= longiArray.nextInt();
        }
        for (int i = 0; i < arrayUser.length; i++) {

            if (arrayUser[i]==0) {


            }
        }
    }
}

/*
 el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente







pida al usuario que introduzca todos los datos del array mueva una posición todos los elementos.





pida por teclado la longitud de un array cree el array de enteros de la longitud introducida




 */