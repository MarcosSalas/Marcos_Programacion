package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaText= new Scanner(System.in);
        // de dos BANCOS (BBVA y Santander). Sería como el ejercicio coches (2 coches)
    double sacarDin,saldo;
    String dni;
    int pin,opcion;
        Banco banco = new Banco(); // si pongo asi habilito el primer constructor con el arraylist, sin este el array no funciona
        Banco banco1 = new Banco("Santander","2039A2"); // con esto habilito el 2do constructor el de abajo
        Banco banco2=new Banco("BBVA","20694AS");
        Cuenta cuenta= new Cuenta();




        do {

            System.out.println("INGRESE 1");
            opcion= entradaText.nextInt();

            switch (opcion) {
                case 1:


        System.out.println("Ingrese dni");
        dni=entradaText.next();
        System.out.println("Ingrese pin");
        pin= entradaText.nextInt();
        System.out.println("Ingrese el saldo a depositar");
        saldo=entradaText.nextDouble();



       // cuenta= new Cuenta (dni,pin,saldo);


        banco.abrirCuenta(new Cliente(dni,pin,saldo)); // le tengo que pasar los parámetros primero para que me los calcule en la CLASE

                  /*  if(banco.cancelarCuenta(dni)){  Ver BORJA
                    }*/

        //System.out.println ("Pin " +cliente.getPin()+ " dni " + cliente.getDni()+ " saldo " +cliente.getSaldo());

        banco.mostrarCuenta();

     //   banco.abrirCuenta(dni,pin,saldo);

        // CANCELAR CUENTA

        // banco.cancelarCuenta(cancelaCuenta);
        // VER RESUMEN
        // System.out.println("VER RESUMEN" +   cuenta.verResumen()); así está mal, si quiero ver el resumen tengo que apuntar a la variable como arriba o imprimir como abajo
       // cuenta.verResumen();
       // System.out.println( "ISBN " + banco.getIsbn());// EL ISBN LO TENGO Q PONER ACA X Q EN EL MÉTODO NO ME LO LEE
        //ver nro de banco
       /* System.out.println("ISBN");
        System.out.println(banco.getIsbn());*/

               //NO ME LEE     System.out.println("MOSTRAR CUENTA");


    //bbva.abrirCuenta("y5259135s",1236,300);
                    break;

            }



        } while (opcion!=0);

    }
}
