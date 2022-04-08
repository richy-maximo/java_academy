package com.example.patrones.decorator;

public class LecheDecorator extends AdicionalesDecorator{

    public LecheDecorator(ICafe decoratedAdicional) {
        super(decoratedAdicional);
    }
    
    @Override
    public void descripcion() {
        decoratedAdicional.descripcion();   
        configLeche();
    }

    @Override
    public float precio() {
        return decoratedAdicional.precio() + 10;
        
    }

    private void configLeche(){
        System.out.println("Se añade leche ");
    }

}
