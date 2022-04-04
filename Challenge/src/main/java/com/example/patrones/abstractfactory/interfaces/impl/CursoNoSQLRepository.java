package com.example.patrones.abstractfactory.interfaces.impl;


import com.example.patrones.abstractfactory.interfaces.CursosRepository;

public class CursoNoSQLRepository implements CursosRepository{

    @Override
    public String[] listaCursos() {
        String[] cursos = {"MongoDB", "Elasticsearch", "Radis"};
        return cursos;
    }
    
}
