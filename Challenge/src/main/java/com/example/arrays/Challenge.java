/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.arrays;


/**
 *
 * @author User
 */
public class Challenge {
    static int size = 4;
    static int num = 1;
    public static void main(String[] args) {       
        //int size = 6;
        
        
        int[][] matrix = new int[size][size];
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0 || i == size-1){
                    matrix[i][j] = 1;
                    
                }
                else if(i == j ){
                    matrix[i][j] = 1;
                }
                else if(j == size-1-i){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz con 1");
        print(matrix);
               
        
 ////////////AQUI EMPIEZA LA ESPIRAL/////////////////////////////       
        
        int[][] matrix2 = new int[size][size];
        int piv = 0;
        for(int i = size; i >= 0; ){
            fillRigth(matrix2, piv);
            i--;
            fillDown(matrix2, piv);           
            fillLeft(matrix2, piv);
            i--;
            fillUp(matrix2, piv);
            piv++;
        } 
        
        System.out.println("Matriz ESPIRAL");
        print(matrix2);
        
        
    }///////////////end main
    
    
    ////////////////////custom methods
    static void print(int[][] matrix){
        for(int i = 0; i < size; i++){
            System.out.println("");
            for(int j = 0; j < size; j++){
                System.out.print(" "+matrix[i][j]+" ");
            }
        } 
        System.out.println("");
    }
    
    static void fillRigth(int[][] matrix, int piv){
        for(int i = 0; i < size; i++){
            if(matrix[piv][i] == 0){
                matrix[piv][i] = num++;
            }
            
        }  
    }
    
    static void fillLeft(int[][] matrix, int piv){
        for(int i = size-1; i >= 0; i--){
            if(matrix[size-1-piv][i] == 0){           
                matrix[size-1-piv][i] = num++;
            }
            
        }
    }
    
    static void fillUp(int[][] matrix, int piv){
        for(int i = size-1; i >=0; i--){
            if(matrix[i][piv] == 0){ 
                matrix[i][piv] = num++;
            }
            
        }
    }
    
    static void fillDown(int[][] matrix, int piv){
        for(int i = 0; i < size; i++){
            if(matrix[i][size-1-piv] == 0){
                matrix[i][size-1-piv] = num++;
            }
            
        }
    }
    
}
