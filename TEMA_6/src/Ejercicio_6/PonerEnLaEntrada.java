package Ejercicio_6;

import java.util.Scanner;

public class PonerEnLaEntrada {
    public static void main(String[] args) {

        int opcion =0;

        Scanner ingreseTexto=new Scanner(System.in);
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1 Dar de alta un socio");
        opcion=ingreseTexto.nextInt();
        System.out.println("2 Dar de alta un elemento");
        opcion=ingreseTexto.nextInt();
        System.out.println("3 Prestar un elemento");
        opcion=ingreseTexto.nextInt();
        System.out.println("4 Devolver un elemento");
        opcion=ingreseTexto.nextInt();
        System.out.println("5 Ver elementos prestados a un socio concreto");
        opcion=ingreseTexto.nextInt();
        System.out.println("6 Mostrar elementos disponibles");
        opcion=ingreseTexto.nextInt();
        System.out.println("7 Mostrar elementos prestados");
        opcion=ingreseTexto.nextInt();

        switch (opcion) {
            case 1:
                Socio socio =new Socio();
               socio=new Socio(/*PONER NOMBRE,APELLIDO,ETC ACÁ*/);
                break;
            case 2:
                System.out.println("Que elemento desea dar de alta");
                System.out.println("1 Dar de alta un CD");
                opcion=ingreseTexto.nextInt();
                System.out.println("2 Dar de alta un DVD");
                opcion=ingreseTexto.nextInt();
                System.out.println("3 Dar de alta un Revista");
                opcion=ingreseTexto.nextInt();
                System.out.println("4 Dar de alta un Libro");
                opcion=ingreseTexto.nextInt();
                switch (opcion) {

                    case 1:
                        Elemento elemento=new Elemento();
                        elemento=new Elemento(/*PONER ID,SECCION,ETC ACÁ*/);
                        elemento=new CD(); //ver bien esto
                        break;
                    case 2:
                        Elemento elemento1=new Elemento();
                        elemento=new Elemento(/*PONER ID,SECCION,ETC ACÁ*/);
                        elemento=new DVD(); //ver bien esto
                        break;
                    case 3:
                        Elemento elemento2=new Elemento();
                        elemento=new Elemento(/*PONER ID,SECCION,ETC ACÁ*/);
                        elemento=new Revista(); //ver bien esto

                        break;
                    case 4:
                        Elemento elemento3=new Elemento();
                        elemento=new Elemento(/*PONER ID,SECCION,ETC ACÁ*/);
                        elemento=new Libro(); //ver bien esto
                        break;

                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }



    }

}
