package com.example.patrones.mediator;

public class Lampara extends Aparato{
    
    public Lampara(Mediator mediator){
        super(mediator);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo lampara");       
    }

    @Override
    public void apagar() {
        System.out.println("Apagando lampara");             
    }
}
