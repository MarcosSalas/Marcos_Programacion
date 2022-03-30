package Explicacion.genericos;

public class Entrada

{

    public static void main(String[] args) {
        /*InterfazGenerica interfazGenerica = new InventarioLetras();
        InterfazGenerica interfazGenerica1 = new InventarioNumeros();
        interfazGenerica.agregarElemento("123");
        interfazGenerica1.agregarElemento(123);*/
        //ClaseNumeros claseNumeros = new ClaseNumeros();
        ClaseNumeros<Number>/*en Number decia Double,pero no funcionaba*/ objetoNumeros = new ClaseNumeros<>();
        objetoNumeros.metodoGenerico("asd");
    }
}