package PracticasEnCasa.ArrayB_Casa;
import java.util.Scanner;

public class Ejercio1 {
    public static void main(String[] args) {

    Scanner lecturaTeclado = new Scanner(System.in);
    int[] palabra = new int[10];

int i;
//si en palabra.length uso un 10 reemplazaría lo que me pide, porque el Array entra desde el 0 al 9
//el valor de palabra es el tamaño del array, en este caso es 10,si a i lo inicializaramos en un valor por encima de palabra,no entraría
        for ( i =0; i < palabra.length; i++) {
            //si o si para ocupar el valor del array y compararlo tiene que ser con el length si solo ponemos el nombre del array no funciona
            System.out.println("ingrese el nro ");
            int nro = lecturaTeclado.nextInt();
            palabra[i]=nro;
            //cuando ponemos como en este caso,el valor que le asignaríamos de la variable nro que ingrese por teclado el usuario seria para cada celda del array
        }
//si en palabra.length uso un 9 reemplazaría lo que me pide x q es menor o igual y cumpliria los 10 numeros del array
        for(i = 0; i <= palabra.length; ++i) {
            System.out.printf("%d : %d%n", i, palabra[i]);
            //al hacer otro for como acá,podemos mostrar cada celda que se guardo en el array,si estuviera afuera solo imprimiriamos una sola celda
        }

    }


}


   /* Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará
        el contenido de ese array junto al índice (0 – 9)*/