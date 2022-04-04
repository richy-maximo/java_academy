package com.example.patrones.abstractfactory.interfaces.impl;

import java.util.List;

import com.example.patrones.abstractfactory.interfaces.AbstractFactory;
import com.example.patrones.abstractfactory.interfaces.AlumnosRepository;
import com.example.patrones.abstractfactory.interfaces.CursosRepository;

public class NoSQLFactory implements AbstractFactory{

    @Override
    public AlumnosRepository createRepositoryAlumnos() {
        return new AlumnosNoSQLRepository();
    }

    @Override
    public CursosRepository createRepositoryCursos() {
        return new CursoNoSQLRepository();
    }

    
}
