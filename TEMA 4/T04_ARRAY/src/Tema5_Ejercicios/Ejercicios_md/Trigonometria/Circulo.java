package Tema5_Ejercicios.Ejercicios_md.Trigonometria;

public class Circulo {

    //1ro variables
    double radio, diametro, area;

    //2do constructores     //LOS CONSTRUCTORES SIEMPRE SON PUBLICOS , NO TIENEN RETORNO , VAN EN MAYÚSCULA Y TIENEN QUE LLAMARSE IGUAL A LA CLASE
    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    //3ro métodos

    public double areaCirculo() {    //  EN  MINUSCULA NO SE LE PONE LOS PARÁMETROS ADENTRO PORQUE TIENE UN NOMBRE DISTINTO UNO DE OTRO
        area = ((Math.PI)*(radio * 2));
        return area;
    }

    public double diametroCirculo() {  //  EN  MINUSCULA NO SE LE PONE LOS PARÁMETROS ADENTRO PORQUE TIENE UN NOMBRE DISTINTO UNO DE OTRO
    diametro=2*radio;
    return diametro;
    }

//4to geter-seter


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
