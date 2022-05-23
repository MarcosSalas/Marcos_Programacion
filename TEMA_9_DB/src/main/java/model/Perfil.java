package model;

public class Perfil {
    private int id;
    private String Nombre;

    public Perfil(int id, String nombre) {
        this.id = id;
        Nombre = nombre;
    }

    public Perfil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
