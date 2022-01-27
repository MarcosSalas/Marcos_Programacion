package Tema5_Ejercicios.Ejercicios_md.Trigonometria;

public class Circulo {

    //1ro variables
    double radio, diametro, area;

    //2do constructores
    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    //3ro métodos

    public double calculaArea(double area) {
        area = (Math.PI) * (radio * 2);
        return area;
    }
/*
    public double calcularDiametro() {

    }
*/


}
