package Tema6_Herencia.LlamadasHerencia;

public class LlamadaProvincial extends Llamada {

    public LlamadaProvincial (){}


    public LlamadaProvincial(int nroOrigen,int nroDestino,int duracion){
        super(nroOrigen,nroDestino,duracion);



    }

    @Override
    public void calcular_coste() {
        this.coste=this.duracion*15;

    }



}
