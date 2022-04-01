package com.example.patrones.factory;

public class RunFactory {
    
    public static void main(String[] args){
        CarFactory carf = new CarFactory();

        carf.buildCar(CarType.SMALL).construct();
        carf.buildCar(CarType.SEDAN).construct();
        carf.buildCar(CarType.LUXURY).construct();
    }
}
