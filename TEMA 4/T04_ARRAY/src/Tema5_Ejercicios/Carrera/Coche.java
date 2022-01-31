package Tema5_Ejercicios.Carrera;

public class Coche {

    //variable

    private int caballos,velocidad;
    private String matricula,modelo;
    private double kilometros;


    //constructor

    public Coche(){
        caballos=0;
        velocidad=0;
        matricula="0000AAA";
        modelo="sin especificar";
        kilometros=0.0;
    }

    public Coche(String modelo,String matricula,int caballos){
        this.modelo=modelo;
        this.matricula=matricula;
        this.caballos=caballos;

    }
    //metodo

    public void acelerar(int incremento){
        velocidad+=incremento;  // en este caso acumulo y sumo a la vez
        kilometros+=velocidad*(caballos)*(int)(Math.random()*11)+1;
        final int VELMAX =180;
        if (velocidad>VELMAX) {
            velocidad=180;
            System.out.println("Velocidad excedida de 180");
        }
    }

    public void frenar(int frenar){
        velocidad-=frenar;
        final int VELMIN = 0;
        if (velocidad<VELMIN) {
            velocidad=0;
            System.out.println("Velocidad debajo de 0");
        }


    }





}
