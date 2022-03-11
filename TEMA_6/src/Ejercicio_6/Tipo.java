package Ejercicio_6;

public enum Tipo {

    intriga("Intriga"),terror("Terror"),comedia("Comedia"),drama("Drama");


    String nombre;

    Tipo(String nombre){
        this.nombre=nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
