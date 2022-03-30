package Explicacion.anidamiento;

public class Externa {
    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.ejecucionInterna();
    }

    public class Interna {
        public void ejecucionInterna() {
        }
    }
}