package Tema5_Ejercicios.Ejercicios_md.CajeroBaseRehecho;

import java.util.ArrayList;

public class Banco {
    //VARIABLES
    private String nombre,cif;
    private int isbn;
    private ArrayList<Cuenta> clienteArrayList;
    //CONSTRUCTORES
    public Banco() {
        this.clienteArrayList =new ArrayList();
    }

    public Banco(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }
    //MÉTODOS
    public void abrirUnaCuenta(Cuenta clienteAbrir){
        this.clienteArrayList =new ArrayList();
        isbn=(int)(Math.random()*(10000-1)+1);

        for (int i=0;i<clienteArrayList.size();i++){
            clienteAbrir = clienteArrayList.get(i);
            clienteArrayList.add(clienteAbrir);
        }




    }


    public void cancelarCuenta(Cliente clienteCancel){
    //BORRAR a = lista.remove(n);
    }


public void mostrarCuentas(){
    for (Cuenta item:clienteArrayList) {
        System.out.println("ver");
      item.mostrarDatos();

    }


    }





    //GETERS Y SETERS


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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public ArrayList<Cuenta> getClienteArrayList() {
        return clienteArrayList;
    }

    public void setClienteArrayList(ArrayList<Cuenta> clienteArrayList) {
        this.clienteArrayList = clienteArrayList;
    }
}
