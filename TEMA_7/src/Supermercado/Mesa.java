package Supermercado;

public final class Mesa extends Mueble { //final porque no hay ninguna clase por debajo
//variables
    private int capacidad;//private porque no tengo ninguna clase por debajo
//**SIEMPRE** q pongo abstract es protected ,siempre q pongo final pongo private

    //constructores
    public Mesa(String material, String peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    public Mesa() {

    }
//metodos

    @Override
    public void mostrarDatosMueble() {
        super.mostrarDatosMueble();
        System.out.println("Capacidad "+capacidad);
    }
//metodos-set-get


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
