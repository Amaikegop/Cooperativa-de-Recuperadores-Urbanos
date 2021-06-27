
public class Formulario {
	
	private String nombre;
	private String apellido;
	private double telefono;
	private Domicilio domicilio;
	
	public Formulario(String nombre, String apellido, double telefono, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public double getTelefono() {
		return telefono;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

}
