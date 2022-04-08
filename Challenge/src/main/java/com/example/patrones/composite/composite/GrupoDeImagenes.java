package com.example.patrones.composite.composite;

import java.util.ArrayList;
import java.util.List;

import com.example.patrones.composite.base.Grafico;

public class GrupoDeImagenes implements Grafico{

    private List<Grafico> childGrafico;

    public GrupoDeImagenes() {
        this.childGrafico = new ArrayList<>();
    }

    @Override
    public void pintar() {
        for(Grafico grafico : this.childGrafico){
            grafico.pintar();
        }
        
    }

    public void addGrafico(Grafico grupo){
        this.childGrafico.add(grupo);
    }

    public void removeGrafico(Grafico grupo){
        this.childGrafico.remove(grupo);
    }
    
}
