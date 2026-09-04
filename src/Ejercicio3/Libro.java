package Ejercicio3;

public class Libro {
    String ISBN;
    String titulo;
    String autor;
    int cantPag;

    public Libro(String ISBN, String titulo, String autor, int cantPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPag = cantPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
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

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantPag=" + cantPag +
                '}';
    }
}
