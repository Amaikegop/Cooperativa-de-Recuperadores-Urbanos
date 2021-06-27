
import java.util.*;

public class ListadoPorcentajes {

    public ListadoPorcentajes() {
    }

    public List<PorcentajeCartonero> listadoPorMaterial (Server server,String material) {
    	List<PorcentajeCartonero> retorno = new ArrayList<PorcentajeCartonero>();
        ArrayList<Cartonero> cartoneros = (ArrayList<Cartonero>) server.getCartoneros();
        ArrayList<Material> materiales = (ArrayList<Material>) server.getMateriales();
        double cantidadAcopio = 0;
        int i=0;
        boolean encontro= false;

        //Encuentra la cantidad total que hay de ese material en el centro de acopio
        while ((i < materiales.size())&&(!encontro)) {
            if (material.equals(materiales.get(i).getNombre())) {
                encontro = true;
                cantidadAcopio = materiales.get(i).getCantidad();
            }
            i++;
        }

        //Va encontrando las cantidades juntadas por los cartoneros y
        // calculando segun el total en el centro de acopio que porcentaje les corresponde
        for (Cartonero cartonero : cartoneros) {
            double cantidad = cartonero.getMaterial(material).getCantidad();
            PorcentajeCartonero push = new PorcentajeCartonero(cartonero, (cantidad * 100 / cantidadAcopio));
            retorno.add(push);
        }
        return retorno;
    }
    

}
