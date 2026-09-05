package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class HistoriaClinica {
    private int numeroHistoria;
    private List<Consulta> consultas;
    private int cantidadConsultas;
    private String fechaCreacion;
    private int CAPACIDAD_MAXIMA = 10;

    public HistoriaClinica(int numeroHistoria, String fechaCreacion) {
        this.numeroHistoria = numeroHistoria;
        this.consultas = new ArrayList<>();
        this.cantidadConsultas = 0;
        this.fechaCreacion = fechaCreacion;
    }

    public int getNumeroHistoria() {
        return numeroHistoria;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public int getCantidadConsultas() {
        return cantidadConsultas;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public boolean agregarConsulta(Consulta consulta) {
        if (cantidadConsultas < CAPACIDAD_MAXIMA) {
            consultas.add(consulta);
            cantidadConsultas++;
            return true;
        }

        return false;
    }

    public List<Consulta> buscarConsultasPorFecha(String fecha) {
        List<Consulta> resultado = new ArrayList<>();

        for (Consulta consulta : consultas) {
            if (consulta.getFechaAtencion()==fecha) {
                resultado.add(consulta);
            }
        }

        return resultado;
    }

    public int contarConsultasConSeguimiento() {
        int cantidad = 0;

        for (Consulta consulta : consultas) {
            if (consulta.requiereSeguimiento()) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public double calcularCostoPromedio() {
        if (consultas.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Consulta consulta : consultas) {
            total += consulta.getCosto();
        }

        return total / consultas.size();
    }

    public Consulta obtenerConsultaMayorCosto() {
        if (consultas.isEmpty()) {
            return null;
        }

        Consulta mayor = consultas.get(0);

        for (Consulta consulta : consultas) {
            if (consulta.getCosto() > mayor.getCosto()) {
                mayor = consulta;
            }
        }

        return mayor;
    }

    public Consulta obtenerUltimaConsulta() {
        if (consultas.isEmpty()) {
            return null;
        }

        return consultas.get(consultas.size() - 1);
    }

    public int contarDiagnosticos(String diagnostico) {
        int cantidad = 0;

        for (Consulta consulta : consultas) {
            if (consulta.getDiagnostico()==diagnostico) {
                cantidad++;
            }
        }

        return cantidad;
    }
}
