public class Medico {
    private String matricula;
    private String nombre;
    private String especialidad;
    private Paciente[] pacientes;
    private int cantidadPacientes;

    public Medico(String matricula, String nombre, String especialidad, int cantidadPacientes) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.especialidad = especialidad;
        int maxPacientes = 10;
        this.pacientes = new Paciente[maxPacientes];
        this.cantidadPacientes = 0;
    }

     public boolean asignarPaciente(Paciente paciente){
        if (cantidadPacientes < pacientes.length){
            pacientes[cantidadPacientes] = paciente;
            cantidadPacientes++;
            return true;
        }
        return false;
     }
     public Paciente buscarPaciente(String dni){
        for (int i = 0; i < cantidadPacientes; i++) {
            if (pacientes[i].getDni().equals(dni)){
                return pacientes[i];
            }
        }
        return null;
     }

     public boolean eliminarPaciente(String dni){
        for (int i = 0; i < cantidadPacientes; i++){
            if (pacientes[i].getDni().equals(dni)){
                pacientes[i] = pacientes[cantidadPacientes - 1];
                pacientes[cantidadPacientes -1] = null;
                cantidadPacientes--;
                return true;
            }

        }
        return false;
     }
     public int cantidadPacientes(){
        return cantidadPacientes;
     }
     public void mostrarPacientes(){
         System.out.println("Pacientes del Dr "+nombre+" :");
         for (int i = 0;i < cantidadPacientes; i++){
             System.out.println("Nombre del paciente: "+pacientes[i].getNombre()+ " | DNI: "+pacientes[i].getDni());
         }
     }
}
