package Tema6_Herencia.Elemento.Ejer_3_Trigonometria;

public final class Rectangulo extends Figura {

    private int base,altura;
    private double perimetro;

    public Rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }

    public Rectangulo(){}

    public double calcularPerimetro(){
        this.perimetro=(base+altura)*2;
        return this.perimetro;
    }


    @Override
    public double calcularArea() {
        this.area=this.base*this.altura;
        return this.area;
    }
}
