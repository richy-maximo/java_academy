package com.example.patrones.bridge;

public abstract class Vehiculo {
    protected IMotor motor;

    public Vehiculo(IMotor motor){
        this.motor = motor;
    }

    abstract public void mostrarCaracteristicas();
}
