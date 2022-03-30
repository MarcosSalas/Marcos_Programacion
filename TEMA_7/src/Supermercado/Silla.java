package Supermercado;

public final class Silla extends Mueble {//final porque no hereda nadie
    //variables
    private int patas; //private porque no extiende nadie
    //siempre q pongo abstract es protected ,siempre q pongo final pongo private

    //constructores
    public Silla(String material, String peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }
    public Silla() {
    }
    //metodos

    @Override
    public void mostrarDatosMueble() {
        super.mostrarDatosMueble();
        System.out.println("Patas "+patas);
    }
    //metodos-set-get


    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
