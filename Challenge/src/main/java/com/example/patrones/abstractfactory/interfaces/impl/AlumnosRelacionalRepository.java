package com.example.patrones.abstractfactory.interfaces.impl;


import com.example.patrones.abstractfactory.interfaces.AlumnosRepository;

public class AlumnosRelacionalRepository implements AlumnosRepository{

    @Override
    public String[] listaAlumnos() {
        String[] alumn = {"Ricardo", "Roberto", "Rogelio"};
        return alumn;
    }
    
}
