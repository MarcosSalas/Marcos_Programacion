package Tema5_Ejercicios.Ejercicios_md.Asignaturas;

public class Asignatura {
    //1ro variables
    private int id;
    private double calificacion;

    //2do constructores
    public Asignatura(int id){
        this.id=id;

    }
    //3ro geters y seters

    public int getId() {
        return id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
