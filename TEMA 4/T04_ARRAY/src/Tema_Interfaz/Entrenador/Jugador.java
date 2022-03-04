package Tema_Interfaz.Entrenador;

public class Jugador {

    public String posicion;
    private double calculoSueldo=(0.25*100);

    //Cons


    public Jugador(String nombre, String apellido, String dni, int edad, double sueldo, String posicion) {
        super(nombre, apellido, dni, edad, sueldo);
        this.posicion = posicion;
        this.calculoSueldo=calculoSueldo;
    }

    public Jugador(){}



    //Met
    @Override
    public void calcularSueldo() {
        super.calcularSueldo();
        sueldo+=calculoSueldo;
    }




    //Get-set


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    public double getCalculoSueldo() {
        return calculoSueldo;
    }

    public void setCalculoSueldo(double calculoSueldo) {
        this.calculoSueldo = calculoSueldo;
    }


}
