public class Cita {

    private String idCita;
    private String fecha;
    private String hora;
    private String motivo;

    private Doctor doctor;
    private Paciente paciente;

    public Cita(String idCita, String fecha, String hora, String motivo) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public void asignarDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void asignarPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void confirmarCita() {
        System.out.println("Cita registrada correctamente.");
    }

    public String getDatos() {

        String datosDoctor = (doctor != null)
                ? doctor.getNombreCompleto()
                : "Sin doctor";

        String datosPaciente = (paciente != null)
                ? paciente.getNombreCompleto()
                : "Sin paciente";

        return "ID Cita: " + idCita +
                " | Fecha: " + fecha +
                " | Hora: " + hora +
                " | Motivo: " + motivo +
                " | Doctor: " + datosDoctor +
                " | Paciente: " + datosPaciente;
    }
}
