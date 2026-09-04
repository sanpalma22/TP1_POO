public class Equipo {
    private String nombre;
    private String categoria;
    private Entrenador entrenador;

    public Equipo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.entrenador = null;
    }

    public void asignarEntrenador(Entrenador entrenador) {
        if (entrenador != null) {
            this.entrenador = entrenador;
        } else {
            System.out.println("Error: El entrenador no puede ser nulo");
        }
    }

    public void cambiarEntrenador(Entrenador nuevoEntrenador) {
        asignarEntrenador(nuevoEntrenador);
    }

    public Entrenador obtenerEntrenador() {
        return entrenador;
    }

    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre + " | Categoria: " + categoria);
        if (entrenador != null) {
            System.out.println("DT actual: " + entrenador.getNombre());
        } else {
            System.out.println("DT actual: Ninguno");
        }
    }
}