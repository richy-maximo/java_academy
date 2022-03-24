
package com.example.arrays;

import java.util.Arrays;


public class Actividad {
    public static void main(String[] args) {
        Item[] array2 = 
                   {new Item(1, "pizza", 10),
                    new Item(2, "pastel", 3),
                    new Item(3, "helado", 2),
                    new Item(4, "chocolate", 5),
                    new Item(5, "yogurt", 12),
                    new Item(6, "lasaga", 1)};
        
        Arrays.sort(array2, new Sorter());
        
        System.out.println(Arrays.toString(array2));
    }
}
