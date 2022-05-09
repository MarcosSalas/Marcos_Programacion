package Binario;

import Binario.controller.EjercicioController;
import Binario.model.Usuario;

import java.util.Scanner;

public class EntradaEjercicio {
    public static void main(String[] args) {
        EjercicioController ejercicioController= new EjercicioController();
        String nombre, apellido,pass;
        Scanner scanner = new Scanner(System.in);
        int opcionUsuarios =0, opcionLectura =0;

        //EJECUTE NADA MAS ARRANCAR CARGA LOS USUARIOS ANTERIOR##
        //Existe el archivo, fichero..
        //solo quiero escribir datos (llamando al mismo método,lecturaFichero)

       // VER BIEN ESTO!! ejercicioController.existeFichero();




        do {
            System.out.println("Introduce nombre");
            nombre =scanner.next();
            System.out.println("Introduce apellido");
            apellido =scanner.next();
            System.out.println("Introduce pass");
            pass =scanner.next();
            Usuario usuario = new Usuario(nombre,apellido,pass);
            ejercicioController.addUsuario(usuario);
          //  ejercicioController.addUsuario(usuario);// agrego el usuario al arraylist
            System.out.println("Quieres meter mas usuarios");
            opcionUsuarios=scanner.nextInt();
        } while (opcionUsuarios!=0);

        //NO QUIERO MAS USUARIOS, PASO A FICHERO
        ejercicioController.escrituraUsuarios();

        System.out.println("Quieres leer el fichero ?");
        opcionLectura=scanner.nextInt();
        if (opcionLectura==1){
            //En esta lectura solo quiero mostrar datos, pero arriba ,solo quiero escribir datos (llamando al mismo método,lecturaFichero)
            ejercicioController.lecturaFichero(true);// cuado Estoy aqui te pido que hagas lectura, entoces lectura es true, me voy al método y true es mostrarDatos
        }
        System.out.println("Fin");





    }
    
    
}
