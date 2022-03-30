package Supermercado;

import java.util.ArrayList;
//ME FALTO PONERLE EL FINAL
//Tengo que sacar la T..VER

public final class  SupermercadoEspecifico<V,T> implements Elementos<T> {//la primera V es el valor que recibo,la T es el calor que tengo que declarar para despues poder enviar con la 2da T
    //ME FALTO PONERLE EL private
    private ArrayList <V> ArrayElementos;

    public SupermercadoEspecifico(V cosas ) {
        this.ArrayElementos=new ArrayList<>();
    }


public  void mostrartodos(){
    for (V item:ArrayElementos) {
        if (item instanceof Alimento) {

             ((Alimento) item).mostrarDatosAlimento();
        }

        else if (item instanceof Mueble ) {
            ((Mueble) item).mostrarDatosMueble();
        }
    }

}
    public SupermercadoEspecifico() {

    }

    public void mostrarPreciosFinales(){
        double precioFinal = 0; //CORREGIDO EN CLASES
        for (V alimentos:ArrayElementos) {

            if (alimentos instanceof Alimento) {
                precioFinal += ((Alimento) alimentos).getPrecio();
            }

            else if (alimentos instanceof Mueble ) {
                precioFinal += ((Mueble) alimentos).getPrecio();
            }

            System.out.println(precioFinal);//CORREGIDO EN CLASES
        }


    }

    @Override
    public void registrarElemento(T element) { // esto mismo se puede hacer en la misma clase porque estoy agregando ina interface de mas pudiendolo resolver desde aca
        ArrayElementos.add((V) element);
    }
}