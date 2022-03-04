package Tema_Interfaz.Entrenador;

import java.util.ArrayList;

public class Seleccion {

    private String nombreSel;
    private ArrayList <Persona> listaPersona;

    public Seleccion(ArrayList<Persona> listaPersona) {

        this.listaPersona = new ArrayList();
    }
    public Seleccion(String nombreSel){
            this.nombreSel = nombreSel;
        this.listaPersona = new ArrayList();
    }


   /*public sumaSueldo(Persona persona){
       // FALTA CALCULAR SUELDO
   }*/


    public void agregarPersona(Persona persona){
        listaPersona.add(persona);
        System.out.println("Persona agregada con éxito y sus datos son");
        //persona.mostrarDatos();
    }



    public void contratarJugador (Persona dni) {
        if (existePersona(dni.getDni())==null){
            listaPersona.add(dni);
        }
    }

    public void contratarEntrenador (Persona dni) {
        if (existePersona(dni.getDni())==null){
            listaPersona.add(dni);

        }
    }

    public void verPosicion(Jugador posicion){
        for (Persona a:listaPersona) {
            System.out.println(posicion.getPosicion());
            // abajo si la persona es instancia de jugador, entoces..
            //COMPLETAR CON EL IF INSTANCEOF

            a.mostrarDatos();
        }
    }

    public void verJugadores(){
        for (Persona a:listaPersona) {
            a.mostrarDatos();
        }
    }


    public void verEntrenadores(){
        for (Persona a:listaPersona) {
            a.mostrarDatos();
        }
    }



    public Persona existePersona(String dni){
        boolean existe = false;
        Persona personaEncontrado = null;

        for (Persona persona : listaPersona) {
            if (dni.equalsIgnoreCase(persona.getDni())) {

                System.out.println("El Dni ya existe");

                return persona;
            }
        }

        return null;

    }


    public String getNombreSel() {
        return nombreSel;
    }

    public void setNombreSel(String nombreSel) {
        this.nombreSel = nombreSel;
    }

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }










}
