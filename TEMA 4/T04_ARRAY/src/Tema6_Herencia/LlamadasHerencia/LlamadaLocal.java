package Tema6_Herencia.LlamadasHerencia;

public class LlamadaLocal extends Llamada {


    public LlamadaLocal(int nroOrigen,int nroDestino,int duracion){
        super(nroOrigen,nroDestino,duracion); //como se hereda se pone así para tomar los valores del padre
        // calcular_coste(); si pongo esto está mal por que lo llamo 2 veces
    }

    public LlamadaLocal(){}

    @Override
    public void calcular_coste() {
    this.coste=0; // para dejar algo escrito, no hace falta
    }



}
