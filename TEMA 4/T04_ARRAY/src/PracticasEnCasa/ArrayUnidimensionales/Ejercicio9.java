package PracticasEnCasa.ArrayUnidimensionales;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        char arrayChar[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner ingreText=new Scanner(System.in);
        System.out.println("ingrese la longitud,(cuantas palabras va a ingresar)");
        int longiIng=ingreText.nextInt();
        String longiTot[]=new String[longiIng];
      //  int nro=0;                                         MAL  VER ABAJO
        for (int i = 0; i < longiTot.length; i++) {
            System.out.printf("ingrese la longitud por palabra, palabra %d %n",i+1);
            int longiPal=ingreText.nextInt();
            String palabra="";
            for (int j = 0; j < longiPal; j++) {
                palabra+=arrayChar[(int) (Math.random()*arrayChar.length)];  //para hacer un match.random de un ARRAY STRING o CHAR se debe hacer así


               // nro=(int)(Math.random()*27);   NO SE PUEDE HACER ESTO PORQUE LA EL ARRAY ES DE TIPO CHAR Y EN TODO CASO COMPATIBLE CON STRING U OBJET
               // longiTot[j]=arrayChar[nro];

            }

            System.out.printf("%d. %s %n",i+1,palabra);
        }

    }
}
//(GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
//Crear un array de chars con todas las letras del abecedario.
//Crear un array de String con una longitud pedida por teclado
//Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2.
// Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada
// (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
//Imprimir por pantalla las palabras generadas
//ENTRADA/SALIDA
//Cuantas palabras quieres guardar: 3
//Cual es la longitud de la palabra 1: 4
//Cual es la longitud de la palabra 2: 6
//Cual es la longitud de la palabra 1: 3
//Las palabras generadas son:
//1. hero
//2. hasdgh
//3. rio
