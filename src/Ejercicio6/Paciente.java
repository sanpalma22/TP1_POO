package Ejercicio6;

public class Paciente {
    private int numeroIdentificacion;
    private String nombreApellido;
    private String fechaNacimiento;
    private String obraSocial;
    private HistoriaClinica historiaClinica;

    public Paciente(int numeroIdentificacion, String nombreApellido,
                    String fechaNacimiento, String obraSocial,
                    String fechaCreacionHistoria) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreApellido = nombreApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.obraSocial = obraSocial;
        this.historiaClinica = new HistoriaClinica(
                numeroIdentificacion,
                fechaCreacionHistoria
        );
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public int consultarEdad() {
        return 0;
    }

    public boolean registrarConsulta(Consulta consulta) {
        return historiaClinica.agregarConsulta(consulta);
    }

    public double obtenerCostoTotalConsultas() {
        double total = 0;

        for (Consulta consulta : historiaClinica.getConsultas()) {
            total += consulta.calcularCostoFinal(tieneObraSocial());
        }

        return total;
    }

    public boolean necesitaSeguimiento() {
        return historiaClinica.contarConsultasConSeguimiento() > 0;
    }

    public boolean tieneObraSocial() {
        return obraSocial != null;
    }
}
