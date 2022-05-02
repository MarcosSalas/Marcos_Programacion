public abstract class Pedido {
    double precio;             // esto y
    int numeroConsumiciones;   // esto , vienen en común, el tipo de abajo no viene en común

    public Pedido(double precio, int numeroConsumiciones) {
        this.precio = precio;
        this.numeroConsumiciones = numeroConsumiciones;
        calcularPrecioReal();//no olvidar de llamar a este metodo despues de hacerlo
    }
    public abstract void  calcularPrecioReal(); // este metodo no lo puedo escribir porque cada pedido lo hace diferente,entonces no lo sabria,por eso la clase y metodo son abstractas

    public void mostrarFactura(){
        System.out.println("Precio " +precio);
        System.out.println("Consumiciones " +numeroConsumiciones);
        System.out.println("CIF "+Constantes.CIF);//el cif es común a los dos

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroConsumiciones() {
        return numeroConsumiciones;
    }

    public void setNumeroConsumiciones(int numeroConsumiciones) {
        this.numeroConsumiciones = numeroConsumiciones;
    }
}
