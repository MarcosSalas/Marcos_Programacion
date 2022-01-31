package Tema5_Ejercicios.Carrera;

public class Coche {

    //variable

    private int caballos, velocidad;
    private String matricula, modelo;
    private double kilometros;


    //constructor

    public Coche() {
        caballos = 0;
        velocidad = 0;
        matricula = "0000AAA";
        modelo = "sin especificar";
        kilometros = 0.0;
    }

    public Coche(String modelo, String matricula, int caballos) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.caballos = caballos;

    }
    //metodo

    public void acelerar(int incremento) {
        velocidad += incremento;  // en este caso acumulo y sumo a la vez
        kilometros += velocidad * (caballos) * (int) (Math.random() * 11) + 1;

        final int VELMAX = 180;
        if (velocidad > VELMAX) {
            velocidad = 180;
            System.out.println("Velocidad excedida de 180");
        }
    }

    public void frenar(int frenar) {
        velocidad -= frenar;
        final int VELMIN = 0;
        if (velocidad < VELMIN) {
            velocidad = 0;
            System.out.println("Velocidad debajo de 0");
        }
    }

    public void velocidadCero() {
        velocidad = 0;
    }

    public void resetear() {
        velocidad = 0;
        kilometros = 0;
    }

    public void mostrarDatos() {
        System.out.println("Matrícula " + matricula + ", Modelo " + modelo + ", CV " + caballos + ", Velocidad " + velocidad + ", Kilómetros " + kilometros);
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }
}
