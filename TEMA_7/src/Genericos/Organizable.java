package Genericos;

public interface Organizable <T,S>{ //poner el implement en coleccion

    void organizar(T criterio);//PARAMERTO O CRITERIO
    S listar(); // S devuelve un nro ,parametro genérico

}
