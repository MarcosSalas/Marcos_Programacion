package Tema_Interfaz.TrabajadoresInterfaz_enClase;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Persona>personas;
    private  String nombre;
    private int votos;
    private  int beneficios;

    public Empresa(String nombre, int beneficios) {
        this.nombre = nombre;
        this.beneficios = beneficios;
        personas=new ArrayList<>();
    }

    public Empresa(){}


    public void listarPersonas(){
        for (Persona a:personas){
            a.mostrarDatos();
        }
    }


    public void addPersona(Persona persona){// aderimos un objeto de tipo persona
        //restriccion DNI FALTA COMPLETAR COMO EN EL EXAMEN
        personas.add(persona);
    }
    public void  despedirPersona(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equalsIgnoreCase(dni)){
                personas.remove(i);
                break;
            }
        }
    }

    public void buscarPersona(String dni){
        for (Persona a:personas){
            if (a.getDni().equalsIgnoreCase(dni)){
                a.mostrarDatos();
            }
        }
    }

    public void registrarVotacion(Comision comision){ //solo pueden votar los de la comisión

        this.votos+=comision.votar();

    }


    public void repartirBeneficios(){

        for (Persona a:personas){
            if(a instanceof Comision){
                ((Comision)a).obtenerBeneficio(beneficios);
            }
        }


    }







    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }
}
