package ProyectoEnumInterfaz;

public class Entrenador extends Persona{
    private String vocacion;

    public Entrenador(String nombre, String apellido, double sueldo,String vocacion) {
        super(nombre, apellido, sueldo);
        this.vocacion=vocacion;
    }

    @Override
    public void calcularSueldo() {

    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }
}
