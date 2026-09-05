package Ejercicio6;

public class Consulta {
    private String fechaAtencion;
    private String motivo;
    private String diagnostico;
    private String tratamiento;
    private double costo;
    private boolean requiereSeguimiento;

    public Consulta(String fechaAtencion, String motivo, String diagnostico,
                    String tratamiento, double costo, boolean requiereSeguimiento) {
        this.fechaAtencion = fechaAtencion;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.costo = costo;
        this.requiereSeguimiento = requiereSeguimiento;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public double getCosto() {
        return costo;
    }

    public boolean requiereSeguimiento() {
        return requiereSeguimiento;
    }

    public double calcularCostoFinal(boolean poseeObraSocial) {
        if (poseeObraSocial) {
            return costo * 0.8;
        }
        return costo;
    }

    public void mostrarResumen() {
        System.out.println("Fecha: " + fechaAtencion);
        System.out.println("Motivo: " + motivo);
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println("Tratamiento: " + tratamiento);
        System.out.println("Costo: $" + costo);
        System.out.println("Requiere seguimiento: " + requiereSeguimiento);
    }
}

