package Ejercicio_6;

public class Elemento {

    public int id;
    public String seccion,titulo;
    public boolean estado;

    public Elemento(int id, String seccion, String titulo, boolean estado) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.estado = estado;
    }


    public Elemento(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
