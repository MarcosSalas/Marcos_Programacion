package Tema7_Explicacion.ClasesAbC;

public abstract class ClaseA { //abstracta no se puede inplementar
    public void mostrarMensaje(){
        System.out.println("Mensaje lanzado desde la clase A");
    }

    public void mensajeAbstracto(){
        System.out.println("no se puede implementar" );
    }

}
