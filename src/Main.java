import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SistemaConsultorio sistema = new SistemaConsultorio();

        Administrador admin =
                new Administrador(
                        "A1",
                        "admin",
                        "1234"
                );

        sistema.agregarAdministrador(admin);

        System.out.println("===== SISTEMA DE CONSULTORIO =====");

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        if (!sistema.validarAdministrador(usuario, password)) {

            System.out.println("Acceso denegado.");
            return;
        }

        System.out.println("Acceso correcto.");

        int opcion;

        do {

            System.out.println("\n===== MENÚ PRINCIPAL =====");

            System.out.println("1. Alta Doctor");
            System.out.println("2. Alta Paciente");
            System.out.println("3. Crear Cita");
            System.out.println("4. Consultar Doctores");
            System.out.println("5. Consultar Pacientes");
            System.out.println("6. Consultar Citas");
            System.out.println("7. Salir");

            System.out.print("Seleccione opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {

                case 1:

                    System.out.print("ID Doctor: ");
                    String idDoctor =
                            scanner.nextLine();

                    System.out.print("Nombre Doctor: ");
                    String nombreDoctor =
                            scanner.nextLine();

                    System.out.print("Especialidad: ");
                    String especialidad =
                            scanner.nextLine();

                    Doctor doctor =
                            new Doctor(
                                    idDoctor,
                                    nombreDoctor,
                                    especialidad
                            );

                    sistema.agregarDoctor(doctor);

                    System.out.println(
                            "Doctor registrado."
                    );

                    break;

                case 2:

                    System.out.print("ID Paciente: ");
                    String idPaciente =
                            scanner.nextLine();

                    System.out.print("Nombre Paciente: ");
                    String nombrePaciente =
                            scanner.nextLine();

                    Paciente paciente =
                            new Paciente(
                                    idPaciente,
                                    nombrePaciente
                            );

                    sistema.agregarPaciente(
                            paciente
                    );

                    System.out.println(
                            "Paciente registrado."
                    );

                    break;

                case 3:

                    System.out.print("ID Cita: ");
                    String idCita =
                            scanner.nextLine();

                    System.out.print("Fecha: ");
                    String fecha =
                            scanner.nextLine();

                    System.out.print("Hora: ");
                    String hora =
                            scanner.nextLine();

                    System.out.print("Motivo: ");
                    String motivo =
                            scanner.nextLine();

                    System.out.print("ID Doctor: ");
                    String buscarDoctor =
                            scanner.nextLine();

                    System.out.print("ID Paciente: ");
                    String buscarPaciente =
                            scanner.nextLine();

                    Doctor doctorEncontrado =
                            sistema.buscarDoctor(
                                    buscarDoctor
                            );

                    Paciente pacienteEncontrado =
                            sistema.buscarPaciente(
                                    buscarPaciente
                            );

                    if (doctorEncontrado == null ||
                            pacienteEncontrado == null) {

                        System.out.println(
                                "Doctor o paciente inexistente."
                        );

                    } else {

                        Cita cita =
                                new Cita(
                                        idCita,
                                        fecha,
                                        hora,
                                        motivo
                                );

                        cita.asignarDoctor(
                                doctorEncontrado
                        );

                        cita.asignarPaciente(
                                pacienteEncontrado
                        );

                        sistema.crearCita(cita);

                        System.out.println(
                                "Cita creada correctamente."
                        );
                    }

                    break;

                case 4:

                    sistema.consultarDoctores();

                    break;

                case 5:

                    sistema.consultarPacientes();

                    break;

                case 6:

                    sistema.consultarCitas();

                    break;

                case 7:

                    System.out.println(
                            "Saliendo del sistema."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción inválida."
                    );
            }

        } while (opcion != 7);

        scanner.close();
    }
}