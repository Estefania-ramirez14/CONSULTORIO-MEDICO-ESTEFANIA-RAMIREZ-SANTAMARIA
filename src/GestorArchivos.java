import java.io.*;
import java.util.ArrayList;

public class GestorArchivos {

    private final String CARPETA_DB = "db/";

    public void guardarDoctores(ArrayList<Doctor> doctores) {

        File archivo = new File(CARPETA_DB + "doctores.csv");

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {

            for (Doctor doctor : doctores) {

                writer.println(
                        doctor.getIdDoctor() + "," +
                                doctor.getNombreCompleto() + "," +
                                doctor.getEspecialidad()
                );
            }

            System.out.println("Doctores guardados correctamente.");

        } catch (IOException e) {

            System.out.println("Error al guardar doctores.");
        }
    }

    public void guardarPacientes(ArrayList<Paciente> pacientes) {

        File archivo = new File(CARPETA_DB + "pacientes.csv");

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {

            for (Paciente paciente : pacientes) {

                writer.println(
                        paciente.getIdPaciente() + "," +
                                paciente.getNombreCompleto()
                );
            }

            System.out.println("Pacientes guardados correctamente.");

        } catch (IOException e) {

            System.out.println("Error al guardar pacientes.");
        }
    }

    public void guardarCitas(ArrayList<Cita> citas) {

        File archivo = new File(CARPETA_DB + "citas.csv");

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {

            for (Cita cita : citas) {

                writer.println(cita.getDatos());
            }

            System.out.println("Citas guardadas correctamente.");

        } catch (IOException e) {

            System.out.println("Error al guardar citas.");
        }
    }
}