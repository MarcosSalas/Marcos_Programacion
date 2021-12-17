package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

//Ejercicios ArrayList / HashTable
public class Ejercicio16md {
    public static void main(String[] args) {

        Scanner entradaTexto = new Scanner(System.in);
        ArrayList<Object[]> listaCoches = new ArrayList(); //si en la parte<Objet[]> no tipamos asi, toma como q es un Objet y no un objet[]
        Object coches[] = null;
        int opcion = 0;

        do {
            System.out.println("Ingresa la opcion deseada");
            System.out.println("Opcion 1 Añade coches");
            System.out.println("Opcion 2 Lista de coches");
            System.out.println("Opcion 3 Buscar coche");
            System.out.println("Opcion 4 Mostrar costes");
            System.out.println("Opcion 5 Eliminar coche");
            System.out.println("Opcion 6 Vaciar garaje");
            opcion = entradaTexto.nextInt();


            switch (opcion) {
                case 1:
                    if (listaCoches.size() < 2) { //el pone 5 en el ejercicio para no tener que estar escribiendo los 10
                        System.out.println("Ingrese la marca");
                        String marca = entradaTexto.next();
                        System.out.println("Ingrese la modelo");
                        String modelo = entradaTexto.next();
                        System.out.println("Ingrese la matricula");
                        String matricula = entradaTexto.next();
                        System.out.println("Ingrese la coste");
                        int coste = entradaTexto.nextInt();

                        coches = new Object[]{marca, modelo,matricula,coste};

                        System.out.println("Coche recepcionado");

                        listaCoches.add(coches); //no olvidar que tengo que guardar el array en el arraylist

                    } else {
                        System.out.println("No hay espacio");
                    }

                    break;
                case 2:
                    if (listaCoches.size()>0) {
                        for (Object[] coche:listaCoches) {
                            System.out.println("Marca "+coche[0]+"Modelo "+coche[1]+"Matricula "+coche[2]+"Coste "+coche[3]);

                        }
                    }else {
                        System.out.println("No hay coches");
                    }



                    break;
                case 3:
                    System.out.println("Que matricula quieres buscar");
                    String matricula=entradaTexto.next();
                    boolean encontrado= false;

                    for (Object[]coche:listaCoches) {
                        //el equalIgnoreCase SOLO TOMA STRING, entonces hay que pasarlo
                        if (coche[2].toString().equalsIgnoreCase(matricula)) {
                            encontrado=true;
                            System.out.println("Marca "+coches[0]+"Modelo "+coche[1]+"Matricula "+coche[2]+"Coste "+coche[3]);
                            break;
                        }

                    }
                    if (!encontrado){
                        System.out.println("El coche no está en el garaje");
                    }

                    break;
                case 4:
                    int costeAcumulado=0;
                    for (Object[]coche:listaCoches) {
                        costeAcumulado+=(int)coche[3];

                    }
                    System.out.println("Tu coste acumulado "+costeAcumulado);

                    break;
                case 5:

                    System.out.println("Que matricula quieres buscar");
                    matricula=entradaTexto.next();  //las mismas variables con valores redefinidos
                    encontrado= false;  //las mismas variables con valores redefinidos

                    for (int i = 0; i < listaCoches.size(); i++) {
                        coches= listaCoches.get(i); //la forma de como acceder directamente al valor de la variable
                        if (coches[2].toString().equalsIgnoreCase(matricula)){
                            System.out.println("Coche borrado");
                            encontrado=true;
                            listaCoches.remove(i); //borra algo de la lista, los datos de 1 array se podria decir
                            break;
                        }

                    }
                    if (!encontrado) {
                        System.out.println("coche no encontrado ");

                    }


                    break;
                case 6:

                    listaCoches.clear(); //borra todo el contenido del Arraylist
                    System.out.println("Lista vaciada");

                    break;

            }
        } while (opcion != 0);


    }
}
