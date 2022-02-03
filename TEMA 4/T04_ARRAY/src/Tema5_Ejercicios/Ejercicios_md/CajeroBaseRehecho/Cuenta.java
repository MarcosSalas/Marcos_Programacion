package Tema5_Ejercicios.Ejercicios_md.CajeroBaseRehecho;
public class Cuenta {
    //VARIABLES
    private String dni;
    private int pin,isbn;
    private double saldo;


//CONSTRUCTORES

    public Cuenta() {
    }

    public Cuenta(String dni, int pin, double saldo,int isbn) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
        this.isbn=isbn;
    }



//MÉTODOS
public void mostrarDatos(){
    System.out.println("dni " +dni + ", pin "+pin + ", saldo " + saldo + ", isbn " + isbn);

}



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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
