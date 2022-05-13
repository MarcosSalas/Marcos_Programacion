package model;

import java.io.Serializable;

public class Peliculas implements Serializable {
        private  String título,fecha_de_lanzamiento, descripción;

    public Peliculas(String título, String fecha_de_lanzamiento, String descripción) {
        this.título = título;
        this.fecha_de_lanzamiento = fecha_de_lanzamiento;
        this.descripción = descripción;
    }






    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getFecha_de_lanzamiento() {
        return fecha_de_lanzamiento;
    }

    public void setFecha_de_lanzamiento(String fecha_de_lanzamiento) {
        this.fecha_de_lanzamiento = fecha_de_lanzamiento;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "título='" + título + '\'' +
                ", fecha_de_lanzamiento='" + fecha_de_lanzamiento + '\'' +
                ", descripción='" + descripción + '\'' +
                '}';
    }
}
