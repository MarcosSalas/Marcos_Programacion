package model;

public class Alumno1 {
    private String nombre,apellido;
    private int edad;

    public Alumno1(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getApellido(){
        return apellido;
    }

}
