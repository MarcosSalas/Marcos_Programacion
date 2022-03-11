package Ejercicio_6;

public class DVD extends Elemento {

    int anioEdicion;
    String director,actores;
    private Tipo genero;
    


    public DVD(int id, String seccion, String titulo, boolean estado, int anioEdicion, String director, String actores, Tipo genero) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
    }

    public DVD() {
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public Tipo getGenero() {
        return genero;
    }

    public void setGenero(Tipo genero) {
        this.genero = genero;
    }




}
