package Ejercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17md {
    public static void main(String[] args) {
        Scanner ingTexto=new Scanner(System.in);
        ArrayList<Object[]>listaUsuarios=new ArrayList<>();
        Object persona[]=null;
        int opcion=0;

        do {
            System.out.println("Ingrese la opción deseada");
            System.out.println("1 Agrega persona");
            System.out.println("2 Buscar persona");
            System.out.println("3 Borrar persona");
            System.out.println("4 Listar personas");
            System.out.println("0 Para SALIR");
            opcion=ingTexto.nextInt(); //no olvidar esta linea si es que lo inicializo en 0



            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre ");
                    String nom=ingTexto.next();
                    System.out.println("Ingrese el apellido ");
                    String apellido=ingTexto.next();
                    System.out.println("Ingrese el teléfono ");
                    int nroTel=ingTexto.nextInt();
                    System.out.println("Ingrese el dni ");
                    int dni=ingTexto.nextInt();

                    persona=new Object[]{nom,apellido,nroTel,dni}; //en el caso de declarar arriba como darle valor aqui, tengo que especificar que es Objet[];
                    listaUsuarios.add(persona);

                    break;
                case 2:


                    System.out.println("Ingrese el dni ");
                    dni=ingTexto.nextInt(); //reutilizamos la variable
                    boolean encontrado= false;


                    for (int i = 0; i < listaUsuarios.size(); i++) {
                        persona= listaUsuarios.get(i);
                        if (persona[3].equals(dni)){ //la posición donde se encuentra la variable dni
                            encontrado=true;
                            System.out.println("Nombre "+persona[0]+ " Apellido "+persona[1]+ " Teléfono " +persona[2]);
                            break;
                        }


                    }
                    if (!encontrado){
                        System.out.println("La persona con el dni ingresado no se encuentra");
                    }//se pone aca porque primero tengo que hacer la pregunta por todos los dni, si no tiene ahi imprimo que no tengo



                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    break;

            }

        } while (opcion!=0);

    }
}

/*
Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la persona asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
Borrar persona: Pedirá un dni y la eliminará de la lista
Listar personas: Listará odo los elementos existentes en la lista con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
En todos los casos se deberá de dar confirmación al usuario tanto del éxito de la operación como de la ejecución incorrecta de la opción
 */