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

    public void areaCirculo() {    //  EN  MINUSCULA NO SE LE PONE LOS PARÁMETROS ADENTRO PORQUE TIENE UN NOMBRE DISTINTO UNO DE OTRO  //RECORDAR SI NO DEVUELVE NADA PONER VOID
        this.area = ((Math.PI)*(radio * 2));
    }

    public void diametroCirculo() {  //  EN  MINUSCULA NO SE LE PONE LOS PARÁMETROS ADENTRO PORQUE TIENE UN NOMBRE DISTINTO UNO DE OTRO
    this.diametro=2*radio;
    }
    public void mostrarDatos(){
        System.out.println("radio " + this.radio);
        System.out.println("diámetro " + this.diametro);
        System.out.println("área " + this.area);
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
