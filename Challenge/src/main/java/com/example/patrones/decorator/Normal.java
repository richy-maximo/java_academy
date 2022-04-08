package com.example.patrones.decorator;

public class Normal implements ICafe{

    @Override
    public void descripcion() {
        System.out.println("Cafe normal ");
        
    }

    @Override
    public float precio() {
        return 30;
        
    }
    
}
