microdominios

Registró vehículo 



package parqueadero.modelo;

import java.time.LocalDateTime;

public class RegistroVehiculo {

    private String placa;
    private LocalDateTime entrada;
    private LocalDateTime salida;
    private boolean activo;

    public RegistroVehiculo(String placa){
        this.placa = placa;
        this.entrada = LocalDateTime.now();
        this.activo = true;
    }

    public String getPlaca(){ return placa; }

    public boolean isActivo(){ return activo; }

    public void registrarSalida(){
        this.salida = LocalDateTime.now();
        this.activo = false;
    }
}