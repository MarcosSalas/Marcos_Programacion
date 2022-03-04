package Tema_Interfaz.Entrenador;

public class Entrenador {

    private double calculoSueldo=(0.50*100);

    private String vocacion;

    public Entrenador(String nombre, String apellido, String dni, int edad, double sueldo, String vocacion) {
        super(nombre, apellido, dni, edad, sueldo);
        this.calculoSueldo = calculoSueldo;
        this.vocacion = vocacion;

    }
    public Entrenador(){}


    @Override
    public void calcularSueldo() {
        super.calcularSueldo();
        sueldo+=calculoSueldo;
    }

}
