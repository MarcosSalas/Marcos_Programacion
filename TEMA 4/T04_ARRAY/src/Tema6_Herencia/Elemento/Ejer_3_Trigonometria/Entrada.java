package Tema6_Herencia.Elemento.Ejer_3_Trigonometria;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

    Circulo circulo= new Circulo(7);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.getArea());


        Rectangulo rectangulo = new Rectangulo(4,7);

        Triangulo triangulo = new Triangulo(4,5);


        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(rectangulo);
        figuras.add(triangulo);
        figuras.add(circulo);


        for (Figura a:figuras ) {
            System.out.println("Imprimiendo de la clase " +a.getClass().getSimpleName());
            System.out.println(a.calcularArea());//este calcula el calcular area de la
                                                //la forma de obligar a la figura que imprima los valores de rectangulo, circulo etc, es poniendo la figura como abstracto
            if (a instanceof Circulo) {
                ((Circulo)a).calcularDiametro();
            }else if (a instanceof  Rectangulo){
                System.out.println(((Rectangulo)a).calcularPerimetro());
            }

            // CASTEO, para poder ejecutar los metodos de CADA FIGURA
        }


    }



}
