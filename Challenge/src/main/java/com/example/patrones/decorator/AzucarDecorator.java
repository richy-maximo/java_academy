package com.example.patrones.decorator;

public class AzucarDecorator extends AdicionalesDecorator{

    public AzucarDecorator(ICafe decoratedAdicional) {
        super(decoratedAdicional);
    }
    
    @Override
    public void descripcion() {
        decoratedAdicional.descripcion();   
        configAzucar();
    }

    @Override
    public float precio() {
        return decoratedAdicional.precio() + 5;
        
    }

    private void configAzucar(){
        System.out.println("Se añade azucar ");
    }
}
