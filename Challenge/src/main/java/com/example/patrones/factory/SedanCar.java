package com.example.patrones.factory;

public class SedanCar implements Payment {
    @Override
    public void construct() {
        System.out.println("Constructing a sedan car, medium payment");
        
    }
}
