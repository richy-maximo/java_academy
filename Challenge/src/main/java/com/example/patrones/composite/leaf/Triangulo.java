package com.example.patrones.composite.leaf;

import com.example.patrones.composite.base.Grafico;

public class Triangulo implements Grafico{

    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando un triangulo... area = " 
            + (base * altura /2));
        
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
