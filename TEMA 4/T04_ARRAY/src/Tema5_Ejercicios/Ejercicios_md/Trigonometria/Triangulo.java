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

    public double area (){
     area=(base*altura)/2;
            return area;
    }


}
