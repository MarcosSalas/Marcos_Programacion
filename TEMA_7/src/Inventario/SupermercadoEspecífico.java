package Inventario;

import java.util.ArrayList;

public class SupermercadoEspecífico<V,T> {

    ArrayList <V> ArrayElementos;

    public SupermercadoEspecífico(Alimento alimento) {
        this.ArrayElementos=new ArrayList<>();
    }
    public void registrarElemento(T registrar){
    ArrayElementos.add((V) registrar);
    }


    public SupermercadoEspecífico() {

    }

    public void mostrarPreciosFinales(){
        int precioFinal = 0;
        for (V alimentos:ArrayElementos) {

            if (alimentos instanceof Alimento) {
                precioFinal += ((Alimento) alimentos).getPrecio();
            }

        }


    }
}
