
package com.example.arrays;

import java.util.Arrays;

public class Arreglos {
    
    public static void main(String[] args) {
        int[] numbers = {6, 3, 1, 2, 7, 5, 4, 8, 9};
        
        sort2(numbers);
        
        System.out.println(Arrays.toString(numbers));
    }
    
    static void sort1(int[] numbers){
        Arrays.sort(numbers);
    }
    
    static void sort2(int[] numbers){
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if(numbers[j] >= numbers[j+1]){
                    int aux = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = aux;
                }
        }
    }
        
    }
}
