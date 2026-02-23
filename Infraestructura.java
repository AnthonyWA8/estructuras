Infraestructura
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


Repositorio Pagos

package parqueadero.modelo;

import java.time.LocalDateTime;

public class Pago {

    private String placa;
    private double valor;
    private LocalDateTime fecha;

    public Pago(String placa, double valor){
        this.placa = placa;
        this.valor = valor;
        this.fecha = LocalDateTime.now();
    }

    public String getPlaca(){
        return placa;
    }

    public double getValor(){
        return valor;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }
}