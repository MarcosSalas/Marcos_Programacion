package Tema5_Ejercicios.Ejercicios_md.CajeroBaseRehecho;
public class Cliente {

//VARIABLES
    private String dni;
    private int pin;
    private double saldo;



//CONSTRUCTORES

    public Cliente() {
    }

    public Cliente(String dni, int pin){
        this.dni = dni;
        this.pin = pin;
    }

    public Cliente(String dni, int pin, double saldo) {

        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
    }
//MÉTODOS




    //GETERS Y SETERS


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

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
