package Tema_Interfaz.TrabajadoresInterfaz_enClase;

public final class Asalariado extends Trabajador{

    private int numeroPagas;

    public Asalariado(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numeroPagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numeroPagas = numeroPagas;
    }
    public Asalariado(){}

    @Override
    public void calcularSueldo() {
        this.sueldo=this.sueldo - (this.sueldo*Administracion.IRPF);

    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pagas" + numeroPagas);
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
}
