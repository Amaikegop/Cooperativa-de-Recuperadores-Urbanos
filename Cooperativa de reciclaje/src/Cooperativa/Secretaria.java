package Cooperativa;

public class Secretaria {
    private String nombre;
    private String apellido;
    private Long cuil;
    private int dni;
    private String email;
    private String usuario;
    private String contrasenia;

    public Secretaria(String nombre, String apellido, Long cuil, int dni, String email, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.dni = dni;
        this.email = email;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public Long getCuil() { return cuil; }

    public void setCuil(Long cuil) { this.cuil = cuil; }

    public int getDni() { return dni; }

    public void setDni(int dni) { this.dni = dni;}

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContrasenia() { return contrasenia; }

    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public boolean verificarUsuario (String email,String contrasenia) {
        boolean salida = false;
        if (email.equals(this.email)) {
            if(contrasenia.equals(this.contrasenia))
                salida=true;
        }
        return salida;
    }
}
