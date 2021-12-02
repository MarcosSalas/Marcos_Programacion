package ArrayList;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        char []abecedario= {'a','b','c','d','e','f','g','h','i','j','k','l','m','ñ','o','p','q','r','s','t','u','v','w','y','z'};

        char abecedario1 = 's';
        Scanner pIntroducida = new Scanner(System.in);
        int longitud = 0;
        String[] arrayString = new String[longitud];
        int opcion = 0;

        do {
            System.out.println("Cuantas palabras quieres guardar");
            System.out.println("1 longitud de palabra 1");
            System.out.println("2 longitud de palabra 2");
            System.out.println("3 longitud de palabra 3");


            switch (opcion) {
                case 1:
                    System.out.println("Cual es la longitud de la palabra 1");
                    longitud=pIntroducida.nextInt();
                    char abecedario1=abecedario[(int)(Math.random()* abecedario.length)];//el match random seria int x q es una posicion no un char


                    break;
                case 2:
                    System.out.println("Cual es la longitud de la palabra 2");
                    break;
                case 3:
                    System.out.println("Cual es la longitud de la palabra 3");
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        } while (opcion != 0);

        System.out.println("Las palabras heredadas son");
        System.out.println();
        System.out.println();
        System.out.println();


    }
}
