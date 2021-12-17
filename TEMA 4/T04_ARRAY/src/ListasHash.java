import java.util.ArrayList;
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
        String[] elementoEncontrado=(String[]) listaElementos.get("4");//para igualar a una variable reutilizarla tengo q comentar el get de arriba
        //en cada vuelta con el for me encuentro un Srtring y no un Array de String
        elementoEncontrado[0]="Nuevo valor";// con el metodo del GET OBTENGO EL ARRAY ,A PARTIR DE ESE MOMENTO EL 1ER ELEMENTO QUE TENGO EN EL ARRAY CAMBIO EL VALOR,ES DECIR Cosa1,toma el valor de Nuevo valor
      /*  for (String item:elementoEncontrado) { //Recorro
            System.out.println(item);
        }*/

        //BORRAR 1 ELEMENTO

        listaElementos.remove("1");//Eliminararia elemento1 y la key- es decir que si luego quiero ingresar algo en la key "1", tendría que volver a crearla
     //   listaElementos.remove("7");//como es booleano me va a devolver null porque en el 7 no tenemos nada

//puedo meter una hashtable dentro de otra hashtabe


    }
}
