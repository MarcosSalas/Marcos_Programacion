import java.util.ArrayList;
//si no pongo nada es objet si pogo T es los que le marque, es este caso PedidoBebida y PedidoComida
public class Restaurante <T> {
//Variables
    protected String  nombre;    //él lo pone private a todas estas variables
    protected int numeroComensalesTotales;
    protected ArrayList<T> listaPedidos; //tipando como T los array solo vas a admitir los pedidos de tipo T q si la T la sustituyo por "PEDIDOS BEBIDAS,lo subtituyo por
    protected double caja;                                                                                                                //PEDIDO BEBIDA EN TODOS LOS LADOS
//constructor


    public Restaurante(String nombre, int numeroComensalesTotales/*,int caja  ##la caja no vá*/) {
        this.nombre = nombre;
        this.numeroComensalesTotales = numeroComensalesTotales;
        listaPedidos=new ArrayList<>();
        // no va this.caja = caja;

    }

    public Restaurante() { //si utilizo este el arraylis es null y no tengo nombre,pero tmb lo puedo poner acá
        listaPedidos=new ArrayList<>();
    }

    //###   ESTA ES LA PARTE QUE HICE MAL, LAS CLASES PEDIDO COMIDA PEDIDO BEBIDA ,SOLO PUEDEN EXISTIR SI EXISTE EL RESTAURANTE -
    // ESTO SE HACE CON CLASE ANIDADA QUE IRÍA DEBAJO

    // Punto 2 CONTINUAMOS CON LAS CLASES COMIDAS Y BEBIDAS
         class PedidoComida extends Pedido {
                    double precio;
                    int numeroConsumiciones;
                    Comidas tipoComida;


        public PedidoComida(double precio, int numeroConsumiciones, Comidas comidas) {
            super(precio, numeroConsumiciones);
            this.tipoComida=comidas;
        }

        @Override
        public void calcularPrecioReal() {
            this.precio = this.precio + (this.precio * Constantes.IVA_COMIDAS);
        }

        @Override
        public void mostrarFactura() {
            super.mostrarFactura();
            System.out.println("Tipo " +tipoComida.name());
            System.out.println("Restaurante "+nombre);
        }
        // ##ESTOS 3 MÉTODOS QUITO AL EXTENDER

    // al Extender este se quita
                   /* public PedidoComida(double precio, int numeroConsumiciones, Comidas tipoC) {
                        this.precio = precio;
                        this.numeroConsumiciones = numeroConsumiciones;
                        this.tipoComida = tipoC;
                        calcularPrecioReal(); // esto tendria que estar aca para que se recalcule el precio y se acumule lo que ya tenía con el IVA de ABAJO ua calculado
                    }*/
        // al Extender este se quita
        /*
                    private void calcularPrecioReal() { // va private porque solo se ejecutará aqui dentro
                        this.precio = this.precio + (this.precio * Constantes.IVA_COMIDAS);
                    }*/
        // al Extender este se quita
        /*
                    public void verFactura()/*Él le llama mostrarFactura*/  // public  por q este método si lo voy a llamar desde fuera
           /*              System.out.println("Nro de consumiciones " + numeroConsumiciones);
                        System.out.println("Tipo de comida " + tipoComida.name()); //para sacar el String asocioado a este ENUM es con el .name
                        System.out.println("Precio " + precio);
                        System.out.println("CIF " + Constantes.CIF);
                        System.out.println("Restaurante " + nombre); //Asi accedo al NOMBRE der RESTAURANTE, porque en la clase hija PedidoComida accedo al padre,puedo tomar su Nombre
                                                                     //y sé y garantizo que la variable nombre nunca va a ser null ,porque primero tengo que crear un Restaurante para
                                                                     // poder crear un pedido comida o pedido bebida

                    }*/
// ## 3 MÉTODOS QUITADOS AL EXTENDER


                   // LAS CLASES ANIDADAS TAMBIEN TIENEN QUE TENER SUS GUETTER Y SETERS



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

                public Comidas getTipoComida() {
                    return tipoComida;
                }

                public void setTipoComida(Comidas tipoComida) {
                    this.tipoComida = tipoComida;
                }
         }




        class PedidoBebida extends Pedido {

                double precio;
                int numeroConsumiciones;
                Bebidas tipoBebida;

// QUITO DESDE AQUI POR LO MISMO DE ARRIBA
/*
                public PedidoBebida(double precio, int numeroConsumiciones, Bebidas tipoB) {
                    this.precio = precio;
                    this.numeroConsumiciones = numeroConsumiciones;
                    this.tipoBebida = tipoB;
                    calcularPrecioReal();  // esto tendria que estar aca para que se recalcule el precio y se acumule lo que ya tenía con el IVA de ABAJO ua calculado
                }


                private void calcularPrecioReal() {
                    this.precio = this.precio + (this.precio * Constantes.IVA_BEBIDAS); // ESTE METODO LO LLAMO DESDE ARRIBA como el caso anterior
                }


                public void verFactura()/*Él le llama mostrarFactura*/  // public  por q este método si lo voy a llamar desde fuera
           /*         System.out.println("Nro de consumiciones " + numeroConsumiciones);
                    System.out.println("Tipo de comida " + tipoBebida.name()); //para sacar el String asocioado a este ENUM es con el .name
                    System.out.println("Precio " + precio);
                    System.out.println("CIF " + Constantes.CIF);
                    System.out.println("Restaurante " + nombre); //Asi accedo al NOMBRE der RESTAURANTE, porque en la clase hija PedidoComida accedo al padre,puedo tomar su Nombre
                    //y sé y garantizo que la variable nombre nunca va a ser null ,porque primero tengo que crear un Restaurante para
                    // poder crear un pedido comida o pedido bebida
                }

*/
// QUITO HASTA AQUI


            public PedidoBebida(double precio, int numeroConsumiciones,Bebidas bebidas) {
                super(precio, numeroConsumiciones);
                this.tipoBebida=bebidas;
            }

            @Override
            public void mostrarFactura() {
                super.mostrarFactura();
                System.out.println("Nombre del restaurante "+nombre);
                System.out.println("Tipo " +tipoBebida.name());
            }

            @Override
            public void calcularPrecioReal() {

                this.precio = this.precio + (this.precio * Constantes.IVA_BEBIDAS);

            }


                      // LAS CLASES ANIDADAS TAMBIEN TIENEN QUE TENER SUS GUETTER Y SETERS

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

                      public Bebidas getTipoBebida() {
                          return tipoBebida;
                      }

                      public void setTipoBebida(Bebidas tipoBebida) {
                          this.tipoBebida = tipoBebida;
                      }

          }


    //  Punto 3 Despues de TERMINAR CON LAS CLASES COMIDAS Y BEBIDAS paso 4 SEGUIMOS CON el método verPedidos



    //metodos
    public void colocarComensales(int comensales){
        if (numeroComensalesTotales >= 50) {
            try {
                new ExcepcionComensales("Restaurante lleno");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else {
            numeroComensalesTotales+=comensales;
        }

    }

    //Una vez que pongo la T  arriba los que le marque, es este caso PedidoBebida y PedidoComida va a ser los que toma y no Objet
    public void registrarPedido(T pedido){
        this.listaPedidos.add(pedido);
        /*
        for ( T item : listaPedidos ) {
            if (item instanceof PedidoComida){
                listaPedidos.add(pedido);
                System.out.println("PedidoComida Registrado ");
            //    ((PedidoComida) item).verFactura();
            } else if (item instanceof ConsumicionBarra){
             //   ((ConsumicionBarra) item).verFactura();
                System.out.println("ConsumicionBarra Registrado ");
                listaPedidos.add(pedido);
            }
            caja+=caja;
        }*/
    }

    public void verPedidos(){ //empiezo a hacer esto y luego sigo con las clases anidadas(clas PedidoComida y PedidoBebida) para poder luego volver aqui
        for ( T pedido : listaPedidos ) {
            ((Pedido)pedido).mostrarFactura();
            this.caja = ((Pedido)pedido).getPrecio();
        }
        System.out.println("El precio acumulado es de "+caja);
    }


    //Set-get


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroComensalesTotales() {
        return numeroComensalesTotales;
    }

    public void setNumeroComensalesTotales(int numeroComensalesTotales) {
        this.numeroComensalesTotales = numeroComensalesTotales;
    }

    public ArrayList<T> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<T> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }



        }
