package PracticasEnCasa.ArrayUnidimensionales;

public class Ejercicio2 {

    public static void main(String[] args) {

        String[] temario={"Tema 1: Introducción","Tema 2 : Identificadores","Tema 3: Estructuras","Tema 4: Colecciones","Tema 5: Orientación a objetos","Tema 6: Clases y Objetos","Tema 7 : Abstracción, Herencia y Polimorfismo","Tema 8: Ficheros y Excepciones","Tema 9: Base de datos","Tema 10: Interfaces"};

        System.out.printf("Numero de temas: 10 %n");
        for (int i = 0; i < temario.length; i++) {
            System.out.println (String.format("%s",temario[i]));

        }
/*
   int [] numeros = {1,2,3,4,5,6,7,8,9,10}
        for (int i = 0; i < numeros.length;i++){
            System.out.println (String.format(“La posición %d tiene asignado el valor %d",i,numeros[i]));
        }
 */




    }
}
/*
(Temario) Crear un array de Strings llamado temario que tendrá de forma inicial los siguientes valores:
"Tema 1: Introducción","Tema 2: Identificadores","Tema 3: Estructuras","Tema 4: Colecciones",
"Tema 5: Orientación a objetos", "Tema 6: Clases y Objetos", "Tema 7; Abstracción, Herencia y Polimorfismo",
"Tema 8: Ficheros y Excepciones", "Tema 9: Bases de datos", "Tema 10: Interfaces". La salida del programa deberá ser la siguiente

Se deberá mostrar por pantalla la siguiente salida

SALIDA
````
Número de temas: 10
Tema 1: Introducción
Tema 2: Estructuras de datos
Tema 3: Estructuras
Tema 4: Colecciones
Tema 5: Orientación a objetos
Tema 6: Clases y Objetos
Tema 7; Abstracción, Herencia y Polimorfismo
Tema 8: Ficheros y Excepciones
Tema 9: Bases de datos
Tema 10: Interfaces
````
 */