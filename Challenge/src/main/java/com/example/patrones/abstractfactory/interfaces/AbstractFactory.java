package com.example.patrones.abstractfactory.interfaces;

public interface AbstractFactory<T> {
    T createRepositoryAlumnos();
    T createRepositoryCursos();
}
