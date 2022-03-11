package Ejercicio_6;

public class Libro extends Elemento{

    String isbn,autor,editorial;
    int paginas;


    public Libro(int id, String seccion, String titulo, boolean estado, String isbn, String autor, String editorial, int paginas) { /*Constructor: todos los parámetros es esto */
        super(id, seccion, titulo, estado);
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public Libro() {}


    public void mostrarDatos(){
        System.out.println("ID "+id);
        System.out.println("Seccion "+seccion);
        System.out.println("titulo "+titulo);
        System.out.println("Estado "+estado);
        System.out.println("ISBN " +isbn);
        System.out.println("Autor "+autor);
        System.out.println("Editorial "+editorial);
        System.out.println("Paginas "+paginas);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }





}
