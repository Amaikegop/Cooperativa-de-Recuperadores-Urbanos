package Cooperativa;

import java.util.ArrayList;

public class Usuarios {

    private ArrayList<Cartonero> usuarios;

    public boolean darAlta (String nombre,Long dni,String apellido,String direccion,Long telefono,String vehiculo,
            int horarioPreferencia,int capacidadVehiculo,char patente) {

        boolean salida = false;
        Cartonero cartonero = new Cartonero(nombre,dni,apellido,direccion,
                telefono,vehiculo,horarioPreferencia,capacidadVehiculo,patente);

        if (!usuarios.contains(cartonero)) {
            usuarios.add(cartonero);
            salida = true;
        }

        return salida;
    }

    public boolean darBaja (Cartonero cartonero) {
        boolean salida = false;
        if (usuarios.contains(cartonero)) {
            usuarios.remove(cartonero);
            salida = true;
        }

        return salida;
    }

    public Cartonero modificarDatos (Long dni) {
        Cartonero cartonero = null;

        for (Cartonero usuario : usuarios) {
            if (usuario.getDni().equals(dni))
                cartonero = usuario;
        }

        return cartonero;
    }
}
