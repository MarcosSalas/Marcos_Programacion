package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import Tema5_Ejercicios.Ejercicios_md.Asignaturas.Alumno;

import java.util.ArrayList;

public class Banco {
    // nombre, un cif y un conjunto de cuentas
    private String nombre, cif;
    public ArrayList<Cuenta> cuentaArrayList; //ver si es public o private
    //  Cuenta cuenta = new Cuenta(); //ahi llamo a la cuenta
    public int isbn;

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



    public void abrirCuenta(Cuenta abrCuenta) {
        /*boolean existe= false;
        for (Cuenta item:cuentaArrayList) {
            if (item.getDni() == cuenta.getDni()) {
            }
        }*/
        Cuenta cuenta =new Cuenta();
        cuenta=new Cuenta(abrCuenta.getDni(), abrCuenta.getPin(),abrCuenta.getSaldo());
        if (existeCuenta(cuenta.getDni())==null) {
            cuentaArrayList.add(cuenta);
            isbn = (int) (Math.random() * (10000 - 1) + 1);
            System.out.println("cuenta creada correctamente");
        } else {
            System.out.println("La persona ya existe");
        }
    }

    public boolean cancelarCuenta(Cuenta canCuenta) {

        if (existeCuenta(canCuenta.getDni())!=null){
        cuentaArrayList.remove(existeCuenta(canCuenta.getDni())); //Eliminar cuenta
        return true;
        }
        return false;
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

    public Cuenta existeCuenta(String dni) {
         Cuenta cuenta=null;
       for (Cuenta item : cuentaArrayList) {
           if (item.getDni()== dni) {  //SEGUIR VIENDO EN AGENDA
               return item;
            }else {
           }
        }
       return cuenta;

    }
}