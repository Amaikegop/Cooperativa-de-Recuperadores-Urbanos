
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class ListadoRecorridos {
	
    private LocalDate hora;


    public List<Recorrido> getListRecorridos(Server servidor) {
    	List<Recorrido> retorno = new ArrayList<Recorrido>();
        if(hora.atTime(8, 00) != null) {
            List<Domicilio> domicilios = servidor.getDomicilio();
            List<Cartonero> cartoneros = servidor.getCartoneros();


            double cantidad = Math.floor(domicilios.size()/cartoneros.size());
            int i = 0;
            for (Cartonero cartonero : cartoneros) {
                
            	while ((i < domicilios.size()) && (cantidad>0)) {
                    Domicilio aux = domicilios.get(i);
                    cartonero.addDomicilioRecorrido(aux);
                    cantidad--;
                }
                cantidad=Math.floor(domicilios.size()/cartoneros.size());
                retorno.add(cartonero.getRecorrido());
            }
            
        } //En este punto es una lista vacía pero debe llenarse con los domicilios no visitados
        return retorno;
    }
    
}
