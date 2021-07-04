import java.util.Date;

public class Sistema {

	public static void main(String[] args) {
		
		// SERVIDOR //
		
		Server servidor = new Server();
		
		// SECRETARIA // 
		
		Secretaria cecilia = new Secretaria("Cecilia", "Martinez", 242078943, 2078943, "cecilia@gmail.com", "secCecilia", "cma207System");
		
		// CIUDADANOS // 
		
		Date franjaHorariaRuud = new Date(2021, 6, 30, 12, 0);
		PuntoMapa ubicacionRuud = new PuntoMapa(2, 1);
		Domicilio domicilioRuud = new Domicilio(ubicacionRuud, "Chacabuco");
		Ciudadano ruudGullit = new Ciudadano("Ruud", "Gullit", 249456103, domicilioRuud, franjaHorariaRuud, "RuudGullit@gmail.com");
		
		Date franjaHorariaAndriy = new Date(2021, 7, 2, 9, 0);
		PuntoMapa ubicacionAndriy = new PuntoMapa(5, 7);
		Domicilio domicilioAndriy = new Domicilio(ubicacionAndriy, "Las Heras");
		Ciudadano andriyShevchenko = new Ciudadano("Andriy", "Shevchenko", 249452103, domicilioAndriy, franjaHorariaAndriy, "AndriyShevchenko@gmail.com");
		
		Date franjaHorariaFernando = new Date(2021, 7, 20, 9, 0);
		PuntoMapa ubicacionFernando = new PuntoMapa(1, 1);
		Domicilio domicilioFernando = new Domicilio(ubicacionFernando, "Saavedra");
		Ciudadano fernandoTorres = new Ciudadano("Fernando", "Torres", 249746103, domicilioFernando, franjaHorariaFernando, "FernandoTorres@gmail.com");
		
		// CARTONEROS //
		
		Recorrido recorridoLampard = new Recorrido();
		Date franjaHorariaLampard = new Date(2021, 7, 3, 12, 0);
		PuntoMapa ubicacionLampard = new PuntoMapa(0, 6);
		Domicilio domicilioLampard = new Domicilio(ubicacionLampard, "9 de julio");
		Cartonero frankLampard = new Cartonero("Frank", 38520145, "Lampard", domicilioLampard, 226654963, "Ford F-150", franjaHorariaLampard, 'C', "AE265MM", recorridoLampard);
		servidor.addCartonero(frankLampard);
		
		Recorrido recorridoKante = new Recorrido();
		Date franjaHorariaKante = new Date(2021, 8, 21, 9, 0);
		PuntoMapa ubicacionKante = new PuntoMapa(0, 6);
		Domicilio domiciliokante = new Domicilio(ubicacionKante, "Alem");
		Cartonero ngoloKante = new Cartonero("N'golo", 41520145, "Kante", domiciliokante, 226654143, "Mercedes 11-14", franjaHorariaKante, 'D', "STB002", recorridoKante);
		servidor.addCartonero(ngoloKante);

		// MATERIALES //
		
		Material carton = new Material("Carton", 15, "Seco y limpio");
		Material latas = new Material("Latas", 10, "Secas y aplastadas");
		Material vidrio = new Material("Vidrio", 20, "Limpio");
		Material plastico = new Material("Plastico", 40, "Limpio y seco");
		
		// CENTRO ACOPIO //
		
		PuntoMapa direccionCA = new PuntoMapa(2, 1);
		Domicilio domicilioCA = new Domicilio(direccionCA, "Santamarina");
		CentroAcopio cooperativaRecicladoresTandil = new CentroAcopio(domicilioCA);
		
		// LISTADO MATERIALES ENTREGABLES //
		
		ListadoMaterialesEntregables listadoMateriales = new ListadoMaterialesEntregables();
		listadoMateriales.addMaterial(carton);
		listadoMateriales.addMaterial(latas);
		listadoMateriales.addMaterial(vidrio);
		listadoMateriales.addMaterial(plastico);
		
		// SOLICITAR SERVICIO //
		
		SolicitarServicio servicio = new SolicitarServicio(4, franjaHorariaFernando);
		
		// CARTELERAVIRTUAL //
		
		CarteleraVirtual carteleraVirtual = new CarteleraVirtual();
		
		// GENERAR Y ACEPTAR POST//
		
		ruudGullit.generarPost(carteleraVirtual);
		andriyShevchenko.aceptaPost(carteleraVirtual, 15, ruudGullit);
		System.out.println(carteleraVirtual.toString());
		
		// SOLICITAR SERVICIO //
		
		servicio.aceptaServicio(fernandoTorres, cooperativaRecicladoresTandil, servidor);
		recorridoKante.addDomicilio(fernandoTorres.getDomicilio());
		
		// LISTADO MATERIALES ENTREGABLES //
		
		System.out.println(listadoMateriales.toString());
		
		// IMPRIMIR RECORRIDO // 
		
		ngoloKante.setRecorrido(recorridoKante);
		System.out.println(ngoloKante.getRecorrido());
	}

}
