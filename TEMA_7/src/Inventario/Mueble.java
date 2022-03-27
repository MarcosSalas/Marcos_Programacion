package Inventario;

public abstract class Mueble implements Inventariable { //Abstract x que quiero que se muestre las clases,silla,mesa,pero no mueble
//variables
    protected String material,peso; //protected porque solamente la heredan las clases hijas
    protected int precio;
//constructores

    public Mueble(String material, String peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    public Mueble() {
    }
    //metodos
public void mostrarDatosMueble(){
    System.out.println("Material "+material);
    System.out.println("Peso "+peso);
    System.out.println("Precio "+precio);
}
//metodos set-get


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void calcularPrecio() {
        this.precio=this.precio*Inventariable.IVA_MUEBLES; //VER SI EL THIS.PRECIO ESTÁ BIEN
    }
}
