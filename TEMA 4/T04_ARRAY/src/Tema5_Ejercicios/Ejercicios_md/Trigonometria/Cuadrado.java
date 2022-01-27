package Tema5_Ejercicios.Ejercicios_md.Trigonometria;

public class Cuadrado {
    //1Atriburos-Variables
    private int base,altura;
    private double area,perimetro;

    //2Constructores
    public Cuadrado(){
    }
    public Cuadrado(int base,int altura){
        this.base=base;
        this.altura=altura;

    }
    //3Metodos

    public double areaCuadrado(){ //  EN  MINUSCULA NO SE LE PONE LOS PARÁMETROS ADENTRO PORQUE TIENE UN NOMBRE DISTINTO UNO DE OTRO
        area=base*altura;
        return area;
    }
    public double perimetroCuadrado(){ //  EN  MINUSCULA NO SE LE PONE LOS PARÁMETROS ADENTRO PORQUE TIENE UN NOMBRE DISTINTO UNO DE OTRO
        perimetro=(2*altura+2*base);
        return perimetro;
    }

    //4Seter-Geters


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
