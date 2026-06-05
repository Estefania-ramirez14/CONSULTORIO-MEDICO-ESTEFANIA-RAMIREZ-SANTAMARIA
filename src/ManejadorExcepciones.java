public class ManejadorExcepciones {

    private String ultimoError;

    public void mostrarError(String mensaje) {

        ultimoError = mensaje;

        System.out.println("ERROR: " + mensaje);
    }

    public void registrarError(Exception e) {

        ultimoError = e.getMessage();

        System.out.println(
                "Se produjo una excepción: " +
                        e.getMessage()
        );
    }

    public String getUltimoError() {
        return ultimoError;
    }
}