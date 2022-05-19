package model;

import java.io.Serializable;

public class Personaje implements Serializable {

    private String name, photo;

    public Personaje() {}

    public Personaje(String nombre, String photo) {
        this.name = nombre;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
