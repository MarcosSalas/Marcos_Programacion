package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import java.util.ArrayList;

public class Cuenta {

    private ArrayList<Cliente> clienteArrayList;
    private String dni;
    private int pin,isbn; // nroCuenta; el nro de cuenta lo genera desde el ISBN
    private double saldo; //la cuenta es la que tiene el saldo





    public Cuenta (){
    this.clienteArrayList=new ArrayList();
    }

    public Cuenta(int isbn){
        this.isbn=isbn;

        //this.nroCuenta=nroCuenta;  el nro de cuenta lo genera desde el ISBN
    }


    public Cuenta(String dni, int pin,double saldo){
        this.dni=dni;
        this.pin=pin;
        this.saldo=saldo;
        //this.nroCuenta=nroCuenta;  el nro de cuenta lo genera desde el ISBN
    }

    public Cuenta (String dni, int pin,double saldo,int isbn){
        this.dni=dni;
        this.pin=pin;
        this.saldo=saldo;
        this.isbn=isbn;
    }

    public Cuenta(String dni, int pin){
        this.dni=dni;
        this.pin=pin;
        //this.nroCuenta=nroCuenta;  el nro de cuenta lo genera desde el ISBN
    }
    //                 *********************   ME FALTA PONER EL NUMERO DE CUENTA

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

        System.out.println("DNI " + getDni());
        System.out.println("SALDO " + getSaldo());
        //MOSTRAR DATOS- NOMBRE ISBN Y SALDO
    }


    //GETER-SETER

    public ArrayList<Cliente> getClienteArrayList() {
        return clienteArrayList;
    }

    public void setClienteArrayList(ArrayList<Cliente> clienteArrayList) {
        this.clienteArrayList = clienteArrayList;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
