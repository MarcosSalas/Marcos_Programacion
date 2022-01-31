package Tema5_Ejercicios.Ejercicios_md.Agenda;

public class Persona {

//1 declaro
private String nombre,apellido,dni;
private int nroTel;
//2 constr

    public  Persona()  //sin void ni nada, public y el nombre, comprobamos cuando queda amarillo
    {}
    public Persona(String nombre, String dni, int nroTel){ //PARA QUE PUEDA CREAR UNA PERSONA NECESITO ESTOS VALORES QUE TENGO ENTRE()
        this.nombre=nombre;                                //Y EN LA AGENDA PARA AGREGAR UNA PERSONA ,NECESITO ANTES HABER CREADO LA PERSONA
        this.nroTel=nroTel;
        this.dni=dni;
    }
    // 3 métodos
    public void mostrarDatos(){
        System.out.println("nombre " + this.nombre);
        System.out.println("apellido " + this.apellido);
        System.out.println("dni " + this.dni);
        System.out.println("nroTel " + this.nroTel);
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
