
public class Material {

    private String nombre;
    private double cantidad;
    private String condicion;

    public Material(String nombre, double cantidad, String condicion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.condicion = condicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }
  
    public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicionEntrega) {
		this.condicion = condicionEntrega;
	}

	public void addCantidad (double cantidad) {this.cantidad += cantidad;}

	@Override
	public String toString() {
		return "Material [nombre=" + nombre + ", cantidad=" + cantidad + ", condicion=" + condicion + "]";
	}
	
	
}
