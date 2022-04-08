package com.example.patrones.composite.leaf;

import com.example.patrones.composite.base.Grafico;

public class Cuadrado implements Grafico{

    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando un cuadrado... area = " 
            + Math.pow(lado, 2));
        
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
