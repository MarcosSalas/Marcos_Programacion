package ArrayList;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        char []abecedario= {'a','b','c','d','e','f','g','h','i','j','k','l','m','ñ','o','p','q','r','s','t','u','v','w','y','z'};


        Scanner pIntroducida = new Scanner(System.in);
        int longitud =0;
        //String[] arrayString = new String[longitud];   **PORQUE ASI NO,SI PIDE CREAR UN ARRAY STRING
        int opcion = 0;


        //igrese la longitud
            System.out.println("Cuantas palabras quieres guardar");
             longitud=pIntroducida.nextInt();

             //luego de obtener la longitud, generar la palabra con las letras del array 1 del tamaño ya indicado(COMO)?

        //luego de generar esa palabra se guarda en el array 2, CREO Q POR ESO SE HACEN 2 FOR ANIDADOS


   //para formar (Rellenar el array) palabras aleatoreas y ponerlas en una posición lo tengo que hacer con un FOR
        //
 //    char abecedario1=abecedario[(int)(Math.random()* abecedario.length)];//el match random seria int x q es una posicion no un char

        for (int i = 0; i < longitud; i++) {
            System.out.println("Palabra " +i);
            System.out.println("Cuantas letras tiene la palabra");
            int letras= pIntroducida.nextInt();
            String palabra ="";   //MISMA PREGUNTA DE ARRIBA
            for (int j = 0; j < letras; j++) {
                char letrasAleatoria=abecedario
                        [(int) (Math.random()*abecedario.length)];
                //POR CADA ITERACION TOMA UNA LETRA DEL ABECEDARIO , LA GUARDA EN letrasAleatoria, que ese a su vez lo guarda en cada posición del array PALABRA?
                palabra+=letrasAleatoria;

            }
            System.out.println(palabra);
        }











    }
}
