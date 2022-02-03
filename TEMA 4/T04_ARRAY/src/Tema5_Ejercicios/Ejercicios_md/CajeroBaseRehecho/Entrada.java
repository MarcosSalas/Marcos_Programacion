package Tema5_Ejercicios.Ejercicios_md.CajeroBaseRehecho;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        String dni;
        int pin, opcion,isbn;
        double saldo;
        Scanner ingtext = new Scanner(System.in);

        do {
            System.out.println("ingrese el 1");
            opcion = ingtext.nextInt();

            switch (opcion) {
                case 1:


                    Banco banco = new Banco();
                    banco = new Banco("BBVA", "AV4441");
                    banco = new Banco("Santander", "AX222");

                    System.out.println("Ingrese el dni");
                    dni = ingtext.next();
                    System.out.println("Ingrese el pin");
                    pin = ingtext.nextInt();
                    System.out.println("Infrese saldo");
                    saldo = ingtext.nextDouble();
                    Cuenta cuenta =new Cuenta();
                    Cliente cliente = new Cliente(dni, pin, saldo);
                    Cliente cliente1 = new Cliente(dni, pin);
                    banco.abrirUnaCuenta(cuenta);
                    banco.cancelarCuenta(cliente1);

                    isbn=banco.getIsbn();

                    cuenta=new Cuenta(dni,pin,saldo,isbn);

                    System.out.printf("Datos de la cuenta: ");cuenta.mostrarDatos();

                    banco.abrirUnaCuenta(cuenta);
                    banco.mostrarCuentas();

                    break;
            }

        } while (opcion != 0);

    }

}
