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
