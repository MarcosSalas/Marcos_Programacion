package Tema5_Ejercicios.Ejercicios_md.Agenda;

public class Persona {

//1 declaro
private String nombre,apellido,dni;
private int nroTel;
//2 constr

    public  Persona()  //sin void ni nada, public y el nombre, comprobamos cuando queda amarillo
    {}
    public  Persona(String nombre,int nroTel,String dni){
        this.nombre=nombre;
        this.nroTel=nroTel;
        this.dni=dni;
    }

    // 3 métodos
    public void mostrarDatos(String nombre,String apellido,String dni,int nroTel){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.nroTel=nroTel;

        System.out.println("Nombre" + nombre);
        System.out.println("Apellido" + apellido);
        System.out.println("Dni" + dni);
        System.out.println("Número de tel" + nroTel);
    }

    //4 geter seter     el arraylis lo inicializo cuando creo el constructor


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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNroTel() {
        return nroTel;
    }

    public void setNroTel(int nroTel) {
        this.nroTel = nroTel;
    }
}
