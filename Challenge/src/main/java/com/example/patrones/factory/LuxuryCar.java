package com.example.patrones.factory;

public class LuxuryCar implements Payment{
    @Override
    public void construct() {
        System.out.println("Constructing a luxury car, so much payment");
        
    }
}
