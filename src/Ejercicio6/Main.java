package Ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Paciente paciente = null;
        int opcion;

        do {
            System.out.println();
            System.out.println("===== CLÍNICA =====");
            System.out.println("1. Ingresar paciente");
            System.out.println("2. Ingresar consulta");
            System.out.println("3. Ver información del paciente");
            System.out.println("4. Ver estadísticas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println();
                    System.out.println("===== INGRESAR PACIENTE =====");

                    System.out.print("Número de identificación: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre y apellido: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Fecha de nacimiento: ");
                    String fechaNacimiento = scanner.nextLine();

                    System.out.print("Obra social: ");
                    String obraSocial = scanner.nextLine();

                    System.out.print("Fecha de creación de la historia clínica: ");
                    String fechaCreacion = scanner.nextLine();

                    paciente = new Paciente(
                            numero,
                            nombre,
                            fechaNacimiento,
                            obraSocial,
                            fechaCreacion
                    );

                    System.out.println("Paciente registrado correctamente.");
                    break;

                case 2:
                    if (paciente == null) {
                        System.out.println("Primero debe ingresar un paciente.");
                        break;
                    }

                    System.out.println();
                    System.out.println("===== INGRESAR CONSULTA =====");

                    System.out.print("Fecha de atención: ");
                    String fecha = scanner.nextLine();

                    System.out.print("Motivo: ");
                    String motivo = scanner.nextLine();

                    System.out.print("Diagnóstico: ");
                    String diagnostico = scanner.nextLine();

                    System.out.print("Tratamiento: ");
                    String tratamiento = scanner.nextLine();

                    System.out.print("Costo: ");
                    double costo = scanner.nextDouble();

                    System.out.print("¿Requiere seguimiento? (true/false): ");
                    boolean seguimiento = scanner.nextBoolean();
                    scanner.nextLine();

                    Consulta consulta = new Consulta(
                            fecha,
                            motivo,
                            diagnostico,
                            tratamiento,
                            costo,
                            seguimiento
                    );

                    if (paciente.registrarConsulta(consulta)) {
                        System.out.println("Consulta registrada correctamente.");
                    } else {
                        System.out.println("No se pudo registrar la consulta.");
                    }

                    break;

                case 3:
                    if (paciente == null) {
                        System.out.println("Primero debe ingresar un paciente.");
                        break;
                    }

                    System.out.println();
                    System.out.println("===== INFORMACIÓN DEL PACIENTE =====");

                    System.out.println("Número de identificación: " +
                            paciente.getNumeroIdentificacion());

                    System.out.println("Nombre y apellido: " +
                            paciente.getNombreApellido());

                    System.out.println("Fecha de nacimiento: " +
                            paciente.getFechaNacimiento());

                    System.out.println("Obra social: " +
                            paciente.getObraSocial());

                    System.out.println("Número de historia clínica: " +
                            paciente.getHistoriaClinica().getNumeroHistoria());

                    System.out.println("Fecha de creación: " +
                            paciente.getHistoriaClinica().getFechaCreacion());

                    System.out.println("Cantidad de consultas: " +
                            paciente.getHistoriaClinica().getCantidadConsultas());

                    System.out.println("Costo total: $" +
                            paciente.obtenerCostoTotalConsultas());

                    System.out.println("Necesita seguimiento: " +
                            paciente.necesitaSeguimiento());

                    break;

                case 4:
                    if (paciente == null) {
                        System.out.println("Primero debe ingresar un paciente.");
                        break;
                    }

                    System.out.println();
                    System.out.println("ESTADÍSTICAS");
                    System.out.println("Cantidad de consultas: " + paciente.getHistoriaClinica().getCantidadConsultas());
                    System.out.println("Costo total: $" + paciente.obtenerCostoTotalConsultas());
                    System.out.println("Costo promedio: $" + paciente.getHistoriaClinica().calcularCostoPromedio());
                    Consulta mayorCosto = paciente.getHistoriaClinica().obtenerConsultaMayorCosto();

                    if (mayorCosto != null) {
                        System.out.println("Consulta de mayor costo: $" + mayorCosto.getCosto());
                    } else {
                        System.out.println("Consulta de mayor costo: No hay consultas.");
                    }

                    Consulta ultimaConsulta = paciente.getHistoriaClinica().obtenerUltimaConsulta();

                    if (ultimaConsulta != null) {
                        System.out.println("Fecha de última consulta: " + ultimaConsulta.getFechaAtencion());
                    } else {
                        System.out.println("Última consulta: No hay consultas.");
                    }

                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}