package Tema5_Ejercicios.Ejercicios_md.Trigonometria;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
/*
    Circulo circulo = new Circulo(12.5);
        System.out.printf("Area del circulo %.2f %n", circulo.areaCirculo());
        System.out.println("El diámetro del Circulo es " + circulo.diametroCirculo());

    Cuadrado cuadrado= new Cuadrado(10,25);
        System.out.println("Area del Cuadrado " + cuadrado.areaCuadrado());
        System.out.println("El perímetro del Cuadrado "+ cuadrado.perimetroCuadrado());

    Triangulo triangulo= new Triangulo(23,15);
        System.out.println("Area del triángulo " + triangulo.areaTriangulo());
*/
        Scanner ingTexto = new Scanner(System.in);
        int opcion = 0;
        int b, a;
        double rad;
        do {
            System.out.println("Ingrese la opción deseada del 1 al 3 y 0 para salir");
            System.out.println("1 Trabajar con triángulos");
            System.out.println("2 Trabajar con círculos");
            System.out.println("3 Trabajar con cuadrados");
            opcion = ingTexto.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Introduce base");
                    b = ingTexto.nextInt();
                    System.out.println("Introduce altura");
                    a = ingTexto.nextInt();
                    Triangulo triangulo = new Triangulo(b, a);
                    do {
                        System.out.println("¿Qué operación quieres hacer?");
                        System.out.println("1 Calcular área");
                        System.out.println("2 Mostrar datos");
                        System.out.println("0 volver atrás");
                        opcion = ingTexto.nextInt();

                        switch (opcion) {
                            case 1:
                                triangulo.areaTriangulo(); // EN EL CASO DE PONER GET AREA , EL MÉTODO TIENE QUE SER VOID Y NO DEVOLVER NADA, TENGO QUE PONER <-- esto para enviarle los valores
                                System.out.println(triangulo.getArea());  // Y RECIEN AHÍ VOY A PODER PONER EL GET
                                break;
                            case 2:
                                triangulo.mostrarDatos();  // SOLO MOSTRAMOS LOS VALORES, Y LOS PRINT EN EL MÉTODO
                                break;
                        }

                    } while (opcion != 0);
                    System.out.println("Pulsa enter para continuar");
                    ingTexto.next();
                    break;

                case 2:
                    System.out.println("Introduce el radio");
                    rad = ingTexto.nextDouble();
                    Circulo circulo = new Circulo(rad);
                    do {
                        System.out.println("¿Qué operación quieres hacer?");
                        System.out.println("1 Calcular área");
                        System.out.println("2 Mostrar diámetro");
                        System.out.println("3 Mostrar datos");
                        System.out.println("0 volver atrás");
                        opcion = ingTexto.nextInt();

                        switch (opcion) {
                            case 1:
                             //   System.out.printf("el Área del Círculo es %.2f %n", circulo.areaCirculo());  // si solo pongo asi, paso el valor y me devielve siempre y tengo q poner el return y el tipo de valor que quiero devolver
                                circulo.areaCirculo(); // pasar los valores sino no va a saber cuando imprima cuales son
                                System.out.println(circulo.getArea()); //una vez que te paso los valores al método, te pido con el get lo de adentro del mismo, en este caso,getArea.
                                break;
                            case 2:
                                // System.out.printf("el diámetro del Círculo es %.2f %n", +circulo.diametroCirculo()); MISMO CASO QUE EN 1,RECORDAR EN EL METODO PONER VOID
                                circulo.diametroCirculo();
                                System.out.println(circulo.getDiametro()); //mismo q en el 1
                                break;
                            case 3:
                                circulo.mostrarDatos(); // solo llamamos al método,porque el print está en el mismo, es decir, no iria el get
                                break;
                        }
                    } while (opcion != 0);
                    System.out.println("Pulsa enter para continuar");
                    ingTexto.next();
                    break;
                case 3:
                    System.out.println("Introduce base");
                    b = ingTexto.nextInt();
                    System.out.println("Introduce altura");
                    a = ingTexto.nextInt();
                    Cuadrado cuadrado = new Cuadrado(b, a);
                    do {
                        System.out.println("¿Qué operación quieres hacer?");
                        System.out.println("1 Calcular área");
                        System.out.println("2 Mostrar perímetro");
                        opcion = ingTexto.nextInt();

                        switch (opcion) {
                            case 1:
                                // System.out.println("el Area del Cuadrado es " + cuadrado.areaCuadrado())   MAL;POR EL CASO YA EXPLICADO
                                cuadrado.areaCuadrado();
                                System.out.println(cuadrado.getArea());
                                break;
                            case 2:
                               // System.out.println("el diámetro del Cuadrado es " + cuadrado.perimetroCuadrado());  MAL
                                cuadrado.perimetroCuadrado();
                                System.out.println(cuadrado.getPerimetro());
                                break;
                            case 3:
                              //  System.out.println("Mostrar datos-VER " + "\n");  MAL COMO LO ESTOY LLAMANDO va sin print
                                cuadrado.mostrarDatos();
                                break;
                        }
                    } while (opcion != 0);
                    System.out.println("Pulsa enter para continuar");
                    ingTexto.next();
                    break;

            }
            if (opcion > 3 || opcion < 0) {
                System.out.println("Nro incorrecto , escriba la opción correcta");
            }


        } while (opcion >3 && opcion<1); // ver bien
        System.out.println("hasta luego");
    }
}