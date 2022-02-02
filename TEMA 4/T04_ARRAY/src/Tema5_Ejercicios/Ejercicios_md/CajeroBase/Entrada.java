package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaText= new Scanner(System.in);
        // de dos BANCOS (BBVA y Santander). Sería como el ejercicio coches (2 coches)
    double sacarDin,saldo;
    String dni;
    int pin,asigAbrirC1;


    Banco banco = new Banco("Santander","2039A2");
    Banco banco1=new Banco("BBVA","20694AS");



        System.out.println("Ingrese dni");
        dni=entradaText.next();
        System.out.println("Ingrese pin");
        pin= entradaText.nextInt();
        System.out.println("Ingrese el saldo a depositar");
        saldo=entradaText.nextDouble();

        Cuenta cuenta= new Cuenta (dni,pin,saldo);
        banco.abrirCuenta(cuenta);

        System.out.println();

     //   banco.abrirCuenta(dni,pin,saldo);



    //bbva.abrirCuenta("y5259135s",1236,300);




    }
}
