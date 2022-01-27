package Tema5_Ejercicios.Ejercicios_md.Base;

public class Coche {

    private  Motor motor;        //clase en mayúscula justamente por eso, es de tipo Motor,(de la clase), nombre de la variable minúscula
    private String marca,modelo;
    private double costeAverias;


    public Coche(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        // costeAverias =0.0
    }
    public Coche(String marca,String modelo,Motor motor){
        this.modelo=modelo;
        this.marca=marca;
        this.motor=motor;

    }


    //3ro métodos
    public  void acumularAveria(double costeAverias){

        this.costeAverias+=costeAverias;
    }

    //4to métodos especiales getters y setters


    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCosteAverias() {
        return costeAverias;
    }
}
