package Tema6_Herencia;

public class Coche {
    //coche es la entrada ,la clase base
    // si no dejo nada delante de String,etc va protected,se puede poner o no

    protected String matricula,bastidor;
    protected int cv,cc,velocidad;

    //public abstract  Coche(String matricula,String bastidor,int cv,int cc){   //Así vamos a crear luego la estructura
    public Coche(String matricula,String bastidor,int cv,int cc){
        this.matricula=matricula;
        this.bastidor=bastidor;
        this.cv=cv;
        this.cc=cc;
    }
    public Coche(){}

    public void calcularVelocidad(int velocidad){
    this.velocidad+=velocidad;
    }

    public void mostrarDatos(){
        System.out.println("Matricula " + getMatricula() +" Bastidor " +getBastidor() +" Cilindradas "+getCc() + " Caballos "+getCv()+ " Velocidad " +getVelocidad()) ;
    }




    //recordar que los GUETER Y SETER SON MÉTODOS!!

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
