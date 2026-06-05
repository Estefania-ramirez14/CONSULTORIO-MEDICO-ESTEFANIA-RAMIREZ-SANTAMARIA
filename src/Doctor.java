public class Doctor {

    private String idDoctor;
    private String nombreCompleto;
    private String especialidad;

    public Doctor(String idDoctor, String nombreCompleto, String especialidad) {
        this.idDoctor = idDoctor;
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDatos() {
        return "ID: " + idDoctor +
                " | Nombre: " + nombreCompleto +
                " | Especialidad: " + especialidad;
    }
}