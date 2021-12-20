package Ejercicios;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio17mdHash {
    public static void main(String[] args) {
        Scanner ingTexto = new Scanner(System.in);
        Hashtable <Integer,Object[]> listaUsuarios= new Hashtable();//si
        listaUsuarios.size();

        Object persona[] = null;
        int opcion = 0;


        String nroTel;
        String nom;
        boolean respuestaInt = false;
        boolean respuestaString = false;


        do {

            System.out.println("Ingrese la opción deseada");
            System.out.println("1 Agrega persona");
            System.out.println("2 Buscar persona");
            System.out.println("3 Borrar persona");
            System.out.println("4 Listar personas");
            System.out.println("5 Para eliminar todos los datos de las listas"); //esto no figura pero se lo agrego yo para practicar
            System.out.println("0 Para SALIR");
            opcion = ingTexto.nextInt(); //no olvidar esta linea si es que lo inicializo en 0

            if (opcion >= 0 && opcion <= 5) {


                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre ");
                        nom = ingTexto.next();
                        System.out.println("Ingrese el apellido ");
                        String apellido = ingTexto.next();
                        System.out.println("Ingrese el teléfono ");
                        nroTel = ingTexto.next();
                        System.out.println("Ingrese el dni ");
                        int dni = ingTexto.nextInt();

                        persona = new Object[]{nom, apellido, nroTel, dni}; //en el caso de declarar arriba como darle valor aqui, tengo que especificar que es Objet[];
                        listaUsuarios.put(dni, persona);


                        break;
                    case 2:
                        System.out.println("Ingrese el dni ");
                        dni = ingTexto.nextInt();

/*              ***VER DE HACERLO CON UNO DE ESTOS DOS

                        Enumeration <Object[]> listaCochesEnum = listaCoches.elements();
                        while (listaCochesEnum.hasMoreElements()){
                            Object[] cocheActual = listaCochesEnum.nextElement();
                            for ( Object item : cocheActual ) {
                                System.out.println(item);
                            }
                        }
                        Enumeration <Object>  listaClaves =listaElementos.keys();
                        while (listaClaves.hasMoreElements()){
                            Object clave =listaClaves.nextElement();
                            Object elemento=listaElementos.get(clave);
                            System.out.println(elemento);
                        }
*/


                        break;
                    case 3:


                        break;
                    case 4:


                        break;
                    case 5:

                            break;
                }
            }  else {
                    System.out.println("Nro incorrecto por favor introduzca el nro correcto \n");
                }

        } while (opcion != 0);
            }
        }
