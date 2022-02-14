package Tema6_Herencia.Elemento;

public class Libro {
    //si elemento no tiene un constructor vacío, no le puedo dar extends
    public final class  Libro extends Elemento{ // si pongo final la clase ,nadie va a poder heredar nada con el override
        //id titulo
        private int ISBN,numeroPaginas;
    }
    public Libro (String id,String titulo,String autor,String tamanio, String formato, int ISBN, int numeroPaginas){
        short(id ,titulo,autor,tamanio,formato,ISBN,numeroPaginas)
    }


    @Override public void mostrarDatos(){


































    }









}
