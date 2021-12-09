package ArrayLi;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner fraseIng=new Scanner(System.in);
        String palabraMax="";
        String palabraMin="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println("ingrese la frase");
      //  frase=fraseIng.nextLine();   //tiene tamaño fino no se puede por eso la creamos directamente
        String frase="Esto es una frase para poder trabajar el ejercicio numero 8";
        String[]palabras=frase.split(" ");
        //si pongo palabras[6],saco la posicion de la palabra 6
        //para ir preguntando 1 a 1 es mas facil con el foreach


        //para saber cuales son las logitudes 2 preguntas
        //si no tengo que modificar el interior de palabra es el foreach
        //si tengo que modificar es el for
        for (String item:palabras) {
            if (item.length()>palabraMax.length()) {
                palabraMax=item;
            }
            if (item.length()<palabraMin.length()) {
                palabraMin=item;
            }
            if (item.length()==4) {
                System.out.println(item);
            }


/*           LO MISMO PERO CON UN FOR


            for (int i = 0; i < palabras.length; i++) {
               if( palabras[i].length()>palabraMax.length()){
                   palabraMax=palabras[i];
                }
               if (palabras[i].length()<palabraMin.length()){
                   palabraMin=palabras[i];

               }
                if (palabras[i].length()==4) {
                    System.out.println(palabras[i]);
                }

            }

*/


            System.out.println("la mas grande es " + palabraMax);
            System.out.println("la mas pequeña es " + palabraMin);



        }





    }

}
