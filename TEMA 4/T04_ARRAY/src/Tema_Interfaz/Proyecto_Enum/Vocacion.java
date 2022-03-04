package Tema_Interfaz.Proyecto_Enum;

public enum Vocacion {

    //Costruidos
    Entrenador("Ofensivo","Defensivo");

    //variables
    String nombre1,nombre2;



    //constructores

    Vocacion (String nombre1,String nombre2){
        this.nombre1=nombre1;
        this.nombre2=nombre1;
    }
    Vocacion(){}

    //merodos

    public void mostrarDatos(){
        System.out.println(nombre1);
        System.out.println(nombre2);

    }


    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
}
