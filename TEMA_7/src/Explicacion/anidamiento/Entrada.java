package Explicacion.anidamiento;



    public class Entrada {

       public static void main(String[] args) {
            Externa externa = new Externa();
            Externa.Interna interna = externa.new Interna();
            interna.ejecucionInterna();
        }

    }