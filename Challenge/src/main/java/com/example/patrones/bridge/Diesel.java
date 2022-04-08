package com.example.patrones.bridge;

public class Diesel implements IMotor{

    @Override
    public void inyectarCombustible(double litros) {
        System.out.println("inyecta " + litros + " litros ");
        
    }

    @Override
    public void consumirGasolina() {
        System.out.println("Consume diesel ");
        
    }
    
}
