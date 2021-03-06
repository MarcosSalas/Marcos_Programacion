package Ejercicio_6;

public final class DVD extends Elemento { // se puede Consultar pero no se puede prestar

    private int anioEdicion;
    private String director,actores;
    private TipoDVD genero;



    public DVD(int id, String seccion, String titulo, boolean estado, int anioEdicion, String director, String actores, TipoDVD genero) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
    }

    public DVD() {
    }

    @Override
    public void mostrarDatos() {  //**Falta complertar
        super.mostrarDatos();
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

    public TipoDVD getGenero() {
        return genero;
    }

    public void setGenero(TipoDVD genero) {
        this.genero = genero;
    }




}
