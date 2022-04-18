package com.example.patrones.command;

public class Pedido {
    private int peso;
    private boolean isUrgente;

    public Pedido(int peso, boolean isUrgente){
        this.peso = peso;
        this.isUrgente = isUrgente;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public int getPeso(){
        return peso;
    }

    public boolean isUrgente(){
        return isUrgente;
    }
}
