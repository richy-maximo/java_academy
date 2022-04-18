package com.example.patrones.memento;

public class RunMemento {
    public static void main(String[] args) {
        Carataker carataker = new Carataker();
        Originator originator = new Originator("Ricardo", "Alvarez");
        System.out.println(originator.getNombre() + " " + originator.getApellido());
        originator.setNombre("Hugo");
        originator.setApellido("Herrera");
        System.out.println(originator.getNombre() + " " + originator.getApellido());
        carataker.setMemento(originator.createMemento());
        System.out.println("Memento creado");
        Memento memento1 = carataker.getMemento();

        originator.setNombre("xxx");
        originator.setApellido("xxxx");
        System.out.println(originator.getNombre() + " " + originator.getApellido());
        
        //Memento memento2 = carataker.getMemento();

        originator.restoreMemento(memento1);
        System.out.println("restaurando memento");
        System.out.println(originator.getNombre() + " " + originator.getApellido());
        /*
        Ricardo Alvarez
        Hugo Herrera
        Memento creado
        xxx xxxx
        restaurando memento
        Hugo Herrera
        */
    }
    
}
