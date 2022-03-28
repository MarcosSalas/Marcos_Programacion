package Inventario;

import java.util.ArrayList;

public class SupermercadoEspecifico<V,T> extends Par implements Elementos<T> {//la primera V es el valor que recibo,la T es el calor que tengo que declarar para despues poder enviar con la 2da T

    ArrayList <V> ArrayElementos;

    public SupermercadoEspecifico(V cosas ) {
        this.ArrayElementos=new ArrayList<>();
    }


public  void mostrartodos(){
    for (V item:ArrayElementos) {
        if (item instanceof Alimento) {

             ((Alimento) item).mostrarDatosAlimento();
        }

        if (item instanceof Mueble ) {
            ((Mueble) item).mostrarDatosMueble();
        }
    }

}
    public SupermercadoEspecifico() {

    }

    public void mostrarPreciosFinales(){
        int precioFinal = 0;
        for (V alimentos:ArrayElementos) {

            if (alimentos instanceof Alimento) {
                precioFinal += ((Alimento) alimentos).getPrecio();
            }

            if (alimentos instanceof Mueble ) {
                precioFinal += ((Mueble) alimentos).getPrecio();
            }

            System.out.println();
        }


    }

    @Override
    public void registrarElemento(T element) {
        ArrayElementos.add((V) element);
    }
}