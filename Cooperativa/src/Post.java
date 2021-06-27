
public class Post {
	
	private String titulo;
	private Formulario formulario;
	private Ciudadano postulante;
	private Ciudadano usuario;
	private String cartel;

	public Post(String titulo, Ciudadano postulante) {
		this.postulante = postulante;
		this.titulo = titulo;
	}
	
	public Post(Ciudadano postulante, String cartel) {
		this.postulante = postulante;
		this.cartel = cartel;
	}
	
	public Domicilio getDomicilio() {
		return postulante.getDomicilio();
	}
	
	public String getCartel() {
		return cartel;
	}
	
	public Formulario getFormulario() {
		return formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}

	public int getCapacidad() {
		return postulante.getCapacidadVehiculo();
	}
	
	public void setUsuario(Ciudadano usuario) {
		this.usuario = usuario;
	}
	
	public Ciudadano getFormularioPostulado() {
		return usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Ciudadano getPostulante() {
		return postulante;
	}

	public void setPostulante(Ciudadano postulante) {
		this.postulante = postulante;
	}

	public Ciudadano getUsuario() {
		return usuario;
	}

	public void setCartel(String cartel) {
		this.cartel = cartel;
	}
	
	
	
}
