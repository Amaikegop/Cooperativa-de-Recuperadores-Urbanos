import java.math.*;
import java.util.*;

public class SolicitarServicio {

	private int categoria;
	private Date franjaHoraria;
	private Imagen imagen;
	private Recorrido recorrido;
	private Server servidor;
	
	public SolicitarServicio(int volumen, Date franjaHoraria) {
		this.categoria = categoria;
		this.franjaHoraria = franjaHoraria;
	}

	public int getCategoria() {
		return categoria;
	}

	public Date getFranjaHoraria() {
		return franjaHoraria;
	}

	public boolean verificaRadio(Ciudadano ciudadano,CentroAcopio centroAcopio) {
		if(centroAcopio.getDireccion().getDistancia(ciudadano.getDomicilio().getUbicacion()) <= 6)
			return true;
		return false;
	}
	
	public void aceptaServicio(Ciudadano ciudadano, CentroAcopio centroAcopio) {
		if(this.verificaRadio(ciudadano, centroAcopio) == true) {
			servidor.addDomicilio(ciudadano.getDomicilio());
			System.out.println("El pedido fue registrado");
		}		
		System.out.println("Debe llevarlo usted mismo");
	}
	
}
