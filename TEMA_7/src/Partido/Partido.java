package Partido;

public class Partido {

    private boolean jugado ;
    private int golesLocal, golesVisitante;
    Equipo equipo;


    public Partido(boolean jugado, int golesLocal, int golesVisitante) {
        this.jugado = jugado;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    public Partido(){}



    public agregarGolesLocal{

    }



    public class Equipo{    }






    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
}
