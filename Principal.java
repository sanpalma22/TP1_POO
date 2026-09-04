public class Principal {
    public static void main(String[] args){
            Paciente p1 = new Paciente("46498122", "Martin Diaz", "OSDE");
            Paciente p2 = new Paciente("16488123", "Agustina Suarez", "IOMA");

            Medico dr = new Medico("MP111", "Derek Shepherd","Clinica",5);

            dr.asignarPaciente(p1);
            dr.asignarPaciente(p2);

            dr.mostrarPacientes();
            System.out.println("Total de pacientes: " + dr.cantidadPacientes());

            System.out.println("Eliminar a Agustina..");
            dr.eliminarPaciente("16488123");
            dr.mostrarPacientes();

            System.out.println("Comprobamos si sigue existiendo..");
            System.out.println("Nombre: "+p2.getNombre()+" | Obra social: "+ p2.getObraSocial());
    }
}
