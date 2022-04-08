package com.example.patrones.decorator;

public class Descafeinado implements ICafe{

    @Override
    public void descripcion() {
        System.out.println("Cafe descafeinado ");

    }

    @Override
    public float precio() {
        return 35;
        
    }
    
}
