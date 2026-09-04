package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    String direccion;
    List<Libro> libros;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    };

    public Libro buscarPorlsbn(String lsbn){
        for (Libro l : libros){
            if (l.getISBN().equals(lsbn)) {
                return l;
            };
        };
        return null;
    };

    public void retirarLibro(String lsbn){
        Libro sacar = null;
        for (Libro l : libros){
            if (l.getISBN().equals(lsbn)) {
                sacar = l;
                break;
            };
        };
        libros.remove(sacar);
    };

    public int contarLibros(){
        int contador = 0;
        for (int i = 0; i < libros.size(); i++ ){
            contador ++;
        };
        return contador;
    };

    public Libro obtenerLibroMasExtenso(){
        Libro mayor = null;
        for (Libro l : libros){
            if (mayor == null){
                mayor = l;
            }
            if (mayor.getCantPag() < l.getCantPag() ){
                mayor = l;
            };
        };
        return mayor;
    };

    public void mostrarCatalogo(){
        System.out.println(this.nombre);
        for (Libro l:libros) {
            System.out.println(l);
        };
    };


}
