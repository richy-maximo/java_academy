package com.example.lambdas;

import java.math.BigInteger;

public class Calculator{

    public Calculator(){
        
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.getSum(1, 2));
        System.out.println(calculator.getSub(1, 2));
        System.out.println(calculator.isPrime(4));
        System.out.println(calculator.isOdd(11));
        System.out.println(calculator.getFactorial(7));
        /*
        Adding lambda_sum     = (num1, num2) -> num1 + num2;
        Adding lambda_sub     = (num1, num2) -> num1 - num2;
        PrimeOdd lambda_prime = (num) -> num%2 == 0;
        PrimeOdd lambda_odd   = (num) -> {
            for(int i=2; i < num; i++){
                if(num%i == 0)
                    return false;
            }
            return true;
        };
        Factorial lambda_factorial = (num) ->{
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= num; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
        };
        System.out.println(lambda_sum.add(1, 2));
        System.out.println(lambda_sub.add(1, 2));
        System.out.println(lambda_prime.primeOdd(4));
        System.out.println(lambda_odd.primeOdd(11));
        System.out.println(lambda_factorial.factorial(7));
        */
    }

    public int getSum(int num1, int num2){
        Adding lambda_sum = (n1, n2) -> n1 + n2;
        return lambda_sum.add(num1, num2);
    }
    public int getSub(int num1, int num2){
        Adding lambda_sub = (n1, n2) -> n1 - n2;
        return lambda_sub.add(num1, num2);
    }
    public boolean isPrime(int num ){
        PrimeOdd lambda_prime = (n) -> n%2 == 0;
        return lambda_prime.primeOdd(num);
    }
    public boolean isOdd(int num ){
        PrimeOdd lambda_odd = (n) -> {
            for(int i=2; i < n; i++){
                if(n%i == 0)
                    return false;
            }
            return true;
        };
        return lambda_odd.primeOdd(num);
    }
    public BigInteger getFactorial(int num){
        Factorial lambda_factorial = (n) ->{
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
        };
        return lambda_factorial.factorial(num);
    }
}

@FunctionalInterface
interface Adding{
    int add(int num1, int num2);
}

@FunctionalInterface
interface PrimeOdd{
    boolean primeOdd(int num);
}

@FunctionalInterface
interface Factorial{
    BigInteger factorial(int num);
}

