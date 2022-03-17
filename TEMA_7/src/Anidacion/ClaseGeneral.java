package Anidacion;

public class ClaseGeneral {

    private String nombre;
    private int numero;
    private  boolean acierto;

    public ClaseGeneral(String nombre, int numero, boolean acierto) {
        this.nombre = nombre;
        this.numero = numero;
        this.acierto = acierto;
    }

    public void mostrarDatos(){
        System.out.println("" + nombre);
        System.out.println(""+numero);
        System.out.println(""+ acierto);
    };




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }
}
