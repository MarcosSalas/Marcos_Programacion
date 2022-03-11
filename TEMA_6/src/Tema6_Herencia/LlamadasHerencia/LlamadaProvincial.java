package Tema6_Herencia.LlamadasHerencia;

public class LlamadaProvincial extends Llamada {

    public LlamadaProvincial (){}


    public LlamadaProvincial(int nroOrigen,int nroDestino,int duracion){
        super(nroOrigen,nroDestino,duracion);
        // tambien calcula el coste aunque acà no esté



    }

    @Override
    public void calcular_coste() {
        this.coste=this.duracion*15; // esto lo traigo de la base

    }



}
