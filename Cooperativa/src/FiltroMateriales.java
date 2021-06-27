
public class FiltroMateriales {
	
	private String material;
	
	public FiltroMateriales(String material) {
		this.material = material;
	}
	
	public boolean cumple(String material1) {
		return (material.equals(material1));
	}

}
