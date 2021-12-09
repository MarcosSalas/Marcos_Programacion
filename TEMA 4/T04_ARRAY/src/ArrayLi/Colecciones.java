package ArrayLi;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones  {


    public static void main(String[] args) {

        //todas aquellas cosas que no sean datos simples(complejo) van con mayúscula y el new despues del = todo lo que tenga paréntesis va a ser un método.
//int ,integuer dato complejo, dooble Dooble.etc

        Scanner ingrese=new Scanner(System.in);

        //lista de cualquier tipo
        ArrayList listaCosas=new ArrayList();
        //para poder saber su tamaño
        //size()me va a devolver un entero x q ese es el tamaño
        int tamanio = listaCosas.size();
        System.out.println(tamanio);

        //añado un elemento a la lista

        listaCosas.add(5);
        tamanio=listaCosas.size();
        System.out.println(tamanio);
        listaCosas.add("Borja");
        tamanio=listaCosas.size();
        System.out.println(tamanio);
        System.out.println(listaCosas);

        int numero = (int) listaCosas.get(0);
        System.out.println("El valor es " + numero);

        //para poder hacer un casteo de tipo String es con String.valueOf(listaCosas.get(1))
        String palabra= String.valueOf(listaCosas.get(1));
        System.out.println("El valor es : "+palabra);
        //agregar varias cosas al mismo tiempo addAll
        listaCosas.add(true);
        listaCosas.add(6);
        listaCosas.add(0.9);
        listaCosas.add(6);
        listaCosas.add("hola");
        listaCosas.add(6);
        listaCosas.add("true");
        listaCosas.add(6);
        listaCosas.add(34567);
        listaCosas.add(6);



     /*  for (int i = 0; i < listaCosas.size(); i++) {
            System.out.print( i+1 + " - " +listaCosas.get(i));

        }*/
        int posiciones=1;
        for (Object item:listaCosas) {
            System.out.println(posiciones + "-" +item);
            posiciones++;

        }

        //buscar dentro de la lista una palabra
        //cuando la encuentre sacar el mensaje palabra encontrada y la posición de la misma

        //siempre que haga un foreach o casi siempre va el contador
       posiciones=0;
        for (Object item:listaCosas) {
            if (item.equals("Borja")) {
                System.out.println("Palabra encontrada");
                System.out.println("En la posición " + posiciones);
            }
            posiciones++;

        }


        //siempre que se encuentre la posición devolvera 0 o un numero mayor,si devuelve-1 es que no encontró nada


        System.out.println("Ingrese la palabra a buscar");
        String palabBusc=ingrese.nextLine();

        //int posicionElemento =listaCosas.indexOf("Borja");
        //indexOf PARA BUSCAR la posicion que quiero buscar!
        int posicionElemento =listaCosas.indexOf(palabBusc);

        String palabraReem=null;
       if (posicionElemento>-1){
            System.out.println("Palabra encontrada");
            System.out.println("En la posición " +posicionElemento);
            System.out.println("valor a sustituir");
            palabraReem= ingrese.next();

            //EL SET PISA, modifica ,para reemplazar hay que poner el valor dentro del arraylist que quiero reemplazar,en la variable posicionElemento va el valor que encontró la palabra que solicité
            //en la palabraReem , lo que voy a poner en su lugar, pisa el valor
            listaCosas.set(posicionElemento,palabraReem);

        }else {
            //al arraylist le agrego lo que quiero
            palabraReem= ingrese.next(); //el valor lo ingresa arriba pero tengo que darselo al if y al ifelse , porque sino no sabe en el else q valor es y me da un NULL
            listaCosas.add(palabBusc);//ver EJERCICIO BORJA
        }


        System.out.println(listaCosas);

        //REMOVE, borra el elemento

        System.out.println("El tamaño actual es de :"+listaCosas.size());
        //si yo entre paréntesis pongo 5, me borra la posición 5
        //se tiene que poner el new Integer(Objeto) q es int.pero intentar no trabajar con Objet, si con posiciones,directamente poniendo el nro
        listaCosas.remove(5);



      //  System.out.println("Ingrese la palabra a buscar");
       // String palabBusc=ingrese.nextLine();

        //int posicionElemento =listaCosas.indexOf("Borja");
        //indexOf PARA BUSCAR la posicion que quiero buscar!
        //int posicionElemento =listaCosas.indexOf(palabBusc);


//si quiero hacer una modificacion y al mismo tiempo recorrer tengo que usar el FOR. NO SE PUEDE USAR EL FOREACH,da error de concurrencia


        //me falta el remove

        for (int i = 0; i < listaCosas.size(); i++) {
            if ((int)listaCosas.get(i).equals(6)) {
                listaCosas.remove(i);
            }
        }






    }





}
