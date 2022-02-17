package Tema6_Herencia.LlamadasHerencia;

public class LlamadaLocal extends Llamada {


    public LlamadaLocal(int nroOrigen,int nroDestino,int duracion){
        super(nroOrigen,nroDestino,duracion); //como se hereda se pone así para tomar los valores del padre
    }

    public LlamadaLocal(){}

    @Override
    public void calcular_coste() {

    }



}
