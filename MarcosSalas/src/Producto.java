public class Producto {
   public double precio;
    public int numeroConsumiciones;


    public Producto(double precio, int numeroConsumiciones) {
        this.precio = precio;
        this.numeroConsumiciones = numeroConsumiciones;

    }

    public Producto() {
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
