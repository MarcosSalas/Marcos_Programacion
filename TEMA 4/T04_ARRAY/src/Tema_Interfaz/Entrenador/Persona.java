package Tema_Interfaz.Entrenador;

public class Persona {
    protected String nombre,apellido,dni;
    protected int edad;
    protected double sueldo;


    //Constr
    public Persona(String nombre, String apellido, String dni, int edad,double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    public Persona(){}


    //Metod

    public void calcularSueldo(){

    }



    public void mostrarDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("apellido: "+apellido);
        System.out.println("dni: "+dni);
        System.out.println("edad: "+edad);
        System.out.println("sueldo: "+sueldo);
    }





    //Get,set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
