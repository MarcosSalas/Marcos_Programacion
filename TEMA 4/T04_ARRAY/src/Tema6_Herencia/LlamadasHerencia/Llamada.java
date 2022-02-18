package Tema6_Herencia.LlamadasHerencia;

public abstract class Llamada {

    public int nroOrigen,nroDestino,duracion;
    public double coste;

    public Llamada() {    }

    public Llamada(int nroOrigen,int nroDestino,int duracion){
        calcular_coste(); //cuando llamo al método
        this.nroOrigen=nroOrigen;
        this.nroDestino=nroDestino;
        this.duracion=duracion;

    }

    protected abstract void calcular_coste();  //TENGO QUE PONER ABSTRACTO SE DEFINE ASI, PARA QUE TODAS LAS QUE HEREDEN TENGAN QUE CALCULAR HACIENDO CLICK CON EL BOTON DEL ERROR

    public void mostrarDatos(){  // si lo quiero cambiar lo sobreescribo desde la clase hija sino desde la entrada la puedo llamar directamente
        System.out.println("Origen");
        System.out.println("Destino");
        System.out.println("");
        System.out.println();

    }




    public int getNroOrigen() {
        return nroOrigen;
    }

    public void setNroOrigen(int nroOrigen) {
        this.nroOrigen = nroOrigen;
    }

    public int getNroDestino() {
        return nroDestino;
    }

    public void setNroDestino(int nroDestino) {
        this.nroDestino = nroDestino;
    }

    public int getNroDuracion() {
        return duracion;
    }

    public void setNroDuracion(int nroDuracion) {
        this.duracion = nroDuracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
