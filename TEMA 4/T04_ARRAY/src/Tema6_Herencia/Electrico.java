package Tema6_Herencia;

public class Electrico extends Coche {
    private int bateria;

    public Electrico(){}

    public Electrico(String matricula, String bastidor, int cv, int cc, int bateria) {
        super(matricula, bastidor, cv, cc);
        this.bateria = bateria;
    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        velocidad+=(int)(Math.random()*11)+20;
        this.velocidad=velocidad;
        System.out.println(velocidad);

    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}