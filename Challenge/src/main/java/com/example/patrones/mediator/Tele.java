package com.example.patrones.mediator;

public class Tele extends Aparato{
    
    public Tele(Mediator mediator){
        super(mediator);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo tele");            
    }

    @Override
    public void apagar() {
        System.out.println("Apagando tele");         
    }

    
}
