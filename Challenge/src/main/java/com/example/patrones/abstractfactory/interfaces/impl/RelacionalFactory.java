package com.example.patrones.abstractfactory.interfaces.impl;

import com.example.patrones.abstractfactory.interfaces.AbstractFactory;
import com.example.patrones.abstractfactory.interfaces.AlumnosRepository;
import com.example.patrones.abstractfactory.interfaces.CursosRepository;

public class RelacionalFactory implements AbstractFactory{

    @Override
    public AlumnosRepository createRepositoryAlumnos() {
        return new AlumnosRelacionalRepository();
    }

    @Override
    public CursosRepository createRepositoryCursos() {
        return new CursoRelacionalRepository();
    }
    
}
