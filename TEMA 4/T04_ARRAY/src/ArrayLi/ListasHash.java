package ArrayLi;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class ListasHash {
    public static void main(String[] args) {
        //MAPEO
        Hashtable listaElementos= new Hashtable();//si no lo tipo el elemento es objet y las claves lo mismo
        listaElementos.size();//sacar el tamaño de la lista
        //para guardar cosas necesito decirle la key y lo que quiero
        listaElementos.put("1","Elemento 1");//cuando yo pregunto por la palabra 1 ,nos da =Elemento1   EL put,solo guarda 2 cosas no mas,un key y objeto,objeto [],String, lo que querramos
        listaElementos.put("2","Elemento 2");
        listaElementos.put("3",false);
        listaElementos.put("4",new String[]{"Cosa 1","Cosa 2","Cosa 3"});

        System.out.println(listaElementos.size());//tengo 3 posiciones y 4 valores para recuperar pregunto por la clave ,no por la posicion

        //Obtener elementos del hatshtable directamente y no uno a uno como en el Array

        //listaElementos.get("4");//pregunto por la clave 4 y me va a devolver un String Array

        //TENDRIA QUE CASTEAR
    //    String[] elementoEncontrado=(String[]) listaElementos.get("4");//para igualar a una variable reutilizarla tengo q comentar el get de arriba
        //en cada vuelta con el for me encuentro un Srtring y no un Array de String
   //     elementoEncontrado[0]="Nuevo valor";// con el metodo del GET OBTENGO EL ARRAY ,A PARTIR DE ESE MOMENTO EL 1ER ELEMENTO QUE TENGO EN EL ARRAY CAMBIO EL VALOR,ES DECIR Cosa1,toma el valor de Nuevo valor
      /*  for (String item:elementoEncontrado) { //Recorro
            System.out.println(item);
        }*/

        //BORRAR 1 ELEMENTO

    //    listaElementos.remove("1");//Eliminararia elemento1 y la key- es decir que si luego quiero ingresar algo en la key "1", tendría que volver a crearla
     //   listaElementos.remove("7");//como es booleano me va a devolver null porque en el 7 no tenemos nada

//puedo meter una hashtable dentro de otra hashtabe

        //lista.PUT Y NO ADD para añadir en hashtable.
        //lista.Get para preguntar x una key y te busque los datos.
        //lista.containkey(m7) devuelve boolean(objt)
        //if(lista.containkey(m5)), pregunto si contiene la matricula, si no la contiene agrego los datos
        //if(lista.get(m7)!=null))
        //lista.remove(m4) elimina


        //                              *****PARA IMPRIMIR***
        //int cont=0; NO SE USA ESTE POR QUE VA POR CLAVE NO POR POSICIONES
       // for (Object ver : elementoEncontrado ) NO LO PUEDO USAR PORQUE NO VA POR POSICIONES

                        // ELEMENTS() DEVUELVE TODOS LOS ELEMENTOS, SIRVE PARA IMPRIMIR EN HASH TODAS LAS POS,LOS ELEMENTS
                       // keys() devuelve enumeration , x eso a Enumeration var le asigno para las claves, pero preciso los elementos.

        //      ****  SIEMPRE PARA IMPRIMIR TODAS LAS CLAVES EN HASHTABLE SE HACE CON EL WHILE

        System.out.println("Listado completo");
        Enumeration <Object>  /*(lo tipo del valor que tenga la key)*/    listaClaves =listaElementos.keys(); //LISTA DE TODAS LAS CLAVES
        while (listaClaves.hasMoreElements())/*devuelve un true*, si pogo listaClaves.hasMoreElements()==true es redundante/)*/ {
        //hay elemento siguiente
            Object clave =listaClaves.nextElement();
            Object elemento=listaElementos.get(clave);
            System.out.println(elemento);  //la impresión sale de abajo para arriba, imprimo el objeto, seria como la posición en el array
            //el caso del array que no nos imprime, tengo que recorrerlo
        }


    }
}
