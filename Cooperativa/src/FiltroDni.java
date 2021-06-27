
public class FiltroDni extends Filtro{

    private double dni;

    public FiltroDni(double dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(Cartonero cartonero) {
        return (dni == cartonero.getDni());
    }
    
}
