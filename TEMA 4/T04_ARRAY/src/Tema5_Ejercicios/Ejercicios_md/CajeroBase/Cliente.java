package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

public class Cliente {
    private String dni;
    private int pin;
    private double saldo;



    public Cliente() {

    }

    public Cliente(String dni, int pin, double saldo) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
    }

    public Cliente(String dni, int pin) {
        this.dni = dni;
        this.pin = pin;
    }




    public void mostrarDatos() {
       // Banco banco= new Banco();
        System.out.println( "Mostrar datos:Dni "+ dni + " Saldo " + saldo +" Nro cta ");

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
