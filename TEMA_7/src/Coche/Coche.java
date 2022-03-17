package Coche;

public class Coche {

    private double precio;
    private String marca;
    private String modelo;
    private int velocidad;
    private int opcion;
    Motor motor;


    public Coche(double precio, String marca, String modelo, int velocidad) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }



    public Coche(){}


    public void mostrarDatos(){
        System.out.println("Precio " +precio);
        System.out.println("Marca " +marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Velocidad "+velocidad);
        if (motor!=null) {
            this.motor.mostrarDatos();
        }else {
            System.out.println("El coche no tiene motor");
        }
    }


    public void segunMotor(){

        switch (opcion) {
            case 1:
                precio+=precio*1.25;
                break;
            case 2:
                precio+=precio*1.40;
                break;
            case 3:
                precio+=precio*1.60;
                break;
            case 4:
                precio+=precio*1.80;
                break;

        }
    }


    public class Motor{
        private int cv,cc;


        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }
            public void mostrarDatos(){
                System.out.println("cv "+cv);
                System.out.println("cc "+cc);
            }




        public Motor(){}

    }


    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Coche(Motor motor) {
        this.motor = motor;
    }


}
