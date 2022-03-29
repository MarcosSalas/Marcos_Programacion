package Explicacion.excepciones;

public class Entrada {
    public static void main(String[] args) {
        String palabra="Hola";
        String[] palabras =new String[]{"Uno ", "Dos ","Tres ", "Cuatro"};
        try {
            System.out.println(palabra.length());
            System.out.println(palabras[5]);
        }catch (NullPointerException e) {
            System.out.println("La palabra es nula");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error de acceso en el Array");
        }
        }
        finally {

            System.out.println("Ejecucion obigatoria ");
        }
        System.out.println("Bloque final");



    }


}
