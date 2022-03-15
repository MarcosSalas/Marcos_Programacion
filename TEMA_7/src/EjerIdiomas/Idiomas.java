package EjerIdiomas;

import java.util.ArrayList;

public abstract class Idiomas { //si hay un metodo abstracto,la clase es abstracta
   private String nombre;
    private int numeroHablantes;
    private ArrayList<String>arraylistPalabra;

    public Idiomas() {
    }

    public Idiomas(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        this.arraylistPalabra = new ArrayList<>();
    }
    public abstract void saludar();//si es abstracto no tiene cuerpo, es decir no tiene{}
    public abstract void despedir();
    public void ingresarPalabra(String palabra){
        arraylistPalabra.add(palabra);
    };
    public void listarPalabras(){
        System.out.printf("Las palabras en %s son",nombre);
        for (String item:    arraylistPalabra) {
        }
    };



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList<String> getArraylistPalabra() {
        return arraylistPalabra;
    }

    public void setArraylistPalabra(ArrayList<String> arraylistPalabra) {
        this.arraylistPalabra = arraylistPalabra;
    }



}
