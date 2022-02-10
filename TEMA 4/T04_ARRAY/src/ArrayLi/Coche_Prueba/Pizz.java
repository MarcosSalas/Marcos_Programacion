/*package ArrayLi.Coche_Prueba;

public class Pizz {

    Scanner teclado = new Scanner(System.in);
    Pizzeria pizzeria = new Pizzeria();
    int opcion = 0;
    String nombrePedidio;
    int numeroIngredientes;
        do {

        System.out.println("1-Realizar pedido");
        System.out.println("1-Servir pedido");
        System.out.println("1-Ver pedidos pedientes");
        System.out.println("1-Ver caja");
        System.out.println("Introduce opción: ");
        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Dime nombre");
                nombrePedidio = teclado.next();
                System.out.println("Dime numero ingredientes");
                numeroIngredientes = teclado.nextInt();
                Pizza pizza = new Pizza(1,nombrePedidio);
                for (int i = 0; i < numeroIngredientes; i++) {
                    String nombre;
                    double costeIngrediente;
                    System.out.println("Dime nombre de ingrediente");
                    nombre = teclado.next();
                    System.out.println("Dime coste ingrediente");
                    costeIngrediente = teclado.nextDouble();
                    Ingrediente ingrediente = new Ingrediente(nombre,costeIngrediente);
                    pizza.agregarIngrediente(ingrediente);
                }
                pizzeria.anadirPedido(pizza);

                break;
            case 2:
                pizzeria.mostrarPendientes();
                break;
        }

    }while (opcion!=5);
}
*/