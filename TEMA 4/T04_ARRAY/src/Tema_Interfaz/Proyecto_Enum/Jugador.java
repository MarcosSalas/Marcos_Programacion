package Tema_Interfaz.Proyecto_Enum;

public class Jugador extends  Persona implements Seleccionable{
    final String posicion;

    public Jugador(String nombre, String apellido, double sueldo ,String posicion) {
        super(nombre, apellido, sueldo);
        this.posicion=posicion;
    }

    @Override
    public void calcularSueldo() {
        //sueldo neto = sueldo bruto - retenciones(IRPF)
        this.sueldo= this.sueldo - (this.sueldo * Costantes.IRP);

    }


    public String getPosicion() {
        return posicion;
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }
}
