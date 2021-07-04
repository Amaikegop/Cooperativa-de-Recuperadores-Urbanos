
import java.sql.Time;
import java.util.*;

import javax.swing.ListModel;

public class Cartonero {

    private String nombre;
    private String apellido;
    private Domicilio direccion;
    private double dni;
    private double telefono;
    private String vehiculo;
    private Date horarioPreferencia;
    private char capacidadVehiculo;
    private String patente;
    private List<Domicilio> domiciliosVisitados;
    private List<Domicilio> domiciliosSinVisitar;
    private Recorrido recorrido;
    private List<Material> materiales;

    public Cartonero(String nombre, double dni, String apellido, Domicilio direccion, double telefono, String vehiculo, Date horarioPreferencia, char capacidadVehiculo, String patente,Recorrido recorrido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
        this.horarioPreferencia = horarioPreferencia;
        this.capacidadVehiculo = capacidadVehiculo;
        this.patente = patente;
        this.recorrido = recorrido;
        this.materiales = new ArrayList<Material>();
        this.domiciliosSinVisitar = new ArrayList<Domicilio>();
        this.domiciliosVisitados = new ArrayList<Domicilio>();
        this.recorrido = null;
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

    public Domicilio getDireccion() {
        return direccion;
    }

    public void setDireccion(Domicilio direccion) {
        this.direccion = direccion;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getHorarioPreferencia() {
        return horarioPreferencia;
    }

    public void setHorarioPreferencia(Date horarioPreferencia) {
        this.horarioPreferencia = horarioPreferencia;
    }

    public char getCapacidadVehiculo() {
        return capacidadVehiculo;
    }

    public void setCapacidadVehiculo(char capacidadVehiculo) {
        this.capacidadVehiculo = capacidadVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public void visitado(Domicilio domicilio) {
        recorrido.removeDomicilio(domicilio);
        domiciliosVisitados.add(domicilio);
    }

    public void sinVisitar(Domicilio domicilio, Server server) {
        recorrido.removeDomicilio(domicilio);
        domiciliosSinVisitar.add(domicilio);
        server.addDomicilio (domicilio);
    }
    
    public Material getMaterial(String material) {
    	for(Material materialAux : materiales) {
    		if(materialAux.getNombre().equals(material));
    			return materialAux;
    	}
    	return null;
    }
    
    public void addDomicilioRecorrido(Domicilio domicilio) {
        recorrido.addDomicilio(domicilio);
    }
    
    public List<Material> getMateriales(){
    	List<Material> aux = new ArrayList<Material>(materiales);
    	return aux;
    }
    
    public Recorrido getRecorrido() {
    	return recorrido;
    }
    
    public void setRecorrido(Recorrido recorrido) {
    	this.recorrido = recorrido;
    }
    
    public void agregarMaterial (String material, double peso, String condicion) {
        Material aux = new Material(material,peso, condicion);
        materiales.add(aux);
    }
    
    public void addPesoMaterial (String material, double peso, String condicion) {
        boolean encontro= false;
        int i=0;
        while ((!encontro)&&(i<materiales.size())) {
            if(materiales.get(i).getNombre().equals(material)) {
                encontro = true;
                materiales.get(i).addCantidad(peso);
            }
            else
                i++;
        }
        if(!encontro)
        	agregarMaterial(material,peso, condicion);
    }
}
