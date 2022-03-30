package Supermercado;
/* LO ABSTRACTO LO PUSE A LO ULTIMO DEL EJERCICIO CASI,DESPUES DE HACER LAS IMPLEMENTACIONES Y LAS EXTENCIONES DE V -T*/
public abstract class Mueble implements Inventariable { //Abstract x que quiero que se muestre las clases,silla,mesa,pero no mueble
//variables
    protected String material,peso; //protected porque solamente la heredan las clases hijas
    protected double precio; //siempre q pongo abstract es protected ,siempre q pongo final pongo private
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override // COMO LOS HIJOS REQUIEREN DE ESTAS CALASES SE PONEN PARA QUE SE PUEDAN HEREDAR
    public void calcularPrecio() {
        setPrecio(this.precio+(this.precio*Inventariable.IVA_ALIMENTOS)); ; //corragido en clase ...
        //si pones el Set aca ,no hace FALTA PASARLO ARRIBA COMO HIZO ALEX,SINO SI
        //el set Precio le digo lo que quiero que tenga la variable precio
        System.out.println("Precio Final "+ precio);

    }
}
