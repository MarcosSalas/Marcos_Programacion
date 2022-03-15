package Ejemplo;

public class Entrada {
    public static void main(String[] args) {

        ClaseC claseC=new ClaseC();
        ClaseB claseB=new ClaseB();
        claseC.registrarMensaje(claseB);
        ClaseA claseA=new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("El mensaje asda de la clase ");
            }
        };
    }
}
