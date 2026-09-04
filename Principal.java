public class Principal {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Racing Club", "Primera");
        Entrenador dt1 = new Entrenador("12345678", "Gustavo Costas", 25);
        Entrenador dt2 = new Entrenador("87654321", "Juan Pablo Vojvoda", 5);

        equipo.asignarEntrenador(null);

        equipo.asignarEntrenador(dt1);
        equipo.mostrarInformacion();

        System.out.println("Cambio de DT");
        equipo.cambiarEntrenador(dt2);
        equipo.mostrarInformacion();
    }
}