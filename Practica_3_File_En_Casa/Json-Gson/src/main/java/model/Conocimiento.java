package model;


import java.util.Arrays;

public class Conocimiento {
    private String concepto;
    private int experiencia;
    private String[] detalle;

    public Conocimiento() {
    }

    public Conocimiento(String concepto, int experiencia, String[] detalle) {
        this.concepto = concepto;
        this.experiencia = experiencia;
        this.detalle = detalle;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String[] getDetalle() {
        return detalle;
    }

    public void setDetalle(String[] detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Conocimiento{" +
                "concepto='" + concepto + '\'' +
                ", experiencia=" + experiencia +
                ", detalle=" + Arrays.toString(detalle) +
                '}';
    }
}
