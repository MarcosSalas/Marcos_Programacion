package PracticasEnCasa.ArrayUnidimensionales;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner ingresaTexto=new Scanner(System.in);
        //la palabra mas larga y mas corta se trabaja como un máximo y mínimo.
        String pLarga="";
        String pCorta="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        //*******                  ver preguta

        //System.out.println("ingresa la frase");
       // String frase=ingresaTexto.next();
        String frase="Hola esta es una frase de prueba para poder trabajar con el ejercicio 8";
        //el SPLIT ES PARA SEPARAR sea una palabra de una frase, un nombre de usuario en un
        // mail o lo que queramos a través de lo que se indica entre comillas, en este caso un espacio en blanco
      //  String arrayLeeP[]=new String[null]; ESTO NO SE HARÍA
      String arrayLeeP[]=frase.split(" ");

        for (String item:arrayLeeP) {
            if (item.length() > pLarga.length()) {
                pLarga = item;

            }
            if (item.length()<pCorta.length()){
                pCorta =item;
            }
            if (item.length()==4) {
                System.out.println("palabra de 4 caracteres " +item);
            }

        }
        System.out.println("la palabra mas larga " +pLarga);
        System.out.println("la palabra mas corta " +pCorta);

    }
}


//(FraseArray) Crear un programa que lea por teclado una frase. Con la frase leída
// crear un array de String con cada una de las palabras que forman parte de la frase.
// Una vez introducida el programa mostrará:
//La palabra más larga
//La palabra más corta
//La palabra o palabras que tienen exactamente 4 caracteres