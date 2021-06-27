import java.util.*;

public class ListadoMaterialesEntregables {
	
	private List<Material> listadoMateriales;
	
	public ListadoMaterialesEntregables() {
		this.listadoMateriales = new ArrayList<Material>(); 
	}

	public List<Material> getListadoMateriales() {
		List<Material> aux = new ArrayList<Material>(listadoMateriales);
		return aux;
	}

	public void setListadoMateriales(List<Material> listadoMateriales) {
		this.listadoMateriales = listadoMateriales;
	}

	@Override
	public String toString() {
		return "Listado materiales entregables [listadoMateriales=" + listadoMateriales + "]";
	}
	
	public void addMaterial(Material material) {
		listadoMateriales.add(material);
	}

}
