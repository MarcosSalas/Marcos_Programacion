package Inventario;

import java.util.ArrayList;

public class SupermercadoEspecifico<V,T> extends Par implements Elementos<T> {

    ArrayList <V> ArrayElementos;

    public SupermercadoEspecifico(V cosas ) {
        this.ArrayElementos=new ArrayList<>();
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

        }


    }

    @Override
    public void registrarElemento(T element) {
        ArrayElementos.add((V) element);
    }
}