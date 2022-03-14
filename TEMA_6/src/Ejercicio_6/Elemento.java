package Ejercicio_6;

public abstract class Elemento { //Abstracto porque quiero que exista un cd ,un dvd, un libro, pero no un Elemento

    protected int id;
    protected String seccion,titulo;
    protected boolean estado;

    public Elemento(int id, String seccion, String titulo, boolean estado) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.estado = estado;
    }


    public Elemento(){};

    public void mostrarDatos(){
        System.out.println("ID "+id);
        System.out.println("Seccion "+seccion);
        System.out.println("titulo "+titulo);
        System.out.println("Estado "+estado);

    }




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
