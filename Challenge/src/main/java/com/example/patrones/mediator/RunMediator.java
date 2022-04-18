package com.example.patrones.mediator;

public class RunMediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Lampara lampara = new Lampara(mediator);
        Tele tele = new Tele(mediator);

        mediator.setLampara(lampara);
        mediator.setTele(tele);;

        lampara.encender();
        lampara.apagar();

        tele.encender();
        tele.apagar();

        /*
        Encendiendo lampara
        Apagando lampara
        Encendiendo tele
        Apagando tele   
        */
    }
}
