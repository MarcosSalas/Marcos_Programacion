package Tema_Interfaz.Entrenador;

import Tema_Interfaz.Proyecto_Enum.Posiciones;

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
      // Posiciones posicionDefensa=Posiciones.Jugador;  . JUGADOR NO IRIA PORQUE LO QUE TIENE EN JUGADOR ES DEFENSA ETC..


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

       // Posiciones.Jugador.name(); //la forma de costruir correctamente es esta, VER EN GITHUD  SALE ERROR PORQUE COPIE MAL



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





            // **********************GUIT BORJA

/*
        Persona persona = new Jugador("Borja","Martin",123,Posiciones.delantero.getDefinicion());
        Jugador jugador = new Jugador("Borja1","Martin1",123,Posiciones.delantero.getDefinicion());
        Persona persona1 = new Entrenador("Entrenador","Apellido",1000,Vocaciones.defensivo.name());
        Entrenador entrenador = new Entrenador("Entrenador","Apellido",1000,Vocaciones.ofensivo.name());
        Canterano canterano = new Canterano("Canterano","Apellido",100,60);

        Seleccionable seleccionable = new Jugador("Nombre","Apellido",123,Posiciones.defensa.getDefinicion());

        Seleccion seleccion = new Seleccion();
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(jugador);
        seleccion.addPersona(canterano);
        seleccion.addPersona(entrenador);

        seleccion.comprobarAtaque();
        seleccion.repatirPrimaSeleccion();*/




    }


}
