package ArrayLi;

import java.util.ArrayList;

public class ColeccionesTipadas {
    public static void main(String[] args) {

        ArrayList <Integer> listaNumeros=new ArrayList();
        ArrayList <String>listaPalabras=new ArrayList();


        //asi ponemos cosas
        listaNumeros.add(123);
        //pedimos en la posición
        listaNumeros.get(9);
        //borrar datos de la posición-para saber si borro con un if, si me devuelves es diferente de null es q no lo pudiste borrar
        listaNumeros.remove(1);


        listaPalabras.add("assd");
        listaPalabras.get(0);
        listaPalabras.remove(6);



        //para recorrer numeros con el foreach

        for (Integer item:listaNumeros) {

        }
        //para recorrer palabras con el foreach
        for (String item:listaPalabras) {

        }
    }
}
