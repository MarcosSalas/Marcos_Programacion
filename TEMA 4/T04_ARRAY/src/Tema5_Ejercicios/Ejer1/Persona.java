package Tema5_Ejercicios.Ejer1;

// el static solamente se usa cuando necesitamos acceder desde cualquier sitio, no se pone casi nunca excepción del main, que siempre lo tiene


public class Persona {
    //1ro variables

    private String nombre,apellido, dni ;
    private int edad,altura;
    private double peso;

    //2do constructores

    public Persona(){
        this.nombre="Por defecto";
        this.apellido="Por defecto"; //poner el this para estas 3 variables es indistinto.
        this.dni="1111111111X";
        this.edad=0;
        this.altura=0;
        this.peso=0;                                                                     //CONSTRUCTORES MAYÚSCULA
    }
    public Persona(String nombre,String apellido,String dni,int edad,int altura,double peso){
        this.nombre="Por defecto";
        this.apellido="Por defecto";
        this.dni="1111111111X";
        this.edad=0;
        this.altura=0;
        this.peso=0;
    }
    public Persona(String nombre,String apellido,String dni,int edad){


    }


    //3ro métodos

    public String mostrarDatos(){
        return "Nombre " + nombre +"\n" + "Apelllido " + apellido +"\n" + "DNI " + dni +"\n" + "Edad " + edad+"\n" + "Altura " + altura+"\n" + "Peso " + peso ;  //devuelve un solo valor ,en este caso es uno solo x q está concatenado, la salvedad, tienen que ser para este caso todos String
    }


    //4to métodos especiales getters y setters


    public String getNombre(){ //este es el nombre del método
        return nombre;
    }

    public void setNombre(String password){
        this.nombre=nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


/*

        Métodos:
        mostrarDatos: sacará por pantalla los datos de la persona formateados
        Métodos getters y setters asociados


 */