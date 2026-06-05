import java.util.ArrayList;

public class SistemaConsultorio {

    private ArrayList<Doctor> doctores;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Cita> citas;
    private ArrayList<Administrador> administradores;

    public SistemaConsultorio() {
        doctores = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
        administradores = new ArrayList<>();
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void crearCita(Cita cita) {
        citas.add(cita);
    }

    public void agregarAdministrador(Administrador administrador) {
        administradores.add(administrador);
    }

    public void consultarDoctores() {
        System.out.println("===== LISTA DE DOCTORES =====");

        if (doctores.isEmpty()) {
            System.out.println("No hay doctores registrados.");
        } else {
            for (Doctor doctor : doctores) {
                System.out.println(doctor.getDatos());
            }
        }
    }

    public void consultarPacientes() {
        System.out.println("===== LISTA DE PACIENTES =====");

        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente paciente : pacientes) {
                System.out.println(paciente.getDatos());
            }
        }
    }

    public void consultarCitas() {
        System.out.println("===== LISTA DE CITAS =====");

        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
        } else {
            for (Cita cita : citas) {
                System.out.println(cita.getDatos());
            }
        }
    }

    public Doctor buscarDoctor(String idDoctor) {
        for (Doctor doctor : doctores) {
            if (doctor.getIdDoctor().equals(idDoctor)) {
                return doctor;
            }
        }
        return null;
    }

    public Paciente buscarPaciente(String idPaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getIdPaciente().equals(idPaciente)) {
                return paciente;
            }
        }
        return null;
    }

    public boolean validarAdministrador(String usuario, String password) {
        for (Administrador administrador : administradores) {
            if (administrador.iniciarSesion(usuario, password)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }
}