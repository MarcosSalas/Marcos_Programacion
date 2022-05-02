public class Entrada {
    public static void main(String[] args) {

 /*         ##     CORREGIDO    ###    */
        Restaurante restaurante = new Restaurante();
        Restaurante<Restaurante.PedidoComida> restauranteComida = new Restaurante();
        Restaurante<Restaurante.PedidoBebida> restauranteBebida = new Restaurante();
        Restaurante<Pedido> restauranteTodo = new Restaurante();

        //restauranteComida.registrarPedido();//solo voy a poder registrar pedido Comida x q depende de la creacion de la clase
       // restauranteBebida.registrarPedido(); //solo voy a poder registrar pedido bebida x q depende de la creacion de la clase
        Restaurante.PedidoBebida pedidoBebida = restaurante.new PedidoBebida(5,3,Bebidas.Copas); // asi sería crearlo a partir del restaurante ,estoy creando el pedido a partir del restaurante
        Restaurante.PedidoComida pedidoComida = restaurante.new PedidoComida(10,1,Comidas.Menu); // asi sería crearlo a partir del restaurante ,estoy creando el pedido a partir del restaurante

        restauranteComida.registrarPedido(pedidoComida);
        restauranteBebida.registrarPedido(pedidoBebida);

        restauranteTodo.registrarPedido(pedidoBebida);
        restauranteTodo.registrarPedido(pedidoComida);



      /*  Restaurante<PedidoComida> restaurante0 =new Restaurante("Res0",0,0);
        PedidoComida restaurante2=new PedidoComida(10,4,tipoComida.Racciones);
        restaurante0.registrarPedido(restaurante2);

        restaurante0.verPedidos();

         PedidoComida restaurante1=new PedidoComida(20,3,tipoComida.Menu);


        Restaurante<ConsumicionBarra> restaurante01 =new Restaurante("Res2",0,0);

        ConsumicionBarra barra=new ConsumicionBarra(3,6,tipoBebidas.Copas);

        restaurante01.registrarPedido(barra);



        ConsumicionBarra barra1=new ConsumicionBarra(5,7,tipoBebidas.Cervezas);

        Restaurante restaurante=new Restaurante();


        restaurante01.verPedidos();
        restaurante0.verPedidos();
        restaurante2.verFactura();
*/
    }

}
