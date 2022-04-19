package Repaso.Ejer2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args)  {
        double dinero = 0;
        boolean retirarTodo=false, vuelta;
        int opcion =0;
        Scanner scanner=new Scanner(System.in);


    Cuenta cuenta=new Cuenta();








        do {
            try {
                System.out.println("1 ingresar monto 2 sacar dinero 3 para Salir ");
                scanner = new Scanner(System.in);
                opcion = scanner.nextInt();
                if (opcion < 0 && opcion > 3) {
                    throw new ExceptionSinSaldo("El numero debe ser entre 1 y 3 inclusive");
                }
            } catch (InputMismatchException |ExceptionSinSaldo e) {
                System.out.println(e.getMessage());
            }


            switch (opcion) {

                case 1:
                    System.out.println("Su saldo ESS "+cuenta.saldo);
                    System.out.println("Ingrese el dinero ");
                    dinero=scanner.nextDouble();
                    cuenta.ingresarDinero(dinero);
                break;
                case 2:
                    try {
                        System.out.println("Su saldo ESS "+cuenta.saldo);
                        System.out.println("Cuanto dinero quiere sacar 01");
                        dinero=scanner.nextDouble();

                     //   System.out.println("Saldo "+cuenta.saldo);
                   //     System.out.println("Dinero a sacar "+dinero);

                        if (cuenta.saldo>=dinero && dinero>0)  {
                        /*    System.out.println("Mi saldo "+cuenta.saldo);
                            System.out.println("Cuanto dinero quiere sacar");
                            dinero=scanner.nextDouble();*/
                            cuenta.sacarDinero(dinero);
                      //      System.out.println("ESTE "+ cuenta.saldo);


                        } else if (cuenta.saldo > 0) {

                            throw new ExceptionSaldo("Error saldo Insuficiente");


                        } else {

                            throw new ExceptionSaldo1("Error No dispone de saldo");

                        }


                    } catch (ExceptionSaldo e) {
                        System.out.println(e.getMessage());
                        System.out.println("Su saldo es de "+cuenta.saldo);

                       // System.out.println("El retirar TODO ANTES "+retirarTodo);
                        System.out.println("¿Desea retirar todo el dinero? true-si false-no");
                        retirarTodo=scanner.nextBoolean();
                       // System.out.println("El retirar TODO DESPUES "+retirarTodo);
                        cuenta.retirTodo(retirarTodo);
                      //  vuelta=cuenta.retirTodo(retirarTodo);

                    //    System.out.println("Esto es vuelta VER SI MODIFICO "+retirarTodo);

                    }

                    catch (ExceptionSaldo1 e) {
                        System.out.println(e.getMessage());
                        System.out.println("Su saldo es de "+cuenta.saldo);
                    }


                break;
                case 3:
                    System.out.println("Hasta luego");

                    break;
            }

        } while (opcion!=3) ;









    }


}
