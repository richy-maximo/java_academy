package com.example.patrones.mediator;

public abstract class Aparato {
    protected Mediator mediator;

    public Aparato(Mediator mediator){
        this.mediator = mediator;
    }

    protected abstract void encender();

    protected abstract void apagar();
}
