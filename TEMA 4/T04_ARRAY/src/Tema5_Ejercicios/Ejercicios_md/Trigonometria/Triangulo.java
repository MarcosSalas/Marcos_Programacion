package Tema5_Ejercicios.Ejercicios_md.Trigonometria;

public class Triangulo {
    private int base,altura;
    double area;

    //2do constructores

    public Triangulo (){
    }  // SI hay que crear un solo constructor no hace falta crear este, si nos pide mas de uno,si hay que crearlo como en este caso

    public Triangulo (int b,int a){
        this.base=b;
        this.altura=a;
    }

    //3ro métodos

    public double areaTriangulo (){ //  EN  MINUSCULA NO SE LE PONE LOS PARÁMETROS ADENTRO PORQUE TIENE UN NOMBRE DISTINTO UNO DE OTRO
     area=(base*altura)/2;
            return area;
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
}
