package Ejercicio_6;

public class Revista extends Elemento {

    String isbn;

    public Revista(int id, String seccion, String titulo, boolean estado, String isbn) {
        super(id, seccion, titulo, estado);
        this.isbn = isbn;
    }

    public Revista() { }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
