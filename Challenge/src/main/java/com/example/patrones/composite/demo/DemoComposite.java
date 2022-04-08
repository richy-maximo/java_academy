package com.example.patrones.composite.demo;

import com.example.patrones.composite.base.Grafico;
import com.example.patrones.composite.composite.GrupoDeImagenes;
import com.example.patrones.composite.leaf.Circulo;
import com.example.patrones.composite.leaf.Cuadrado;
import com.example.patrones.composite.leaf.Triangulo;

public class DemoComposite {
    
    public static void main(String[] args) {
        Grafico triangulo = new Triangulo(3, 6);
        Grafico circulo   = new Circulo(5);
        Grafico cuadrado  = new Cuadrado(4);

        GrupoDeImagenes grupo = new GrupoDeImagenes();
        System.out.println("Agregando graficos");
        grupo.addGrafico(triangulo);
        grupo.addGrafico(circulo);
        grupo.addGrafico(cuadrado);

        grupo.pintar();
        System.out.println("Removiendo...");
        grupo.removeGrafico(triangulo);
        grupo.pintar();
    }
}
