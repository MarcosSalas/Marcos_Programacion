package Tema7_Explicacion.ClasesAbC;

public class ClaseC { //NO EXTIENDE,REGISTRA MENSAJE
    public void registrarMensaje(ClaseA claseA){
        //clase a y clase b
        claseA.mostrarMensaje();
        claseA.mensajeAbstracto();
    }

}
