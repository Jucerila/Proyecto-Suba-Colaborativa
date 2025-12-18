public class Operarios {
     // Definición de atributos
    private int idTipoOperario;
    private long idLogin;
    private String nombreOperario;
    private String passwordOperario;
    private String confirmarPassword;

    // Constructor sin parámetros
    public Operarios() {

    }

    // Constructor con parámetros
    public Operarios(int idTipoOperario, long idLogin, String nombreOperario,
                     String passwordOperario, String confirmarPassword) {

        this.idTipoOperario = idTipoOperario;
        this.idLogin = idLogin;
        this.nombreOperario = nombreOperario;
        this.passwordOperario = passwordOperario;
        this.confirmarPassword = confirmarPassword;
    }

    // Métodos Set (Setters)
    public void setIdTipoOperario(int idTipoOperario) {
        this.idTipoOperario = idTipoOperario;
    }

    public void setIdLogin(long idLogin) {
        this.idLogin = idLogin;
    }

    public void setNombreOperario(String nombreOperario) {
        this.nombreOperario = nombreOperario;
    }

    public void setPasswordOperario(String passwordOperario) {
        this.passwordOperario = passwordOperario;
    }

    public void setConfirmarPassword(String confirmarPassword) {
        this.confirmarPassword = confirmarPassword;
    }

    // Métodos Get (Getters)
    public int getIdTipoOperario() {
        return idTipoOperario;
    }

    public long getIdLogin() {
        return idLogin;
    }

    public String getNombreOperario() {
        return nombreOperario;
    }

    public String getPasswordOperario() {
        return passwordOperario;
    }

    public String getConfirmarPassword() {
        return confirmarPassword;
    }
}