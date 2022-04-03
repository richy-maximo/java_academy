package com.example.patrones.abstractfactory.interfaces.impl;

import com.example.patrones.abstractfactory.interfaces.AbstractFactory;
import com.example.patrones.abstractfactory.interfaces.AlumnosRepository;

public class RelacionalFactory implements AbstractFactory{

    @Override
    public AlumnosRepository createRepositoryAlumnos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AlumnosRepository createRepositoryCursos() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
