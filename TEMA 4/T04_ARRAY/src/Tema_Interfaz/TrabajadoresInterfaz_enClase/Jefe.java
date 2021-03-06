package Tema_Interfaz.TrabajadoresInterfaz_enClase;

public final class Jefe extends Trabajador implements Comision{

    private int numeroTrabajadores;

    public Jefe() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero trabajadores: "+numeroTrabajadores);
    }

    public Jefe(String dni, String nombre, String apellido, double sueldo, Departamento departamento, int numeroTrabajadores) {
        super(dni, nombre, apellido, sueldo, departamento);
        this.numeroTrabajadores = numeroTrabajadores;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo;
    }

    @Override
    public double votar() {
        double voto =(Math.random()*11)/3;
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficio ) {
        this.sueldo+=(beneficio*0.10);
        System.out.println("BEneficio" +beneficio*0.10);


    }
}
