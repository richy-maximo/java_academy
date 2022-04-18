package com.example.patrones.command;

public class TratamientoPedidoPeligroso implements ITratamientoPedido{

    private PedidoPeligroso pedido;
    
    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        this.pedido = pedido;
    }

    @Override
    public void tratar() {
        System.out.println("Pedido Peligroso: " + this.pedido.getInstrucciones() + " peso:" +this.pedido.getPeso());
    }
    
}
