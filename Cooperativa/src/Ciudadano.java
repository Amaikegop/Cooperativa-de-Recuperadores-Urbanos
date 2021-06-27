import java.util.*;

public class Ciudadano {
    private String nombre;
    private String apellido;
    private double telefono;
    private Domicilio domicilio;
	private Date franjaHoraria;
    private int capacidadVehiculo;
    private String dirEmail;
    private List<Email> casillaCorreo;
    private List<Material> materiales;

    public Ciudadano(String nombre, String apellido, double telefono, Domicilio domicilio, Date franjaHoraria, String dirEmail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.franjaHoraria = franjaHoraria;
        this.dirEmail = dirEmail;
        this.casillaCorreo = new ArrayList<Email>();
        this.materiales = new ArrayList<Material>();
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

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(Date franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }
    
	public int getCapacidadVehiculo() {
		return capacidadVehiculo;
	}
	
    public String getDirEmail() {
		return dirEmail;
	}


	public void setDirEmail(String dirEmail) {
		this.dirEmail = dirEmail;
	}


	public void setCapacidadVehiculo(int capacidadVehiculo) {
		this.capacidadVehiculo = capacidadVehiculo;
	}
	
	public List<Email> getCasillaCorreo() {
		List<Email> aux = new ArrayList<Email>(casillaCorreo);
		return aux;
	}

	public List<Material> getMateriales() {
		List<Material> aux = new ArrayList<Material>(materiales);
		return aux;
	}

	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}

	public void generarPost(CarteleraVirtual carteleraVirtual) {
		Formulario formulario = new Formulario(nombre, apellido, telefono, domicilio);
		Post nuevoPost = new Post(nombre, this);
		carteleraVirtual.addPost(nuevoPost);
	}
	
	public void aceptaPost(CarteleraVirtual carteleraVirtual, int volumen, Ciudadano ciudadano) {
		if(carteleraVirtual.getPost(ciudadano).getCapacidad() <= volumen) {
			Formulario formulario = new Formulario(nombre, apellido, telefono, domicilio);
			carteleraVirtual.getPost(ciudadano).setFormulario(formulario);
			carteleraVirtual.removerPost(carteleraVirtual.getPost(ciudadano));
			Email email = new Email(ciudadano.getDirEmail(), dirEmail, formulario.toString());
		}
	}
	
	public void rechazarPost(CarteleraVirtual carteleraVirtual, Ciudadano ciudadano) {
		Post post = carteleraVirtual.getPost(this);
		Email email = new Email(ciudadano.getDirEmail(), dirEmail, "Su pedido fue rechazado");
		carteleraVirtual.addPost(post);
	}
}
