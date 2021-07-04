
public class Domicilio {

    private PuntoMapa ubicacion;
    private String calle;

    public Domicilio(PuntoMapa ubicacion, String calle) {
        this.ubicacion = ubicacion;
        this.calle = calle;
    }

    public PuntoMapa getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(PuntoMapa ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getDistancia (PuntoMapa punto) {
        double distance = Math.hypot(this.ubicacion.getX()- punto.getX(), this.ubicacion.getY()- punto.getY());
        return distance;
    }

	@Override
	public String toString() {
		return "Domicilio [Calle: " + calle + " Entre =" + ubicacion + "";
	}
    
    
}
