package Tema5_Ejercicios.Ejercicios_md.ExamenCorre.Bingo;

import java.util.ArrayList;

public class Jugador {
    private String nombre,dni;
    private ArrayList<Carton>cartones;
    private int saldo;




    public Jugador(String nombre,String dni,int saldo){
        this.nombre=nombre;
        this.dni=dni;
        this.saldo=saldo;
        this.cartones=new ArrayList<>();

    }
/*
    public void verCartones(){
        for (Carton cartones:cartones) {
            System.out.println("Carton " + contador);
            carton,verNumeros();

            
        }


        //recorro todos los cartones veo los n


    }*/
public void recargarSaldo(int cantidad){
    if (cantidad>0){
        this.saldo+=cantidad;
    }


}


    public void comparCartones(int cantidad){
        if (saldo-cantidad>=0) { //esto de abajo ba a repetir la cantidad de veces q tenga el carton de acuerdo al saldo
            this.saldo-=cantidad;
            for (int i = 0; i < cantidad; i++) {
                cartones.add(new Carton());  //cartones le pertenece a jugador, a ellos le asigno los cartones

            }
        }




    }





}
