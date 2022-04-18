package com.example.patrones.command;

public class Oficina {
    ITratamientoPedido pedido;

    public void setCommand(ITratamientoPedido pedido){
        this.pedido = pedido;
    }

    public void run(){
        this.pedido.tratar();
    }
}
