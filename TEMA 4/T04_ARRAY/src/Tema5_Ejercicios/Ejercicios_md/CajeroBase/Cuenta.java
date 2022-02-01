package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import java.util.ArrayList;

public class Cuenta {

    private ArrayList<Cliente> clienteArrayList=new ArrayList<>();
    private String dni;
    private int pin;
    private int saldo; //la cuenta es la que tiene el saldo


   // Banco banco=new Banco();  ver
    public Cuenta (){

    }
    public Cuenta(String dni, int pin){
        this.dni=dni;
        this.pin=pin;
    }


    public void ingresarDinero(String dni, int pin, double cantidad){

        if (cantidad>0) {
            System.out.println("no se puede ingresar dinero,saldo negativo");
        }else {
            System.out.println("Dinero ingresado correctamente");

        }
    }

    public void sacarDinero(String dni, int pin, double cantidad){
        if (saldo-cantidad<0) {
            System.out.println("Error no dispone del monto a extraer");

        } else {
            System.out.println("Dinero sacado correctamente");
        }
    }

    public void verResumen(){
        //MOSTRAR DATOS- NOMBRE ISBN Y SALDO
    }



}
