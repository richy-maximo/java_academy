package com.example.patrones.abstractfactory.interfaces.impl;


import com.example.patrones.abstractfactory.interfaces.AlumnosRepository;

public class AlumnosNoSQLRepository implements AlumnosRepository {

    @Override
    public String[] listaAlumnos() {
        String[] alumn = {"Maria", "Josefina", "Lupita"};
        return alumn;
    }
    
}
