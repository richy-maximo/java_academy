package com.example.patrones;

public class RunPizzaBuilder {

    public static void main(String[] args) {
        Pizza pizza = 
            new Pizza.PizzaBuilder()
            .sauce("prego")
            .cheese("3 quesos")
            .base("integral")
            .build();

        System.out.println(pizza);
            
    }
    
}
