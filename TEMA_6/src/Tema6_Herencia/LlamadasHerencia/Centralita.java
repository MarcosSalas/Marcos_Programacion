package Tema6_Herencia.LlamadasHerencia;

import java.util.ArrayList;

public class Centralita {

    private ArrayList <Llamada> llamadaArrayList;  //como tiene informacion va privado y no abstracto
    private int costeAcumulado=0;
    public Centralita(ArrayList<Llamada> llamadaArrayList) {
        this.llamadaArrayList = new ArrayList<>();

    }

    public  void calcularCostes(){
        for (Llamada a:llamadaArrayList) {
            costeAcumulado+=a.getCoste(); // va a sumar todos los costes al poner el +=
        }

        System.out.println("El coste de todas las llamadas acumuladas es " + costeAcumulado);
    }


    public void agregarLlamada(Llamada llamada){
    llamadaArrayList.add(llamada);
    llamada.mostrarDatos();
    this.costeAcumulado+=llamada.getCoste();
    }


    private void mostrarLlamadas(String tipoLlamada){
        switch (tipoLlamada) {
            case "locales":
                listarLocales();
                break;
            case "nacionales":
                listaNacionales();
                break;
            case "privinciales":
                listarProvinciales();
                break;
        }
    }
        /*   for (Llamada a:llamadaArrayList) {
         if (tipoLlamada.equalsIgnoreCase ("provincial")){
                if (a instanceof  LlamadaProvincial) {
                    a.mostrarDatos();
                }



            }
        }

    }
     */




    private   void listaNacionales(){
        for (Llamada a:llamadaArrayList ) {
            if (a instanceof LlamadaNacional ) {
                a.mostrarDatos();
            }
        }
    }

    public  void listarLocales(){
        for (Llamada a:llamadaArrayList ) {
            if (a instanceof LlamadaLocal ) {
                a.mostrarDatos();
            }
        }
    }

    public  void listarProvinciales(){
        for (Llamada a:llamadaArrayList ) {
            if (a instanceof LlamadaProvincial ) {
                a.mostrarDatos();
            }
        }
    }



}



