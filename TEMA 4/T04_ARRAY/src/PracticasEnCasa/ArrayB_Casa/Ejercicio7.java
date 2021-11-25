package PracticasEnCasa.ArrayB_Casa;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        String ingrPalabra[] = new String[10];
        Scanner entradaTexto = new Scanner(System.in);
        int opcion = 0;
        int sumaLetras = 0;
        int acuMasLetras = -99999, acuMenosLetras = 99999;





            for (int i = 0; i < ingrPalabra.length; i++) {
                System.out.printf("Ingrese la palabra %d %n", i + 1);
                ingrPalabra[i] = entradaTexto.nextLine();

            }

        do {

            System.out.println("Ingrese el nro de la opción deseada :");
            System.out.println("0 Ingrese 0 para salir");
            System.out.println("1 Ver todas las palabras: mostrarla todas las palabras del array");
            System.out.println("2 Obtener una palabra al azar: mostrará una palabra de las que existen en el array");
            System.out.println("3 Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras");
            System.out.println("4 Ver media de letras: mostrará el número medio de letras entre todas las palabas");
            System.out.println("5 Ver palabra con más letras");
            System.out.println("6 Ver palabra con menos letras");

            opcion = entradaTexto.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Salió del programa");
                    break;

                case 1:
                    for (int i = 0; i < ingrPalabra.length; i++) {
                        String palConvert = ingrPalabra[i];
                        System.out.printf("Palabra %d %s %n ", i + 1, palConvert);
                    }
                    break;
                case 2:
                    int aleatorio = (int) (Math.random() * 10);
                    System.out.printf("La palabra aleatoria es: %n" ,ingrPalabra[aleatorio]);
                    break;
                case 3:

                    for (String item : ingrPalabra) {
                        sumaLetras += item.length();
                    }
                    System.out.printf("El número total de letras es: %n" , sumaLetras);
                    break;
                case 4:
                    for (String item : ingrPalabra) {
                        sumaLetras += item.length();

                    }
                    System.out.printf("La media de letras es: %n" , (sumaLetras /= ingrPalabra.length));

                    break;
                case 5:


                    int contMas = 0;
                    int contAcuMas = 0;
                    for (String palMasLetra : ingrPalabra) {
                        contMas++;
                        if (palMasLetra.length() > acuMasLetras) {
                            acuMasLetras = palMasLetra.length();
                            contAcuMas = contMas;
                        }
                    }

                    System.out.printf("La palabra con mas letras es la  %d con %d letras %n ", contAcuMas, acuMasLetras);

                    break;
                case 6:
                    int contMenos = 0;
                    int contAcuMenos = 0;
                    for (String palMenosLetra : ingrPalabra) {
                        contMenos++;
                        if (palMenosLetra.length() < acuMenosLetras) {
                            acuMenosLetras = palMenosLetra.length();
                            contAcuMenos = contMenos;
                        }
                    }

                    System.out.printf("La palabra con menos letras es la  %d con %d letras %n", contAcuMenos, acuMenosLetras);

                    break;


                default:
                    break;
            }
        } while (opcion!=0);
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