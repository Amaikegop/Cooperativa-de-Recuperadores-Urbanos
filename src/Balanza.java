
public class Balanza {

    public Balanza () {
    	
    }

    public void pesarMaterial(Cartonero cartonero, String material, double peso, String condicion, Server server) {
        cartonero.addPesoMaterial(material,peso,condicion);
        server.addPesoMaterial(material,peso,condicion);
    }
    
    public void pesarMaterialCiudadano (String material, double peso, String condicion, Server server) {
        server.addPesoMaterial(material,peso,condicion);
    }
}