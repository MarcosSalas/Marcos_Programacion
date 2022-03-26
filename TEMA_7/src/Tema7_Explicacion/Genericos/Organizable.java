package Tema7_Explicacion.Genericos;

public interface Organizable<T,S> {

    void organizar(T criterio);
    S listar();
}
