package Supermercado;

public final class Lacteo extends Alimento {
//variables
    private int volumen; //corregido en clase lo de private,esta bien como puse en el apunte
//constructores
    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }
    public Lacteo() {
    }
//metodos

    @Override
    public void mostrarDatosAlimento() {
        super.mostrarDatosAlimento();
        System.out.println("Volumen "+volumen);
    }

//metodos set-get


    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
