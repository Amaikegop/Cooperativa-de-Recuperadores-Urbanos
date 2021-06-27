
import java.util.*;

public class Server {

        //Actua como bases de datos

        private List<Cartonero> cartonerosRegistrados;
        private List<Material> materialesRegistrados;
        private List<Material> materialesRegistradosVecinoBuenaOnda;
        private List<Secretaria> secretariasRegistradas;
        private List<Domicilio> listDomicilios;

        public Server() {
            this.cartonerosRegistrados = new ArrayList<Cartonero>();
            this.materialesRegistrados = new ArrayList<Material>();
            this.secretariasRegistradas = new ArrayList<Secretaria>();
            this.listDomicilios = new ArrayList<Domicilio>();
        }

        public boolean registrarCartonero(Cartonero cartonero) {
            if(!cartonerosRegistrados.contains(cartonero)) {
                cartonerosRegistrados.add(cartonero);
                return true;
            }
            else
                return false;
        }

        public void eliminarCartonero (Cartonero cartonero) {
            cartonerosRegistrados.remove(cartonero);
        }

        public void registarMateriales(Material material) {
            materialesRegistrados.add(material);
        }

        public void eliminarMaterial (Material material) {
            materialesRegistrados.remove(material);
        }

        public boolean registrarSecretaria(Secretaria secretaria) {
            if(!secretariasRegistradas.contains(secretaria)) {
                secretariasRegistradas.add(secretaria);
                return true;
            }
            else
                return false;
        }

        public List<Material> getMaterialesRegistradosVecinoBuenaOnda() {
        	List<Material> aux = new ArrayList<Material>(materialesRegistradosVecinoBuenaOnda);
			return aux;
		}

        public void addMaterialVecinoBuenaOnda(Material material) {
        	materialesRegistradosVecinoBuenaOnda.add(material);
        }

		public void eliminarSecretaria (Secretaria secretaria) {
            secretariasRegistradas.remove(secretaria);
        }

        public List<Cartonero> getCartoneros(){
            List<Cartonero> aux = new ArrayList<Cartonero>(this.cartonerosRegistrados);
            return aux;
        }

        public void addCartonero(Cartonero cartonero) {
            cartonerosRegistrados.add(cartonero);
        }

        public Cartonero buscarCartoneros (Filtro filtro) {
            for (Cartonero cartonerosRegistrado : cartonerosRegistrados) {
                if (filtro.cumple(cartonerosRegistrado))
                    return cartonerosRegistrado;
                else
                    return null;
            }
            return null;
        }

        public Cartonero modificarCartonero (Filtro filtro) {
            for (Cartonero cartonerosRegistrado : cartonerosRegistrados) {
                if (filtro.cumple(cartonerosRegistrado))
                    return cartonerosRegistrado;
            }
            return null;
        }

        public void addDomicilio(Domicilio domicilio) {
            listDomicilios.add(domicilio);
        }

        public List<Domicilio> getDomicilio(){
            List<Domicilio> aux = new ArrayList<Domicilio>(this.listDomicilios);
            return aux;
        }

		public List<Material> getMateriales() {
			List<Material> aux = new ArrayList<Material>(this.materialesRegistrados);
            return aux;
		}
        
        public void addMaterial(String material, double peso, String condicion) {
            Material aux = new Material(material,peso, condicion);
            materialesRegistrados.add(aux);
        }
        
        public void addPesoMaterial (String material, double peso, String condicion) {
                boolean encontro= false;
                int i=0;
                while ((!encontro)&&(i<materialesRegistrados.size())) {
                    if(materialesRegistrados.get(i).getNombre().equals(material)) {
                        encontro = true;
                        materialesRegistrados.get(i).addCantidad(peso);
                    }
                    else
                        i++;
                }
                if(!encontro)
                    addMaterial(material,peso, condicion);
            }
        
}

