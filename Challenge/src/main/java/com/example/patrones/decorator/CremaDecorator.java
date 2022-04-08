package com.example.patrones.decorator;

public class CremaDecorator extends AdicionalesDecorator{

    public CremaDecorator(ICafe decoratedAdicional) {
        super(decoratedAdicional);
    }
    
    @Override
    public void descripcion() {
        decoratedAdicional.descripcion();   
        configCrema();
    }

    @Override
    public float precio() {
        return decoratedAdicional.precio() + 15;
        
    }

    private void configCrema(){
        System.out.println("Se añade crema ");
    }
}
