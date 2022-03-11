package Ejercicio_6;

public class Persona {

    String nombre,apellido,dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona(){}



    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("Dni");
        System.out.println();

    }




    /*

    Atributos: nombre, apellido, dni
    Constructor: todos los datos
    Métodos: mostrarDatos, getter y setter

    */


}
