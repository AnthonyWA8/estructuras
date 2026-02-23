Repositorio Entrada y Salida 


package parqueadero.datos;

import java.util.*;
import parqueadero.modelo.RegistroVehiculo;

public class RepositorioVehiculos {

    private Map<String, RegistroVehiculo> registros = new HashMap<>();

    public void entrada(String placa){
        registros.put(placa, new RegistroVehiculo(placa));
    }

    public void salida(String placa){
        RegistroVehiculo r = registros.get(placa);
        if(r != null){
            r.registrarSalida();
        }
    }

    public RegistroVehiculo buscar(String placa){
        return registros.get(placa);
    }
}

