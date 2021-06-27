import java.util.Date;

public class Sistema {

	public static void main(String[] args) {
		//EL MAIN CORRESPONDE A UN CIUDADANO INTERACTUANDO CON LA CARTELERA VIRTUAL Y GENERANDO UN
		//POST EN LA MISMA
		
		// SECRETARIA // 
		
		Secretaria cecilia = new Secretaria("Cecilia", "Martinez", 242078943, 2078943, "cecilia@gmail.com", "secCecilia", "cma207System");
		
		// CIUDADANOS // 
		
		Date franjaHorariaRuud = new Date(2021, 6, 30, 12, 0);
		PuntoMapa ubicacionRuud = new PuntoMapa(2, 1);
		Domicilio domicilioRuud = new Domicilio(ubicacionRuud, "Chacabuco");
		Ciudadano ruudGullit = new Ciudadano("Ruud", "Gullit", 249456103, domicilioRuud, franjaHorariaRuud, "RuudGullit@gmail.com");
		
		// CARTELERAVIRTUAL //
		
		CarteleraVirtual carteleraVirtual = new CarteleraVirtual();
		
		// GENERAR POST  //
		ruudGullit.generarPost(carteleraVirtual);
	}

}
