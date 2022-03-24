
package com.example.collection.list;

public class Challenge {
    
    public static void main(String[] args) {
        Theatre theatre = new Theatre("RICHY", 8, 40.00f);

        theatre.initialize();
        
        theatre.doReserve("A400");
        theatre.doReserve("X7");
        theatre.doReserve("AA");
        
        
        theatre.doReserve("a3");
        theatre.doReserve("A4");
        theatre.doReserve("A7");
        theatre.doReserve("D3");
        theatre.doReserve("D4");
        theatre.doReserve("D5");
        theatre.doReserve("C7");
        theatre.doReserve("B4");
        theatre.doReserve("H7");
        
        theatre.cancelReservation("A4");
        
        theatre.printSeatingChart();
    }
}
