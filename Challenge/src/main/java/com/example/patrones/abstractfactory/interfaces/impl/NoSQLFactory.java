package com.example.patrones.abstractfactory.interfaces.impl;

import java.util.List;

import com.example.patrones.abstractfactory.interfaces.AbstractFactory;
import com.example.patrones.abstractfactory.interfaces.CursosRepository;

public class NoSQLFactory implements AbstractFactory{

    @Override
    public CursosRepository createRepositoryAlumnos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CursosRepository createRepositoryCursos() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
