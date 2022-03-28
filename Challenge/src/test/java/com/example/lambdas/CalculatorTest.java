package com.example.lambdas;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    static void initialize(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test add method")
    void testSuma(){
        int num1 = 1;
        int num2 = 2;        
        assertTrue(num1 + num2  ==  calculator.getSum(num1, num2));
    }

    @Test
    @DisplayName("Test substraction method")
    void testSub(){
        int num1 = 1;
        int num2 = 2;       
        assertTrue(num1 - num2  ==  calculator.getSub(num1, num2));
    }

    @ParameterizedTest
    @DisplayName("Test prime number method")
    @ValueSource(ints = {2, 4, 6, 8})
    void testPrime(int num){        
        assertTrue(calculator.isPrime(num));
    }

    @ParameterizedTest
    @DisplayName("Fail Test prime number method")
    @ValueSource(ints = {3, 5, 7, 9})
    void failTestPrime(int num){        
        assertEquals(false, calculator.isPrime(num));
    }

    @ParameterizedTest
    @DisplayName("Test odd number method")
    @ValueSource(ints = {3, 5, 7, 11})
    void testOdd(int num){       
        assertTrue(calculator.isOdd(num));
    }

    @ParameterizedTest
    @DisplayName("Fail Test odd number method")
    @ValueSource(ints = {4, 6, 8, 10})
    void failTestOdd(int num){       
        assertEquals(false, calculator.isOdd(num));
    }

    @Test
    @DisplayName("Test factorial method")
    void testFactorial(){       
        assertTrue(BigInteger.valueOf(5040).equals(calculator.getFactorial(7) ));
        assertTrue(BigInteger.valueOf(720).equals( calculator.getFactorial(6) ));
        assertTrue(BigInteger.valueOf(120).equals( calculator.getFactorial(5)));
    }
}
