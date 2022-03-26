package Tema7_Explicacion.Genericos;

import java.util.ArrayList;

public class Coleccion<T,S,V> implements Organizable<S,V> {

    private ArrayList<T> listaCosas;

    public Coleccion(){
        listaCosas = new ArrayList<>();
    }

    public void agregarCosas(T cosa){
        listaCosas.add(cosa);
    }


    @Override
    public void organizar(S criterio) {

    }

    @Override
    public V listar() {
        return null;
    }
}
