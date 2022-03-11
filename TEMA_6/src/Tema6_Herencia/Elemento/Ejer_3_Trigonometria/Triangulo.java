package Tema6_Herencia.Elemento.Ejer_3_Trigonometria;

public final class Triangulo extends Figura { // como no exiende nada para abajo se pone final

    private int base,altura;

    public Triangulo(int base, int altura) {
        this.altura=altura;
        this.base = base;
    }
    public Triangulo(){}

    @Override
    public double calcularArea() {
        return 0;
    }
}
