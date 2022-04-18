package com.example.patrones.state;

public class RunState {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.mostrar();
        semaforo.mostrar();

        semaforo.setState(new EstadoNaranja());

        semaforo.mostrar();
        semaforo.mostrar();

        semaforo.setState(new EstadoRojo());

        semaforo.mostrar();
        semaforo.mostrar();

        /*
        Estado verde... siga conduciendo
        Estado verde... siga conduciendo
        Estado naranja... reduzca velocidad y detengase
        Estado naranja... reduzca velocidad y detengase
        Estado rojo... detengase!!
        Estado rojo... detengase!!
        */
    }
    
}
