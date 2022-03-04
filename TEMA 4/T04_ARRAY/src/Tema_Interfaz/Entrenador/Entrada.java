package Tema_Interfaz.Entrenador;

import Tema_Interfaz.Proyecto_Enum.Posicion;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

    String nSeleccion;
        String nombre;
        String apellido;
        String dni;
        String posicion,vocacion;
        int edad;
        double sueldo;




        Scanner entrTexto= new Scanner(System.in);


        System.out.println("Ingrese el nombre de la Selección");
        nSeleccion=entrTexto.next();

        Seleccion seleccion = new Seleccion(nSeleccion);
        Posicion posicionDefensa=Posicion.Jugador;


        System.out.println("Ingrese el nombre del jugador");
        nombre=entrTexto.next();
        System.out.println("Apellido");
        apellido=entrTexto.next();
        System.out.println("Dni");
        dni=entrTexto.next();
        System.out.println("Edad");
        edad=entrTexto.nextInt();
        System.out.println("Sueldo");
        sueldo=entrTexto.nextDouble();
        System.out.println("Posición");
        posicion=entrTexto.next();

        Jugador jugador= new Jugador(nombre,apellido,dni,edad,sueldo,posicion);
        Jugador jugador1= new Jugador(nombre,apellido,dni,edad,sueldo,posicion);
        Jugador jugador3= new Jugador(nombre,apellido,dni,edad,sueldo,posicion);
        Jugador jugador4= new Jugador(nombre,apellido,dni,edad,sueldo,posicion);

        Posicion.Jugador.name(); //la forma de costruir correctamente es esta, VER EN GITHUD



        seleccion.contratarJugador(jugador);
        seleccion.contratarJugador(jugador1);
        seleccion.contratarJugador(jugador3);
        seleccion.contratarJugador(jugador4);


            System.out.println("Ingrese el nombre del entrenador");
            nombre=entrTexto.next();
            System.out.println("Apellido");
            apellido=entrTexto.next();
            System.out.println("Dni");
            dni=entrTexto.next();
            System.out.println("Edad");
            edad=entrTexto.nextInt();
            System.out.println("Sueldo");
            sueldo=entrTexto.nextDouble();
            System.out.println("Posición");
            vocacion=entrTexto.next();



        Entrenador entrenador= new Entrenador(nombre,apellido,dni,edad,sueldo,vocacion);
        Entrenador entrenador1= new Entrenador(nombre,apellido,dni,edad,sueldo,vocacion);

            seleccion.contratarEntrenador(entrenador);
            seleccion.contratarEntrenador(entrenador1);






    }


}
