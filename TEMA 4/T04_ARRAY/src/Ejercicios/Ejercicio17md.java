package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17md {
    public static void main(String[] args) {
        Scanner ingTexto = new Scanner(System.in);
        ArrayList<Object[]> listaUsuarios = new ArrayList<>();
        Object persona[] = null;
        int opcion = 0;


        String nroTel;
        String nom,apellido,dni;

        boolean respuestaInt = false;
        boolean respuestaString = false;



        do {

            System.out.println("*** Ingrese la opción deseada ***");
            System.out.println("1 Agrega persona");
            System.out.println("2 Buscar persona");
            System.out.println("3 Borrar persona");
            System.out.println("4 Listar personas");
            System.out.println("5 Para eliminar todos los datos de las listas"); //esto no figura pero se lo agrego yo para practicar
            System.out.println("0 Para SALIR");
            opcion = ingTexto.nextInt(); //no olvidar esta linea si es que lo inicializo en 0


                switch (opcion) {
                    case 1:
                        do {
                            System.out.println("Ingrese el nombre ");
                            nom = ingTexto.next();
                            respuestaString = validarString(nom);
                        } while (respuestaString != true);

                        do {
                        System.out.println("Ingrese el apellido ");
                        apellido = ingTexto.next();
                        respuestaString = validarString(apellido);
                        } while (respuestaString != true);

                        do {
                            System.out.println("Ingrese el teléfono ");
                            nroTel = ingTexto.next();
                            respuestaInt = validarInt(nroTel);
                        } while (respuestaInt != true);  //TODO ver porque no funciona


                            System.out.println("Ingrese el dni ");
                            dni = ingTexto.next();



                        persona = new Object[]{nom, apellido, nroTel, dni}; //en el caso de declarar arriba como darle valor aqui, tengo que especificar que es Objet[];
                        listaUsuarios.add(persona);

                        break;
                    case 2:


                        System.out.println("Ingrese el dni ");
                        dni = ingTexto.next(); //reutilizamos la variable
                        boolean encontrado = false;


                        for (int i = 0; i < listaUsuarios.size(); i++) {
                            persona = listaUsuarios.get(i);
                            if (persona[3].equals(dni)) { //la posición donde se encuentra la variable dni
                                encontrado = true;
                                System.out.println("Nombre " + persona[0] + " Apellido " + persona[1] + " Teléfono " + persona[2] + "\n");
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("La persona con el dni ingresado no se encuentra\n");
                        }//se pone aca porque primero tengo que hacer la pregunta por todos los dni, si no tiene ahi imprimo que no tengo

                        break;
                    case 3:
                        System.out.println("Ingrese el dni ");
                        dni = ingTexto.next(); //reutilizamos la variable
                        encontrado = false;


                        for (int i = 0; i < listaUsuarios.size(); i++) {
                            persona = listaUsuarios.get(i);
                            if (persona[3].equals(dni)) { //la posición donde se encuentra la variable dni
                                encontrado = true;
                                listaUsuarios.remove(i);
                                System.out.println("La persona con dicho dni fue eliminado \n");
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("La persona con el dni ingresado no se encuentra\n");
                        }


                        break;
                    case 4:
                 /*   for (Object[]itemLista:listaUsuarios) { //la mayoria de las consultas se hacen en princiopio sobre arraylis y luego del for o foreach sobre los array
                        System.out.println(itemLista[itemLista.length-1]); //esto no se puede por que solo imprime el lenght de todos los dni,tengo que hacer como sigue
                    }*/


                        if (listaUsuarios.size() > 0) {

                            for (Object[] personas : listaUsuarios) { //en este caso no tiene que coincidir con el array creado arriba ,porque sino me va a dar fallo.

                                System.out.println("Nombre " + personas[0] + " Apellido " + personas[1] + " Teléfono " + personas[2] + " dni " + personas[3] + "\n"); //tengo que hacer esto para que me imprima TODO lo que esta dentro de esa posición en concreto
                                //es decir, si en la posicion 1 tenemos 2 nombres al estar en el for van a salir los dos
                                //y así para c/posición
                            }
                        } else {
                            System.out.println("No hay personas \n");
                        }


                        break;
                    case 5:
                        if (listaUsuarios.size() > 0) {
                            listaUsuarios.clear();
                            System.out.println("Listas eliminadas\n");
                            break;
                        } else {
                            System.out.println("No hay personas en la lista\n");
                        }


                }

          if (opcion<0||opcion>5){
                System.out.println("Número incorrecto, por favor ingrese un Nro del 0 al 5 \n");
            }

        } while (opcion != 0);

        System.out.println("Salió del programa");

    }


    public static boolean validarInt(String nroTel) { //en este caso la variable se la tomaba como String por el ejemplo del video
        boolean respuesta;

        if (nroTel.matches("[0-9]{9}")) {   //lo que está entre{} delimita la cantidad de nros que tiene que tener--lo que esta entre[]nos indica la condición, en este caso del 0al 9 quiere decir solo nros.
            //       System.out.print("correcto,es un nro \n");
            respuesta = true;
        } else {
            System.out.print("!Error, por favor ingrese solo nros que en total sean 10\n");
            respuesta = false;
        }
        return respuesta;

    }


    public static boolean validarString(String CompTexto) {
        boolean respuesta;

        if (CompTexto.matches("^[A-Za-z]*$")) {   //lo que está entre{} delimita la cantidad de nros que tiene que tener--lo que esta entre[]nos indica la condición, en este caso del 0al 9 quiere decir solo nros.
            //  System.out.println("correcto,es una letra \n");
            respuesta = true;
        } else {
            System.out.println("!Error, por favor ingrese solo letras  \n");
            respuesta = false;
        }
        return respuesta;
    }


}
/*
Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la persona asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
Borrar persona: Pedirá un dni y la eliminará de la lista
Listar personas: Listará odo los elementos existentes en la lista con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
En todos los casos se deberá de dar confirmación al usuario tanto del éxito de la operación como de la ejecución incorrecta de la opción
 */