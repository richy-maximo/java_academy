package com.example.patrones.chain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestChain {

    static IChain chainCalc1 = new AddNumbers();
    static IChain chainCalc2 = new SubNumbers();
    static IChain chainCalc3 = new MultiplyNumbers();
    static IChain chainCalc4 = new DivNumbers();

    @BeforeAll
    public static void setup(){
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
    }

    @ParameterizedTest
    @MethodSource("provideNumbers")
    void chainNumbers(int number1, int number2, String cmd, int expected){
        Numbers request = new Numbers(number1, number2, cmd);
        assertTrue(chainCalc1.calculate(request) == expected);
    }

    private static Stream<Arguments> provideNumbers(){
        return Stream.of(
          Arguments.of(8, 2, "add", 10),  
          Arguments.of(8, 2, "sub", 6), 
          Arguments.of(8, 2, "mult", 16), 
          Arguments.of(8, 2, "div", 4)
        );
    }
}
