import java.util.*;

public class Secretaria {
    private String nombre;
    private String apellido;
    private double cuil;
    private double dni;
    private String email;
    private String usuario;
    private String contrasenia;

    public Secretaria(String nombre, String apellido, double cuil, double dni, String email, String usuario, String contrasenia) {
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

    public double getCuil() { return cuil; }

    public void setCuil(double cuil) { this.cuil = cuil; }

    public double getDni() { return dni; }

    public void setDni(double dni) { this.dni = dni;}

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContrasenia() { return contrasenia; }

    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public boolean verificarUsuarioSecretaria(String email, String contrasenia) {
        boolean salida = false;
        if (email.equals(this.email)) {
            if(contrasenia.equals(this.contrasenia))
                salida=true;
        }
        return salida;
    }

    public boolean darAlta (String nombre, double dni, String apellido, Domicilio direccion, double telefono, String vehiculo, Date horarioPreferencia, char capacidadVehiculo, String patente, Server servidor, Recorrido recorrido) {

        boolean salida = false;
        Cartonero cartonero = new Cartonero(nombre,dni,apellido,direccion,telefono,vehiculo,horarioPreferencia,capacidadVehiculo,patente,recorrido);

            salida = servidor.registrarCartonero(cartonero);

        return salida;
    }

    public void darBaja (Cartonero cartonero,Server servidor) {
        servidor.eliminarCartonero(cartonero);
    }

    public Cartonero modificarDatos (Filtro filtro, Server servidor) {
        return servidor.modificarCartonero(filtro);
    }
}
