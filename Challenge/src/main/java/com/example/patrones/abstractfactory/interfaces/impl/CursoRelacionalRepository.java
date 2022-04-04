package com.example.patrones.abstractfactory.interfaces.impl;

import java.util.Arrays;
import java.util.List;

import com.example.patrones.abstractfactory.interfaces.CursosRepository;

public class CursoRelacionalRepository implements CursosRepository{

    @Override
    public String[] listaCursos() {
        String[] cursos = {"MariaDB", "DB2", "Orale"};
        return cursos;
    } 

    public String getCardNumber(){
        return "12345";
    }

    public String getCardType(){
        return "card tipo relacional";
    }
    
}
