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
    int opcion;
        int b,a;
        double rad;
        do {
            System.out.println("Ingrese la opción deseada del 1 al 3 y 0 para salir");
            System.out.println("1 Trabajar con triángulos");
            System.out.println("2 Trabajar con círculos");
            System.out.println("3 Trabajar con cuadrados");
            opcion=ingTexto.nextInt();

        switch (opcion) {

            case 1: ;

                System.out.println("Introduce base");
                b=ingTexto.nextInt();
                System.out.println("Introduce altura");
                a=ingTexto.nextInt();
                Triangulo triangulo = new Triangulo(b,a);
                System.out.println("¿Qué operación quieres hacer?");
                System.out.println("1 Calcular área");
                System.out.println("2 Mostrar datos");
                opcion= ingTexto.nextInt();
                if (opcion==1){
                    System.out.println("el Área del triángulo es " +   triangulo.areaTriangulo() + "\n");
                }else if (opcion==2){
                System.out.println("Mostrar datos-VER " +    "\n");
                }
                break;
            case 2: ;
                System.out.println("Introduce el radio");
                rad=ingTexto.nextDouble();
                Circulo circulo = new Circulo(rad);
                System.out.println("¿Qué operación quieres hacer?");
                System.out.println("1 Calcular área");
                System.out.println("2 Mostrar diámetro");
                System.out.println("3 Mostrar datos");
                opcion= ingTexto.nextInt();
                if (opcion==1){
                    System.out.printf("el Área del Círculo es %.2f %n",circulo.areaCirculo());
                }else if (opcion==2){
                    System.out.printf("el diámetro del Círculo es %.2f %n", + circulo.diametroCirculo());
                }else if (opcion==3){
                    System.out.println("Mostrar datos-VER " +    "\n");
                }

                break;
            case 3: ;
                System.out.println("Introduce base");
                b=ingTexto.nextInt();
                System.out.println("Introduce altura");
                a=ingTexto.nextInt();
                Cuadrado cuadrado= new Cuadrado(b,a);
                System.out.println("¿Qué operación quieres hacer?");
                System.out.println("1 Calcular área");
                System.out.println("2 Mostrar perímetro");
                opcion= ingTexto.nextInt();
                if (opcion==1){
                    System.out.println("el Area del Cuadrado es "+cuadrado.areaCuadrado());
                }else if (opcion==2){
                    System.out.println("el diámetro del Cuadrado es "+cuadrado.perimetroCuadrado());
                }else if (opcion==3){
                    System.out.println("Mostrar datos-VER " +    "\n");
                }

                break;


        }

            if (opcion>3 || opcion<0) {
                System.out.println("Nro incorrecto , escriba la opción correcta");
            }

        } while (opcion!=0);
        System.out.println("hasta luego");

    }
}
