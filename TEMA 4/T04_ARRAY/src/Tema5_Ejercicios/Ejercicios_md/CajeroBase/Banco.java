package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import Tema5_Ejercicios.Ejercicios_md.Asignaturas.Alumno;

import java.util.ArrayList;

public class Banco {
    // nombre, un cif y un conjunto de cuentas
    private String nombre, cif;
    public ArrayList<Cuenta> cuentaArrayList; //ver si es public o private
  //  Cuenta cuenta = new Cuenta(); //ahi llamo a la cuenta
    private int isbn,asigAbrirC;



//CONSTRUCTORES
    public Banco() {

    }

    public Banco(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.cuentaArrayList = new ArrayList(); //conjunto de cuentas
        //CONJUNTO DE CUENTAS VER

    }

//METODOS


    public int abrirCuenta(Cuenta abrCuenta) {
        abrCuenta.getDni();
        abrCuenta.getPin();
        abrCuenta.getSaldo();
        isbn = (int) (Math.random() * (10000 - 1) + 1);
        System.out.println("cuenta creada correctamente");
        return isbn;

    }


    public void cancelarCuenta(Cuenta canCuenta) {
        canCuenta.getDni();
        canCuenta.getPin();
        if (existeCuenta()) {//SEGUIR VIENDO EN AGENDA
        }
    }


    private Cuenta existeCuenta(int isbn) {

        Cuenta cuenta = null;
        for (Cuenta item : cuentaArrayList) {
            if (item.) {  //SEGUIR VIENDO EN AGENDA

            }

        }
    }
//GETER - SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public ArrayList<Cuenta> getCuentaArrayList() {
        return cuentaArrayList;
    }

    public void setCuentaArrayList(ArrayList<Cuenta> cuentaArrayList) {
        this.cuentaArrayList = cuentaArrayList;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAsigAbrirC() {
        return asigAbrirC;
    }

    public void setAsigAbrirC(int asigAbrirC) {
        this.asigAbrirC = asigAbrirC;
    }
}
