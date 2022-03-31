import java.util.ArrayList;

public class Restaurante<T> {
//Variables
    protected String  nombre;
    protected int numeroComensalesTotales;
    protected ArrayList<T> listaPedidos;
    protected int caja;
//constructor


    public Restaurante(String nombre, int numeroComensalesTotales,int caja) {
        this.nombre = nombre;
        this.numeroComensalesTotales = numeroComensalesTotales;
        listaPedidos=new ArrayList<>();
        this.caja = caja;
    }

    public Restaurante() {
    }

    //metodos
    public void colocarComensales(int numero){
        numeroComensalesTotales+=numero;
        try {
            if (numeroComensalesTotales>=50) {
                throw new MyException("No entran mas comensales");
            }
            }catch (MyException e){
                System.out.println(e.getMessage());
        }
    }
    public void registrarPedido(T pedido){
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
        }

    }











    public void verPedidos(){
        for ( T item : listaPedidos ) {
            if (item instanceof PedidoComida){
                System.out.println("Restaurante "+nombre);
                ((PedidoComida) item).verFactura();
            } else if (item instanceof ConsumicionBarra){
                ((ConsumicionBarra) item).verFactura();
            }
            caja+=caja;
        }
        System.out.println(caja);
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

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }


}
