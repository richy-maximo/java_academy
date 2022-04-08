package com.example.patrones.decorator;

public class AdicionalesDecorator implements ICafe{

    protected ICafe decoratedAdicional;

    public AdicionalesDecorator(ICafe decoratedAdicional) {
        this.decoratedAdicional = decoratedAdicional;
    }

    @Override
    public void descripcion() {
        this.decoratedAdicional.descripcion();
        
    }

    @Override
    public float precio() {
        return this.decoratedAdicional.precio();
        
    }
    
}
