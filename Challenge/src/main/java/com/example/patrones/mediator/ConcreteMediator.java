package com.example.patrones.mediator;

public class ConcreteMediator implements Mediator{

    private Tele tele;
    private Lampara lampara;

    public void setTele(Tele tele) {
        this.tele = tele;
    }

    public void setLampara(Lampara lampara) {
        this.lampara = lampara;
    }

    @Override
    public void encender() {
        this.lampara.encender();
        this.tele.encender();
    }

    @Override
    public void apagar() {
        this.lampara.apagar();
        this.tele.apagar();
    }
    
}
