package Ejercicio_6;

public class CD extends Elemento{

    int anioEdicion;
    private TipoCD valores; // variable de tipo TipoCD... con el nombre de valores

    public CD(int id, String seccion, String titulo, boolean estado, int anioEdicion, TipoCD valores) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.valores = valores;
    }

    public CD() {    }






    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public TipoCD getValores() {
        return valores;
    }

    public void setValores(TipoCD valores) {
        this.valores = valores;
    }


}
