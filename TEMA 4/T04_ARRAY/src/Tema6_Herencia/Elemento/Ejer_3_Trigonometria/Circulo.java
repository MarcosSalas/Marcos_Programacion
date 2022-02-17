package Tema6_Herencia.Elemento.Ejer_3_Trigonometria;

public  final class Circulo extends Figura {  //si quiere ser abstracta el circulo, si o si tiene que imprementar los métodos
    private double radio,diametro;        // en el caso de que el circulo tenga herencia para abajo,tendria que ser de clase abstracta tmb

public Circulo(){}

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        this.area=Math.PI * Math.pow(radio,2);
        return this.area;
    }

    public double calcularDiametro(){
    this.diametro=this.radio*2;
    return  this.diametro;
    }




}
