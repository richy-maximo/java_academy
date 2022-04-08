package com.example.patrones.bridge;

public class RunVehiculo {
    
    public static void main(String[] args) {
        Vehiculo fordGas = new Ford(new Gasolina());
        fordGas.mostrarCaracteristicas();

        Vehiculo fordDiesel = new Ford(new Diesel());
        fordDiesel.mostrarCaracteristicas();
    }
}
