package Ejercicio_6;

import java.util.ArrayList;

public class Socio extends Persona implements Prestar {


    private int nroSocio;
    private ArrayList <Prestar> prestarArrayList; //PARA QUE EL BOOLEAN DE PRESTAR SE PUEDA USAR TEGO QUE PONER LA IMPLEMENTACION ARRIBA


    public Socio(String nombre, String apellido, String dni, int nroSocio, ArrayList<Prestar> prestarArrayList) {
        super(nombre, apellido, dni);
        this.nroSocio = nroSocio;
        this.prestarArrayList = prestarArrayList;
    }

    public Socio() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(nroSocio);
        System.out.println("Prestamos");
                                                // ***********        Falta completar
    }

    public Socio(String nombre, String apellido, String dni){//PARA GENERAR EL NRO DE SOCIO EN LA BIBLIOTECA

    }



    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public ArrayList<Prestar> getPrestamosArrayList() {
        return prestarArrayList;
    }

    public void setPrestamosArrayList(ArrayList<Prestar> prestarArrayList) {
        this.prestarArrayList = prestarArrayList;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
}
