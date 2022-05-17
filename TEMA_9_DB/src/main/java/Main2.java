import DataBase.SchemeDB;
import controller.ControllerBD;
import model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        /*MIN 34:38 del video*/
        ControllerBD controllerBD =new ControllerBD();

        /*#ITEM 4 -- LO NORMAL ES,QUE QUIEN ABRA Y CIERRE LA CONECCION SEA LA CONTRLADORA Y NO EL MAIN */
            //    controllerBD.getConecion();
            /*En el min 33:43 esta como publico el método close y luego pasa a privado*/
            //  controllerBD.closeConnection();

        Scanner scanner = new Scanner(System.in);
        String nombre=null, apellido=null, continuar=null;
        int edad=0;


        do {
            System.out.println("Introduce Nombre");
            nombre=scanner.next();
            System.out.println("Introduce Apellido");
            apellido=scanner.next();
            System.out.println("Introduce Edad");
            edad=scanner.nextInt();
            Alumno alumno = new Alumno(nombre,apellido,edad);
            controllerBD.insertarAlumnoStatement(alumno);

            System.out.println("Quieres contiuar (S/N)?");
            continuar=scanner.next();

        } while (continuar.equalsIgnoreCase("S"));


    }
}
