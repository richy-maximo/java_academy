package com.example.patrones.state;

public class EstadoNaranja implements IEstadoSemaforo{

    @Override
    public void mostrar() {
        System.out.println("Estado naranja... reduzca velocidad y detengase");
        
    }
    
}
