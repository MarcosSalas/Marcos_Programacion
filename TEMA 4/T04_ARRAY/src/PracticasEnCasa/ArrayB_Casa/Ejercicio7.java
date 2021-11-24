package PracticasEnCasa.ArrayB_Casa;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {

        String ingrPalabra[]=new String[10];
        Scanner entradaTexto= new Scanner(System.in);
        int opcion=0;

        for (int i = 0; i < ingrPalabra.length; i++) {
            System.out.printf("Ingrese la palabra %d %n",i+1);
            ingrPalabra[i]= entradaTexto.nextLine();
        }

        System.out.println("Ingrese el nro de la opción deseada");
        System.out.println("1 Ver todas las palabras: mostrarla todas las palabras del array");
        System.out.println("2 Obtener una palabra al azar: mostrará una palabra de las que existen en el array");
        System.out.println("3 Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras");
        System.out.println("4 Ver media de letras: mostrará el número medio de letras entre todas las palabas");
        System.out.println("5 Ver palabra con más letras");
        System.out.println("6 Ver palabra con menos letras");

        opcion= entradaTexto.nextInt();

        switch (opcion) {
            case 1:
                for (int i = 0; i < ingrPalabra.length; i++) {
                    String palConvert=ingrPalabra[i];
                    System.out.printf("Palabra %d %s %n ",i+1,palConvert);
                }
                break;
            case 2:
                   int aleatorio=(int)(Math.random()*10);
                    System.out.println("La palabra aleatoria es: " + ingrPalabra[aleatorio]);


                break;
            default:
                break;
        }





    }
}
/*
. Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
	- Ver todas las palabras: mostrarla todas las palabras del array
	- Obtener una palabra al azar: mostrará una palabra de las que existen en el array
	- Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
	- Ver media de letras: mostrará el número medio de letras entre todas las palabas
	- Ver palabra con más letras
	- Ver palabra con menos letras

 */