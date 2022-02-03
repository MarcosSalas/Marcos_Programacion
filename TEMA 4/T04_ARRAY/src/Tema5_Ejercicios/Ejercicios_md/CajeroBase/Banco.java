package Tema5_Ejercicios.Ejercicios_md.CajeroBase;

import java.util.ArrayList;

public class Banco {
    // nombre, un cif y un conjunto de cuentas
    private ArrayList <Cliente> cuentaArrayList; //ver si es public o private
    private String nombre, cif;

    //  Cuenta cuenta = new Cuenta(); //ahi llamo a la cuenta
    public int isbn;


    //CONSTRUCTORES
    public Banco() {
        this.cuentaArrayList = new ArrayList();
    }


    public Banco(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;

        //conjunto de cuentas
        //CONJUNTO DE CUENTAS VER

    }

//METODOS

    public void abrirCuenta(Cliente cliente) {
        /*boolean existe= false;
        for (Cuenta item:cuentaArrayList) {
            if (item.getDni() == cuenta.getDni()) {
            }
        }*/

        if (existeCuenta(cliente.getDni())== null) {
            isbn = (int) (Math.random() * (10000 - 1) + 1);
            cuentaArrayList.add(cliente); // ya el for esta abajo en el metodo existen persona, por eso no hace falta ponerlo por cada persona

            System.out.println("cuenta creada correctamente");
        } else {
            System.out.println("La persona ya existe");
        }
    }


    public void mostrarCuenta(){
        for (Cliente item:cuentaArrayList) {
            System.out.printf("Imprimiendo Cliente, ");
            item.mostrarDatos();
        }

        }


    public boolean cancelarCuenta(String dni) {

        if (existeCuenta(dni)!=null){
        cuentaArrayList.remove(existeCuenta(dni)); //Eliminar cuenta
        return true;
        }
        return false;
    }

    //GETER - SETTER
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cliente> getCuentaArrayList() {
        return cuentaArrayList;
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

    public ArrayList<Cliente> getCuentaArrayList(int i) {
        return cuentaArrayList;
    }

    public void setCuentaArrayList(ArrayList<Cliente> cuentaArrayList) {
        this.cuentaArrayList = cuentaArrayList;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    private Cliente existeCuenta(String dni) {

        Cliente cliente = null;

       for (Cliente item : cuentaArrayList) {
           if (item.getDni() == dni) {  //SEGUIR VIENDO EN AGENDA
               return item;
            }
        }
       return cliente;

    }
}