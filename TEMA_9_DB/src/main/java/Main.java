import controller.ControllerBD;
import DataBase.SchemeDB;
import controller.ControllerBD_Borja;
import model.Alumno;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre = null, apellido = null, continuar = null;
        int edad = 0;
        ControllerBD_Borja controllerBD = new ControllerBD_Borja();
        //controllerBD.insertarAlumnoStatement();
        //controllerBD.insertarAlumnoPrepare();
/*
        do { // MEDIANTE UN STATEMENT - NO COMPRUEBA TIPOS- LO COMPRUEBA LA BD
            System.out.println("Intro nombre");
            nombre = scanner.next();
            System.out.println("Intro apellido");
            apellido = scanner.next();
            System.out.println("Intro edad");
            edad = scanner.nextInt();
            Alumno alumno = new Alumno(nombre, apellido, edad);
            controllerBD.insertarAlumnoStatement(alumno);
            System.out.println("Quieres continuar(s/n)");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        /*System.out.println("Introduce nombre modificar;");
        String nombreModificar = scanner.next();
        System.out.println("Introduce edad modificar;");
        int edadModificar = scanner.nextInt();
        controllerBD.actualizarEdad(nombreModificar,edadModificar);*/
       controllerBD.getResultados();

    }
}