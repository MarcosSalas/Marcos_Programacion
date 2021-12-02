import java.util.Locale;

public class ArrayList {
    public static void main(String[] args) {
        String palabraTratar="Ejemplo de palabra";
        System.out.println(palabraTratar.toLowerCase());
//minuscula
        System.out.println(palabraTratar.toUpperCase());
//mayuscula
        String palabraComparar= "Ejemplo de palabra";
        //si ponemos antes IgnoreCase nos ahorra el trabajo de hacer el lower por cada palabra
        //VER DE COMPLETAR QUE ME FALTÓ

        if (palabraTratar.toLowerCase().equals((palabraComparar.toLowerCase()))){
            System.out.println("Son iguales");

     //   if (palabraTratar.equals((palabraComparar))){
       //     System.out.println("Son iguales");
       }
        else {
            System.out.println("son diferentes");
        }
String fraseCompleta="Esto es una .frase completa, de un conjunto de palabras";
        System.out.println(fraseCompleta.length());
        //saber cuantas palabras
        //metodo split corta palabras
        //en esta frase cada palabra se puede guardar en una posicion de array
        //el espacio es donde voy a cortar, si pongo una "a", va a cortar desde la a en adelante hasta la proxima a"
        String[]palabras=fraseCompleta.split(" ");

        System.out.println("El, numero de palabras es:"+palabras.length);
        int letrasTotales=0;
        for (String item:palabras) {
            item.length();
            letrasTotales+=item.length();
        }
        System.out.println("El numero total de letras en :" + letrasTotales);
        //primero el espacio es porque lo que quiero reemplazar ,lo segundo es por lo que lo reemplazo,en este caso lo usamos para reemplazar el espacio vacio.
        //luego usamos el .leng para saber el nro de letras

        System.out.println(fraseCompleta.replaceAll(" ","").length());
        //tambien se puede hacer
        //poniendo el fraseCompleta=fraseCompleta , guarda los valores modificados a esa misma variable ,
        //entre medio de lo que quiero pasar NO OLVIDAR de poner la coma ,
      // si pongo esto y sigo con lo de abajo no me va a salir porque no es una sola palabra(una frase) y no varias palabras  fraseCompleta=fraseCompleta.replaceAll(" ", "")

        fraseCompleta.replaceAll(" ", "")
                .replaceAll(",", "")
                .replaceAll(".", "");
        //me ca a dar la letra de la primera letra  fraseCompleta.charAt(0)
        for (int i = 0; i < fraseCompleta.length(); i++) {
            System.out.println(fraseCompleta.charAt(i));
            //en un caracter no me deja preguntar por equal
            //si es letra es con ''
            if (fraseCompleta.charAt(i)!=' '){
                System.out.println(fraseCompleta.charAt(i));
            }
        }
        //si sale -1 es que la letra no existe
        //indexO la primera concurrencia
        System.out.println(fraseCompleta.indexOf("a"));
        //el lastIndex la ultima concurrencia
        //poniendo el 10 te dice que a partir del caracter 10 empieza a buscar
        fraseCompleta.indexOf("e",10);
        //si pongo nros sin comilla en donde esta la "e"directamente es el caracter que tiene asociado
        //el LASTINDEX O NO LO ENTENDI BIEN
        //subindexSprin crea una clase dentro de otra que ya esté
        fraseCompleta="Esto es una .frase completa, de un conjunto de palabras";
        //entre esta letra y esta (10 al 20)
        fraseCompleta.substring(10,20);
        String correo = "borja.martin@cesjuanpablosegundo.es";
        //igual que con el fraseCompleta.index0f(9895);
        //borja.martin
        //cesjuanpablosegundo.es
       correo.indexOf('@');//sabemos la posicion que está el @- se puede poner char'' o string""
       String nombre=correo.substring(0,correo.indexOf("@"));//desde 0 hasta la posición que está el @
        System.out.println(nombre);
       String dominio=correo.substring(correo.indexOf("@")+1,correo.length());       //siguiente posicion del @ es el +1--//con el last es mas complicado poque
                                                                                     //tendriamos que preguntar,cual es la posicion de... en este caso directamente
                                                                                        //dame la posición
        System.out.println(dominio);

    }
}
