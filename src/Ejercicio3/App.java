package Ejercicio3;

public class App {
    public static void main(String[] args){
        Libro l1 = new Libro("101", "Cien años de soledad", "Gabriel García Márquez", 471);
        Libro l2 = new Libro("102", "Ficciones", "Jorge Luis Borges", 224);
        Libro l3 = new Libro("103", "1984", "George Orwell", 328);
        Libro l4 = new Libro("104", "El túnel", "Ernesto Sabato", 160);
        Libro l5 = new Libro("105", "Rayuela", "Julio Cortázar", 736);
        Biblioteca uade = new Biblioteca("uade", "Monserrat");
        uade.agregarLibro(l1);
        uade.agregarLibro(l2);
        uade.agregarLibro(l3);
        uade.agregarLibro(l4);
        uade.agregarLibro(l5);
        Biblioteca yenny = new Biblioteca("yenny", "rivadavia");
        Libro moverLibro = uade.buscarPorlsbn("101");
        uade.retirarLibro("101");
        yenny.agregarLibro(moverLibro);
        uade.mostrarCatalogo();
        yenny.mostrarCatalogo();
    };
}
