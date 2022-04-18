package com.example.patrones.state;

public class EstadoRojo implements IEstadoSemaforo{

    @Override
    public void mostrar() {
        System.out.println("Estado rojo... detengase!!");
        
    }
    
}
