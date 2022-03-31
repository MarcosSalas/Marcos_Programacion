public final class PedidoComida extends Producto {
//variables
     public tipoComida tipoComida;

//constructores

     public PedidoComida(double precio,int numeroConsumiciones,tipoComida tipoComida ) {
          this.precio = precio;
          this.numeroConsumiciones = numeroConsumiciones;
          this.tipoComida = tipoComida;
     }

     //metodos


     public void calcularPrecioReal(){
          precio+=Constantes.IVA_COMIDAS;
     };


     public void verFactura() {
          System.out.println("Precio "+precio);
          System.out.println("Nro de consumiciones "+numeroConsumiciones);
          System.out.println("Tipo de comida "+tipoComida);
          System.out.println("CIF "+Constantes.CIF);

     }

     //get-set


     public double getPrecio() {
          return precio;
     }

     public int getNumeroConsumiciones() {
          return numeroConsumiciones;
     }

     public tipoComida getTipoComida() {
          return tipoComida;
     }

     public void setTipoComida(tipoComida tipoComida) {
          this.tipoComida = tipoComida;
     }
}
