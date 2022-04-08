package com.example.patrones.composite.leaf;

import com.example.patrones.composite.base.Grafico;

public class Circulo implements Grafico{

    private float radio;

    public Circulo(float radio){
        this.radio = radio;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando un circulo... area = "
         + (Math.pow(radio, 2) * Math.PI));
        
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

}
