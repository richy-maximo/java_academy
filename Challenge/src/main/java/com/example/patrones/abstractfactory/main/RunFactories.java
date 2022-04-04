package com.example.patrones.abstractfactory.main;

import java.util.Arrays;

import com.example.patrones.abstractfactory.interfaces.AbstractFactory;
import com.example.patrones.abstractfactory.interfaces.AlumnosRepository;
import com.example.patrones.abstractfactory.interfaces.CursosRepository;
import com.example.patrones.abstractfactory.interfaces.impl.RelacionalFactory;
import com.example.patrones.abstractfactory.interfaces.provider.ProviderFactory;
import com.example.patrones.abstractfactory.interfaces.types.TypeSQL;

public class RunFactories {

    public static void main(String[] args) {
        AbstractFactory abRelacional = ProviderFactory.getFactory(TypeSQL.RELACIONAL);
        AbstractFactory abNoSQL      = ProviderFactory.getFactory(TypeSQL.NOSQL);

        //Relacional
        CursosRepository cursosRepository   = (CursosRepository) abRelacional.createRepositoryCursos();
        AlumnosRepository alumnosRepository = (AlumnosRepository) abRelacional.createRepositoryAlumnos();

        //NOSQL
        CursosRepository cursosRepository2   = (CursosRepository) abNoSQL.createRepositoryCursos();
        AlumnosRepository alumnosRepository2 = (AlumnosRepository) abNoSQL.createRepositoryAlumnos();

        System.out.println("Lista de alumnos para curso relacional: " + Arrays.toString(alumnosRepository.listaAlumnos()));
        System.out.println("Lista de cursos relacional: " + Arrays.toString(cursosRepository.listaCursos()));

        System.out.println("Lista de alumnos para curso NoSQL: " + Arrays.toString(alumnosRepository2.listaAlumnos()));
        System.out.println("Lista de cursos NoSQL: " + Arrays.toString(cursosRepository2.listaCursos()));
    }
    
}
