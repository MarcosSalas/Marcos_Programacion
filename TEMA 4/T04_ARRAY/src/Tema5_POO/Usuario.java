package Tema5_POO;

public class Usuario {

    //1ro variables
    private String correoElectronico,nombre,apellidos,password,fecha; //si acá pongo privado no puedo acceder desde entrada , si pongo public si
    private int edad;

    //2do constructores
    //si no hay constructores escritos, hay un constructor que es el vacío(por defecto).
    //Este constructor deja de existir cuando se escribe un constructor.
    public Usuario(){
        this.nombre="Por defecto";
        this.correoElectronico="Por defecto"; //poner el this para estas 3 variables es indistinto.
        this.edad=19;

    }

    public Usuario(String nomb,String correoElectronico,String password){
        this.nombre=nomb; // un Ejemplo diferente      //this el valor que esta en la clase y no solamente en este método
        this.correoElectronico=correoElectronico; // el this es obligatorio en este caso mas que nada para este caso q tienen la misma variable
        this.password=password;

    }
    public Usuario (String correoElectronico,String password, int edad){
        this.correoElectronico=correoElectronico;
        this.password=password;
        this.edad=edad;

    }/*
    public Usuario (String nombre,String apellidos, String correoElectronico){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.correoElectronico=correoElectronico;
    }*/ //no puede haber dos constructoctores con los mismos tipos de variables ,string ,strig, string, (si se puede,string ,int,string y otro int,string,string)//se repite,pero no tiene el mismo orden,eso si se puede


    //3ro métodos

    public void mostrarDatos(){                            // METODOS SIEMPRE EN MINUSCULA,SEGUNDA PALABR,MAYUS
        System.out.println("NOMBRE "+nombre);
        System.out.println("PASS "+password);
        System.out.println("CORREO "+correoElectronico);
        System.out.println("FECHA "+fecha);
        System.out.println("EDAD "+edad);
    }

    public String mostrarDatosRetorno(){
        return "Nombre " + nombre +"\n" + "Apelllido " + apellidos;  //devuelve un solo valor ,en este caso es uno solo x q está concatenado, la salvedad, tienen que ser para este caso todos String
    }

    public void saludar(String nombreSaludar){
        System.out.println("Hola "+ nombreSaludar +" como estas");
    }

    public void saludar(Usuario usuario){ //le paso una variable de tipo usuario
        System.out.println("Hola soy "+ nombre +" y saludo a "+ usuario.getNombre() +" como estas");
    }




    //4to métodos especiales getters y setters

    //cuando pongo private arriba en las variables, la forma de poder pasar las variables se hace así

    //geter de contraseña
    public String getPassword(){ //este es el nombre del método
        return password;
    }

    //setter de pass

    public void setPassword(String password){
        this.password=password;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //si hablo de una variable boolean es is.lo q sea para generar el set y el get
}
