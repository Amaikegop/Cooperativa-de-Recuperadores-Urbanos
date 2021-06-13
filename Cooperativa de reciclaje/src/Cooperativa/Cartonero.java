package Cooperativa;

import java.sql.Time;
import java.util.ArrayList;

public class Cartonero {

    private String nombre;
    private String apellido;
    private String direccion;
    private Long dni;
    private Long telefono;
    private String vehiculo;
    private int horarioPreferencia;
    private int capacidadVehiculo;
    private char patente;
    private ArrayList<Material> materiales;

    public Cartonero(String nombre, Long dni,String apellido, String direccion, Long telefono, String vehiculo, int horarioPreferencia, int capacidadVehiculo, char patente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
        this.horarioPreferencia = horarioPreferencia;
        this.capacidadVehiculo = capacidadVehiculo;
        this.patente = patente;
        materiales = new ArrayList<Material>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getHorarioPreferencia() {
        return horarioPreferencia;
    }

    public void setHorarioPreferencia(int horarioPreferencia) {
        this.horarioPreferencia = horarioPreferencia;
    }

    public int getCapacidadVehiculo() {
        return capacidadVehiculo;
    }

    public void setCapacidadVehiculo(int capacidadVehiculo) {
        this.capacidadVehiculo = capacidadVehiculo;
    }

    public char getPatente() {
        return patente;
    }

    public void setPatente(char patente) {
        this.patente = patente;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }
}
