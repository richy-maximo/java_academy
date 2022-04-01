package com.example.patrones.factory;

public class CarFactory {
    
    public Payment buildCar(CarType type){
        switch (type){
            case SMALL:
                return new SmallCar();
                
            case SEDAN:
                return new SedanCar();
                
            case LUXURY:
                return new LuxuryCar();
                
            default:
                System.out.println("Error, tipo de carro no reconocido");
                return null;
                
        }
    }
}
