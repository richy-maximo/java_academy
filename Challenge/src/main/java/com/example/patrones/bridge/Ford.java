package com.example.patrones.bridge;

public class Ford extends Vehiculo{
    static double litros = 50;
public Ford(IMotor motor){
    super(motor);
}

    @Override
    public void mostrarCaracteristicas() {
        motor.consumirGasolina();
        motor.inyectarCombustible(litros);
        
    }
    
}
