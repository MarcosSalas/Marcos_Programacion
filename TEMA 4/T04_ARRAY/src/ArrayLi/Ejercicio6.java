package ArrayLi;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entradaTexto=new Scanner(System.in);

        Object[] coche1=new Object[]{"Mercedes","C200",250,"asdasd123"};
        Object[] coche2=new Object[]{"Audi","A5",350};
        Object[] coche3=new Object[]{"VW","Arteon",180,true,40.0,"Repro"};

        //cuando meto array object solo puede entrar un array y lo que haya dentro del array en el arraylist,en el caso de querer poner en una posición de
        ArrayList <Object[]> listaCoches =new ArrayList();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        //estos dos de abajo son lo mismo,nada mas que a uno le asignamos una variable y al siguiente le aderimos el array direcamente
        listaCoches.add(coche3);
        listaCoches.add(new Object[]{"Ford","Focus",150});
        listaCoches.add(new Object[]{"Ford","FocusB",150});
        listaCoches.add(new Object[]{"Ford","FocusC",150});
        listaCoches.add(new Object[]{"Mercedes","FocusE",150});
        listaCoches.add(new Object[]{"Mercedes","FocusF",150});
        listaCoches.add(new Object[]{"Mercedes","FocusG",150});
        listaCoches.add(new Object[]{"Audi","FocusH",150});
        listaCoches.add(new Object[]{"Audi","FocusI",150});
        listaCoches.add(new Object[]{"Audi","FocusF",150});

        //obtener coches

      //  Object[] cocheSeleccionado=listaCoches.get(3);
       // System.out.println(cocheSeleccionado);
        System.out.println(listaCoches.get(2)[0]);

        //Marca:Mercedes Modelo:c200 cv:360

        //a la hora de hacer el for tiene que ir con el objet[] si ponemos objet solo no valdria x q tomaría tmb un 9

        /*for (Object[] item:listaCoches) {
            System.out.println("Marca: "+coche1[0]+"Modelo: "+coche1[1]+ "cv: "+coche1[2]);
            //listaCoches.get(listaCoches.size());
            //System.out.println(listaCoches);
        }*/

        //trabajariammos de la misma forma que el arrayMultidimensional para que se pueda imprimir (i), el unico tema es que no se puede poner(i),(j), sino que se le asigna el valor
        //de la variable (I) a una variable objet[] y a eso se le
       /* for (int i = 0; i < listaCoches.size(); i++) {
            Object[]

        }*/

        //el foreach no se le pone ni size como el arraylist ni lengh ,porque lo que va a recorrer el foreach es desde el principio hasta el final sin parar. a diferencia del for normal que se le delimita una distancia desde donde hasta donde
        //EN EL CASO DE SACAR UN ARRAY DENTRO DEL ARRAY LIST SE LO TRABAJA COMO EL MULTIDIMENSIONAL (i) (j)
        System.out.println("que marca quieres buscar");
        String buscar=entradaTexto.next();
//el primer foreach toma el todo lo que está dentro de cada array, Object[]{"Ford","Focus",150}), listaCoches.add(new Object[]{"Ford","FocusB",150});
        for (Object[] coche:listaCoches) {

            if (coche[0].toString().equalsIgnoreCase(buscar)) {
//el segundo forach toma todo lo que esta dentro de cada array    Ford","Focus",150,       Ford","FocusB",150
                for (Object item:coche ) {
                    System.out.println(item + "\t");

                }
                System.out.println();//esto se pone para que por cada iteracion del array list separe cada array que hay dentro

            }


        }








    }
}
