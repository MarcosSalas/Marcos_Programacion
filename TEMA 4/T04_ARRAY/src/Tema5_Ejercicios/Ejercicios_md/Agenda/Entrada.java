package Tema5_Ejercicios.Ejercicios_md.Agenda;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        int opcion=0;
        Scanner ingTex = new Scanner(System.in);
        Persona persona =new Persona("Juan","y5259135a",642537511); // agrego la primera persona
        Agenda agenda = new Agenda(); // creo la agenda
        agenda.agregarPersonas(persona); // para agregar otra persona a primeramente creado el metodo de agregarPersona
        agenda.agregarPersonas(new Persona("MARCOS","Y5259125A",2565954));


            System.out.println("1: Agregar persona a la agenda");
            System.out.println("2: Borrar persona ,según el DNI introducido");
            System.out.println("3: Editar persona ,según el DNI introducido");
            System.out.println("4: Buscar persona (recupera la persona que tenga un DNI introducido)");
            System.out.println("5: Listar agenda (lista todos los contactos de la agenda con sus datos)");
            System.out.println("0 para salir");
          //  opcion=ingTex.nextInt();

        agenda.listarAgenda();

        if(agenda.borrarPersona("1234")){

        }else {

        }
        //si has borrado saca un mensaje de borrado
        System.out.println("Despues de borrar");
        agenda.listarAgenda();


        agenda.buscarPersona("1234");

        agenda.agregarPersonas(new Persona());


    }




}
