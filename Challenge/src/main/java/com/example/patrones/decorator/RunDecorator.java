package com.example.patrones.decorator;

public class RunDecorator {

    public static void main(String[] args) {
        ICafe normal = new Normal();

        ICafe descafeinadoConAzucar = new  Descafeinado();
        descafeinadoConAzucar = new AzucarDecorator(descafeinadoConAzucar);

        ICafe normalConTodo = new Normal();
        normalConTodo = new AzucarDecorator(normalConTodo);
        normalConTodo = new LecheDecorator(normalConTodo);
        normalConTodo = new CremaDecorator(normalConTodo);

        System.out.println("****Cafe normal****");
        normal.descripcion();
        System.out.println("Precio: " + normal.precio());
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Cafe descafeinado con azucar***********");
        descafeinadoConAzucar.descripcion();
        System.out.println("Precio: " + descafeinadoConAzucar.precio());
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("****Cafe normal con todo para llevar****");
        normalConTodo.descripcion();
        System.out.println("Precio: " + normalConTodo.precio());

        System.out.println("Gracias por su compra :D");

    }
    
}
