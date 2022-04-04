package com.example.patrones.abstractfactory.interfaces.provider;

import com.example.patrones.abstractfactory.interfaces.AbstractFactory;
import com.example.patrones.abstractfactory.interfaces.impl.NoSQLFactory;
import com.example.patrones.abstractfactory.interfaces.impl.RelacionalFactory;
import com.example.patrones.abstractfactory.interfaces.types.TypeSQL;

public class ProviderFactory {
    public static AbstractFactory getFactory(TypeSQL type){
        switch(type){
            case RELACIONAL:
                return new RelacionalFactory();
                
            case NOSQL:
                return new NoSQLFactory();

        }
        return null;
    }
}
