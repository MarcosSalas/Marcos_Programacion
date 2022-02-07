package Tema5_Ejercicios.Ejercicios_md.ExamenCorre.Bingo;

import java.util.ArrayList;

public class Carton {
    private ArrayList<Integer> listaNumeros;
    private int numerosAciertos;







    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getNumerosAciertos() {
        return numerosAciertos;
    }

    public void setNumerosAciertos(int numerosAciertos) {
        this.numerosAciertos = numerosAciertos;
    }

    public Carton(){
        listaNumeros=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int aleatorio= (int)(Math.random()*51);
            listaNumeros.add(aleatorio);
        }



    }
}
