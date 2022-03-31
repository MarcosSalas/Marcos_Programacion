public final class ConsumicionBarra extends Producto{
//variables

public tipoBebidas tipoBebidas;
    //constructores
    public ConsumicionBarra(double precio,int numeroConsumiciones,tipoBebidas tipoBebidas ) {
        this.precio = precio;
        this.numeroConsumiciones = numeroConsumiciones;
        this.tipoBebidas = tipoBebidas;

    }

    //metodos


    public void calcularPrecioReal(){
        precio+=Constantes.IVA_BEBIDAS;
    };


    public void verFactura() {
        System.out.println("Precio "+precio);
        System.out.println("Nro de consumiciones "+numeroConsumiciones);
        System.out.println("Tipo de comida "+tipoBebidas);
        System.out.println("CIF "+Constantes.CIF);

    }


    //get-set


    public tipoBebidas getTipoBebidas() {
        return tipoBebidas;
    }

    public void setTipoBebidas(tipoBebidas tipoBebidas) {
        this.tipoBebidas = tipoBebidas;
    }
}
