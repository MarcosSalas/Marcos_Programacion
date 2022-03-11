package Ejercicio_6;

import java.util.ArrayList;

public class Socio extends Persona {


    int nroSocio;
    ArrayList <Prestamos>prestamosArrayList;


    public Socio(String nombre, String apellido, String dni, int nroSocio, ArrayList<Prestamos> prestamosArrayList) {
        super(nombre, apellido, dni);
        this.nroSocio = nroSocio;
        this.prestamosArrayList = prestamosArrayList;
    }

    public Socio() {
    }


    public Socio(String nombre, String apellido, String dni){//PARA GENERAR EL NRO DE SOCIO EN LA BIBLIOTECA

    }



    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public ArrayList<Prestamos> getPrestamosArrayList() {
        return prestamosArrayList;
    }

    public void setPrestamosArrayList(ArrayList<Prestamos> prestamosArrayList) {
        this.prestamosArrayList = prestamosArrayList;
    }
}
