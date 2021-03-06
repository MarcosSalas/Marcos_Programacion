package Explicacion.anonimas;

public class CocheNormal {

    private String marca, modelo, matricula;
    private int velocidad, cv;

    public CocheNormal(String marca, String modelo, String matricula, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        //this.velocidad = 0;
    }

    public CocheNormal(){}

    public void haySitio(int numeroCoches){

    }

    public void acelerar(int velocidadAcelerar){
        mostrarVelocidad();
    };


    public void mostrarVelocidad(){
        System.out.println("La velocidad actual es: "+getVelocidad());
    }
    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}