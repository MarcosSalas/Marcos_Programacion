package Ejercicio_6;

import java.util.ArrayList;

public class Biblioteca {


    ArrayList<Persona>personaArrayList;
    ArrayList<Elemento>elementoArrayList;

    public Biblioteca(ArrayList<Persona> personaArrayList, ArrayList<Elemento> elementoArrayList) {
        this.personaArrayList = personaArrayList;
        this.elementoArrayList = elementoArrayList;
    }
    public Biblioteca(){}

    public void registrarPersona(Persona persona){
        personaArrayList.add(persona);
        System.out.println("Persona agregada con éxito");

    }

    public void registrarElemento(Elemento elemento){
        elementoArrayList.add(elemento);
        System.out.println("Elemento agregado con éxito");

    }

/*Realizar préstamo. Pide como parámetro un socio y un elemento alquilable. Si el elemento no está prestado se le prestará al socio y se le asociará a su lista. De no ser así se mostrará un mensaje*/
    public void realizarPrestamo(Socio socio , Elemento alquilable){
        if (!(alquilable ==elementoArrayList(alquilable.id))) {
            socio.prestarArrayList.add(socio.prestar());                       //VER SI ESTÁ BIEN
        }else {
            System.out.println("Ese elemento ya está prestado");
        }
    }



    /*Realizar devolución. Pide como parámetro un socio y un elemento alquilable.*/
    public void realizarDevolucion(Socio socio , Elemento alquilable){
        if (alquilable ==elementoArrayList(alquilable.id)) {
            socio.prestarArrayList.remove(socio.devolver());  //VER SI ESTÁ BIEN
        }else {
            System.out.println("Ese elemento ya está prestado");
        }

    }






    /*
    Mostrar elementos prestados: No pide nada por parámetros y mostrará los datos de los elementos prestados
Mostrar elementos disponibles: No pide nada por parámetros y mostrará los datos de los elementos que están disponibles
Mostrar elementos de un socio. Se pide por consola un dni y se mostrarán los datos de los elementos prestados a ese socio.



    * */









    public Persona existePersona(String dni){
        boolean existe = false;
        Persona personaEncontrado = null;

        for (Persona persona : personaArrayList) {
            if (dni.equalsIgnoreCase(persona.getDni())) {

                System.out.println("El Dni ya existe");

                return persona;
            }
        }

        return null;

    }

    public Elemento elementoArrayList(int id){
        boolean existe = false;
        Elemento elementoEncontrado = null;

        for (Elemento elemento : elementoArrayList) {
            if (id==(elemento.getId())) {   //VER PORQUE PUSE == Y NO COMO ARRIBA IQUALSIGNORECASE
                System.out.println("El Elemento ya existe");
                return elemento;
            }
        }

        return null;

    }















    /*

    Atributos:
Arraylist de trabajadores y socios
Arraylist de libros, revistas, dvds y cd


    */
}
