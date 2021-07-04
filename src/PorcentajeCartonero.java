
public class PorcentajeCartonero {

    Cartonero cartonero;
    double porcentaje;

    public PorcentajeCartonero(Cartonero cartonero, double porcentaje) {
        this.cartonero = cartonero;
        this.porcentaje = porcentaje;
    }

    public Cartonero getCartonero() {
        return cartonero;
    }

    public void setCartonero(Cartonero cartonero) {
        this.cartonero = cartonero;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
