package com.example.patrones.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunCommand {
    
    public static void main(String[] args) {
        List<Pedido> pedidos =  new ArrayList<Pedido>(Arrays.asList(
                                        new Pedido(10, true),
                                        new Pedido(20, true),
                                        new Pedido(30, false),
                                        new Pedido(40, false),
                                        new Pedido(50, true),
                                        new Pedido(60, true)  
                                    ));
        PedidoPeligroso pedidoPeligroso = new PedidoPeligroso();

        Oficina invoker = new Oficina();
        System.out.println("-----------Pedido multiple--------------------------------");
        invoker.setCommand(new TratamientoPedidoMultiple(pedidos));
        invoker.run();
        System.out.println("-----------Pedido peligroso--------------------------------");
        invoker.setCommand(new TratamientoPedidoPeligroso(pedidoPeligroso));
        invoker.run();

        /*
        -----------Pedido multiple--------------------------------
        Pedido -> peso:10 urgente:true
        Pedido -> peso:20 urgente:true
        Pedido -> peso:30 urgente:false
        Pedido -> peso:40 urgente:false
        Pedido -> peso:50 urgente:true
        Pedido -> peso:60 urgente:true
        -----------Pedido peligroso--------------------------------
        Pedido Peligroso: Tenga cuidado no lo vaya a voltear peso:10000
        */
        
    }
}
