package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

public class Cliente {
    private String dni;
    private int pin;
    private double saldoInic;

    public Cliente() {

    }

    public Cliente(String dni, int pin, double saldoInic) {
        this.dni = dni;
        this.pin = pin;
        this.saldoInic = saldoInic;
    }

    public void mostrarDatos() {
        System.out.println(dni);
        System.out.println(saldoInic);
    }



}
