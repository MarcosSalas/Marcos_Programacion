public class Entrada {
    public static void main(String[] args) {



        Restaurante<PedidoComida> restaurante0 =new Restaurante("Res0",0,0);
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

    }

}
