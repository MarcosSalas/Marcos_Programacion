package Tema_Interfaz.TrabajadoresInterfaz_enClase;

public abstract class Trabajador extends Persona {

    double sueldo;


    public Trabajador(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;

    }

    public Trabajador(){};

    void calcularSueldo(){};







}
