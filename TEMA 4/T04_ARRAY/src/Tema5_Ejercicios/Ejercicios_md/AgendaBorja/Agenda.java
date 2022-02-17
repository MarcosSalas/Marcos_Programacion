package Tema5_Ejercicios.Ejercicios_md.AgendaBorja;

import java.util.ArrayList;

public class Agenda {
    private ArrayList <Persona> listaPersonas;

    public Agenda() {

        this.listaPersonas = new ArrayList();
    }

    public void anadirPersona(Persona persona) {

        /*boolean exite = false;

        for (Persona item : listaPersonas) {
            if (item.getTelefono() == persona.getTelefono()) {
                exite = true;
                break;
            }
        }
        if (exite) {
            System.out.println("La persona ya existe");
        } else {
            listaPersonas.add(persona);
        }*/

        if (exitePersona(persona.getTelefono())== null){
            listaPersonas.add(persona);
        } else {
            System.out.println("La persona ya existe");
        }

    }

    public void listar() {
        for (Persona item : listaPersonas) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    public boolean borrarPersona(int telefono) {

        /*for (int i = 0; i < listaPersonas.size(); i++) {
            if (telefono == listaPersonas.get(i).getTelefono()) {
                listaPersonas.remove(i);
                return true;
            }
        }*/
        if (exitePersona(telefono)!= null){
            listaPersonas.remove(exitePersona(telefono));
            return true;
        }
        return false;

    }

    public void buscarPersona(int telefono) {
        /*for (Persona persona : listaPersonas) {
            if (persona.getTelefono() == telefono) {
                persona.mostrarDatos();
                break;
            }
        }*/
        if (exitePersona(telefono)!= null){
            exitePersona(telefono).mostrarDatos();
        }
    }

    public void editarPersona(int telefono) {
        /*for (Persona persona : listaPersonas) {
            if (persona.getTelefono() == telefono) {
                persona.setNombre("Otro nombre");
                persona.setDni("123123");
                break;
            }
        }*/
        if (exitePersona(telefono)!= null){
            Persona personaEncontrada = exitePersona(telefono);
            personaEncontrada.setNombre("Nuevo");
            personaEncontrada.setDni("ASD");
            personaEncontrada.setTelefono(123);
        }
    }

    private Persona exitePersona(int telefono) {  // esto va a devolver si la persona existe o no

        Persona persona = null;

        for ( Persona a: listaPersonas) {
            if (a.getTelefono() == telefono){
                //persona = item;
                //break;
                return a;
            }
        }


        return persona;
    }
}