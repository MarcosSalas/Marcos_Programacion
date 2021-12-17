package baseHashtable;

import java.util.Hashtable;
import java.util.Scanner;

public class EjercicioBase {
    public static void main(String[] args) {


        Scanner entradaText = new Scanner(System.in);
        //Matricula es el String y el Objet[] es el coche
        //EL putAll METE TODAS LAS CLAVES PRIMERO Y LUEGO TODO EL RESTO , EN ESTE CASO TODOS LOS ARRAY
        Hashtable <String,Object[]> listaCoches=new Hashtable();

        listaCoches.put("ASD335",new Object[]{"ASD335","Mercedes","c220"});//LA CLAVE SERIA LA MISMA QUE LA MATRICULA ENTOCES, YO PREGUNTO POR LA MATRICULA Y NOS DA EL AUTO
        listaCoches.put("EEE444",new Object[]{"EEE444","FIAT","i8"});
        //otra forma
        Object[]coche=new Object[]{"MMA888","Audi","A5"};
        listaCoches.put(coche[0].toString(),coche);

        String matricula="";
        int opcion=0;
        do {
        System.out.println("Ingrese la matricula a buscar");
        matricula= entradaText.next();

       /* if (listaCoches.get(matricula)!=null) { //en el caso de esto devuelve un objeto por eso no se puede poner.equals(matricula)
            System.out.println("tu coche es");
         //   Object[] cocheEncontrado= listaCoches.get(matricula);//esto me devuelve lo que he encontrado.NO OLVIDAR QUE PARA ELLO TENGO QUE CREAR UN NUEVO ARRAY ,
            //QUIERO RECORRER LO QUE HE ENCONTRADO CON EL FOR
            for (Object item:listaCoches.get(matricula)) { //haciendo asi me va a dar lo de todas las posiciones si uno tiene 3 posiciones y otro 6 me vale para todos
                System.out.println(item);
            }

        }else {

            System.out.println("Tu coche no existe");
        }*/
        Object[] cocheEncontrado= listaCoches.get(matricula);//En este caso vale para TODAS las matriculas porque hace referencia al Arraylis;
                                                            // esto me devuelve lo que he encontrado.NO OLVIDAR QUE PARA ELLO TENGO QUE CREAR UN NUEVO ARRAY , EB



        if (cocheEncontrado!=null) { //en el caso de esto devuelve un objeto por eso no se puede poner.equals(matricula)
            System.out.println("tu coche es");

            //QUIERO RECORRER LO QUE HE ENCONTRADO CON EL FOR
            for (Object item:listaCoches.get(matricula)) { //haciendo asi me va a dar lo de todas las posiciones si uno tiene 3 posiciones y otro 6 me vale para todos
                System.out.println(item);
            }


        }else {

            System.out.println("Tu coche no existe \n");

        }
    } while (opcion==0); //corregir


    }
}
