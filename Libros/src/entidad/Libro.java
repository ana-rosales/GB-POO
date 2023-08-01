/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío.
 */
package entidad;

/**
 *
 * @author Ana Paula
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int noPag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int noPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.noPag = noPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNoPag() {
        return noPag;
    }

    public void setNoPag(int noPag) {
        this.noPag = noPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", noPag=" + noPag + '}';
    }
    
    
}
