public class Entrenador {
    private String dni;
    private String nombre;
    private int aniosExperiencia;

    public Entrenador(String dni, String nombre, int aniosExperiencia) {
        this.dni = dni;
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }
}