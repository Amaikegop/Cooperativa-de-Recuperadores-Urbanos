
import java.util.ArrayList;

public class Recorrido {

    private ArrayList<Domicilio> domicilios;
    private final int maxRadio = 6;

    public Recorrido () {
        domicilios = new ArrayList<Domicilio>();
    }

    public void addDomicilio (Domicilio domicilio) {
        domicilios.add(domicilio);
    }

    public void removeDomicilio (Domicilio domicilio) {
        domicilios.remove(domicilio);
    }

    public boolean verificarRango (Domicilio domicilio1, Domicilio domicilio2) {
        if(domicilio1.getDistancia(domicilio2.getUbicacion()) < 6)
            return true;
        else
            return false;
    }

    public ArrayList<Domicilio> getDomicilios (){
        ArrayList<Domicilio> retorno = new ArrayList<Domicilio>();
        for (int i=0; i <domicilios.size();i++) {
            Domicilio aux = domicilios.get(i);
            retorno.add(aux);
        }
        return retorno;
    }

    public boolean verificarCarga (Cartonero cartonero, int carga) {
        return carga <= cartonero.getCapacidadVehiculo();
    }
    
}
