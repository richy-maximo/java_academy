package com.example.patrones.memento;

public class Originator {
    private String nombre;
    private String apellido;
    
    public Originator(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Memento createMemento(){
        return new Memento(nombre, apellido);
    }
    public void restoreMemento(Memento memento){
        this.nombre = memento.getNombre();
        this.apellido = memento.getApellido();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
