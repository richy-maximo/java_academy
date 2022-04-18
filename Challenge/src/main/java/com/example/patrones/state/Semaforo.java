package com.example.patrones.state;

public class Semaforo {
    private IEstadoSemaforo actualEstado;

    public Semaforo() {
        this.actualEstado = new EstadoVerde();
    }

    public void setState(IEstadoSemaforo state){
        this.actualEstado = state;
    }

    public void mostrar(){
        this.actualEstado.mostrar();
    }
}
