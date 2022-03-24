/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.collection.list;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author User
 */
public class TheatreIT {
    
    public TheatreIT() {
    }
    
    static com.example.collection.set.Theatre theatre;
    
    @BeforeAll
    static void initialize(){
        theatre = new com.example.collection.set.Theatre("RICHY", 8, 40.00f);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a3","A4","A7","D3","D4","D5","C7","B4","H7"} )
    void doReserve(String seat){
        assertTrue(theatre.doReserve(seat));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a0","A400","X7","","00","AA","D4"} )
    void doReserveFail(String seat){
        assertTrue(theatre.doReserve(seat));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a3","A4","A7","D3","D4","D5","C7","B4","H7"} )
    void cancelReserve(String seat){
        assertTrue(theatre.doReserve(seat));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a0","A400","X7","","00","AA","D4"} )
    void cancelReserveFail(String seat){
        assertTrue(theatre.doReserve(seat));
    }
}
