public class Administrador {

    private String idAdmin;
    private String usuario;
    private String password;

    public Administrador(String idAdmin, String usuario, String password) {
        this.idAdmin = idAdmin;
        this.usuario = usuario;
        this.password = password;
    }

    public boolean iniciarSesion(String usuario, String password) {

        return this.usuario.equals(usuario)
                && this.password.equals(password);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public String getUsuario() {
        return usuario;
    }
}