package Tema6_Herencia.Elemento.Ejer_3_Trigonometria;

public abstract class Figura {

    protected double area;
    Figura(){}
    public abstract double calcularArea();




    //si el método es abstracto, la clase tiene que ser abstracta


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
