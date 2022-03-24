
package com.example.arrays;

import java.util.Comparator;


public class Sorter implements Comparator<Item>{

    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getPrecio() > o2.getPrecio()){
            return -1;
        }
        if(o1.getPrecio() < o2.getPrecio()){
            return 1;
        }
        return 0;
    }
    
}
