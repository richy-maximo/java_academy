package com.example.patrones.factory;

public class SmallCar implements Payment{

    @Override
    public void construct() {
        System.out.println("Constructing a small car, small payment");
        
    }
}
