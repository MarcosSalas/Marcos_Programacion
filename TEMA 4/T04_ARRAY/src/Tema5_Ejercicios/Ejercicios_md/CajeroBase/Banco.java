package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import java.util.ArrayList;

public class Banco {
    // nombre, un cif y un conjunto de cuentas
    private String nombre,cif;
    public ArrayList<Cuenta> cuentaArrayList=new ArrayList(); //ver si es public o private

public Banco(){

}
public Banco(String nombre ,String cif){
    this.nombre=nombre;
    this.cif=cif;
   //CONJUNTO DE CUENTAS VER
}


    public void abrirCuenta(Cuenta cuentaAb){
        int isbn=(int)(Math.random()*(10000-1)+1);
        System.out.println("cuenta creada correctamente");
    }

    public void cancelarCuenta(Cuenta cuentaCanc){



    }


}
