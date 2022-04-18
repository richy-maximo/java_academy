package com.example.patrones.command;

import java.util.List;

public class TratamientoPedidoMultiple implements ITratamientoPedido{

    private List<Pedido> pedidos; 

    public TratamientoPedidoMultiple(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public void tratar() {
        for(Pedido pedido : this.pedidos){
            System.out.println("Pedido -> peso:" + pedido.getPeso() + " urgente:" + pedido.isUrgente());
        }
        
    }
    
}
