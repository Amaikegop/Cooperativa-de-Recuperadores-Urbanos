
public class CentroAcopio {

	private String nombre;
	private Domicilio direccion;
	private Balanza balanza;
	private Server servidor;
	private ListadoMaterialesEntregables listado;

	public CentroAcopio(Domicilio direccion) {
		this.direccion = direccion;
	}

	public Domicilio getDireccion() {
		return direccion;
	}
	
	public void registroPeso(Cartonero cartonero) {
		if(!servidor.getCartoneros().contains(cartonero))
			servidor.addCartonero(cartonero);
		for(Material material : cartonero.getMateriales())
			balanza.pesarMaterial(cartonero, material.getNombre(), material.getCantidad(), material.getCondicion(), servidor);	
	}
	
	public void registroPesoCiudadano(Ciudadano ciudadano) {
		Ciudadano vecinoBuenaOnda = new Ciudadano("Vecino bueno onda", null, 0, null, null, null);
		vecinoBuenaOnda.setMateriales(ciudadano.getMateriales());
		for(Material material : vecinoBuenaOnda.getMateriales())
			balanza.pesarMaterialCiudadano(material.getNombre(), material.getCantidad(), material.getCondicion(), servidor);
	}
	
}
