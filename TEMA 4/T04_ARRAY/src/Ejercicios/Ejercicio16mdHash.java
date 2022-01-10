package Ejercicios;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

//Ejercicios ArrayList / HashTable
public class Ejercicio16mdHash {
    public static void main(String[] args) {

        Scanner entradaTexto = new Scanner(System.in);
         // ArrayList<Object[]> listaCoches = new ArrayList(); //si en la parte<Objet[]> no tipamos asi, toma como q es un Objet y no un objet[]
        Hashtable<String,Object[]> listaCoches=new Hashtable();
        Object coches[] = null;
        Object[] cocheEncontrado=null;
        int opcion = 0;
        String matricula = null;


        do {
            System.out.println("***Ingresa la opción deseada***");
            System.out.println("Opción 1 Añade coches");
            System.out.println("Opción 2 Lista de coches");
            System.out.println("Opción 3 Buscar coche");
            System.out.println("Opción 4 Mostrar costes");
            System.out.println("Opción 5 Eliminar coche");
            System.out.println("Opción 6 Vaciar garaje");
            System.out.println("Opción 0 PARA SALIR");
            opcion = entradaTexto.nextInt();


            switch (opcion) {
              //  case 0:break;
                case 1:
                    if (listaCoches.size()<2) {
                        System.out.println("Ingrese la matrícula");
                        matricula= entradaTexto.next();
                        System.out.println("Ingrese la marca");
                        String marca = entradaTexto.next();
                        System.out.println("Ingrese el modelo");
                        String modelo=entradaTexto.next();

                        System.out.println("Ingrese el coste");
                        int coste = entradaTexto.nextInt();

                        coches=new Object[]{marca,modelo,matricula,coste};
                        System.out.println("Coche recepcionado");
                        listaCoches.put(matricula,coches);



                    }
                    else {
                        System.out.println("No hay espacio en la cochera\n");
                    }


                    break;
                case 2:
                    if (listaCoches.size() > 0) {
                        Enumeration<Object[]> objetos = listaCoches.elements();  //Este sirve para mostrar todas las listas de los hashtable
                        while (objetos.hasMoreElements()) {
                            Object[] item = objetos.nextElement();
                            System.out.println("Coche " + item[0]);
                            for (Object ob : item) {
                                System.out.println(ob);
                            }
                            System.out.println("Siguiente coche");
                        }
                    } else {
                        System.out.println("Coche no cargado");
                    }
                    break;

                case 3:
                    if (listaCoches.size() > 0) {

                        System.out.println("Ingrese la matrícula del coche que quieres buscar");
                        matricula = entradaTexto.next();


                        if (listaCoches.containsKey(matricula)) {
                            Object[] matriEncontrada = listaCoches.get(matricula);
                            for (Object item : matriEncontrada) {
                                System.out.println(item);
                            }
                        } else {
                            System.out.println("No existe el coche");
                        }
                    } else {
                        System.out.println("No tienes cargado ningún coche");
                    }

                    break;
                case 4:
                    int costeAcumulado=0;



                    break;
                case 5:






                    break;
                case 6:


                    break;

            }
            if (opcion<0 ||opcion>6) {
                System.out.println("Nro incorrecto, ingrese un número del 0 al 6");
            }
        } while (opcion != 0);
        System.out.println("Salió del programa");


    }
}
