package com.example.patrones.state;

public class EstadoVerde implements IEstadoSemaforo{

    @Override
    public void mostrar() {
        System.out.println("Estado verde... siga conduciendo");
        
    }
    
}
