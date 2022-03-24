
package com.example.collection.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;


public class Theatre {
    //atributes
    private String name;
    private Set<Seat> seatsList;
    private float price;
    private final List<String> row = 
            Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H");
    private int numberRowSeat;
    private int seats;
    private Set<Seat> reserveList;
    
    public Theatre(String name, int numberRowSeat, float price){
        this.name = name;
        this.numberRowSeat = numberRowSeat;
        this.price = price;
    }
    

    public void initialize(){
        seatsList = new LinkedHashSet<>();
        initSeats();
        seats = numberRowSeat * row.size();
        reserveList = new LinkedHashSet<>();
    }

    
    private void initSeats(){
        row.forEach((r) -> {
            for(int i = 1; i <= numberRowSeat; i++)
                seatsList.add(new Seat(r, i));
        });
    }
    
    private Seat createSeat(String seat){
        if(!validateReserve(seat))
            return null;
                    
        char r = seat.charAt(0);
        int num = Integer.valueOf(seat.substring(1));
        
        return new Seat(String.valueOf(r), num);
    }
    
    //validation methods
    public boolean validateReserve(String reserve){
        
        if(Pattern.matches("^[A-H][1-"+numberRowSeat+"]$", reserve))
            return true;

        return false;
    }
    
    //bussiness methods
    public boolean doReserve(String reserve){
        reserve = reserve.toUpperCase();
        Seat seat = createSeat(reserve);      
        
        if(seat == null || reserveList.contains(seat)){
            return false;
        }
        
        return reserveList.add(seat);
    }
    
    public void cancelReservation(String seat){
        
        reserveList.remove(createSeat(seat));
    }
    
    public void printSeatingChart(){
        System.out.println("Theatre: " + name + "  seat: $" + price);
        System.out.println("");
        
        for (Iterator<Seat> it = seatsList.iterator(); it.hasNext(); ) {
            Seat r = it.next();
            if(r.getLine()-1 % row.size()== 0){
                System.out.println("");
            }
            
            if(reserveList != null && reserveList.contains(r)){
                System.out.print( " . " );
            }else{
                System.out.print( r.toString() );
            }
            
            
        }
        
        System.out.println("");
        System.out.println("Total available: " + (seats-reserveList.size()));
        System.out.println("Total Sold: " + (reserveList.size()));
        System.out.println("Total income: " + (reserveList.size() * price));

    }
    
    //Class getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Seat> getSeatsList() {
        return seatsList;
    }

    public void setSeatsList(Set<Seat> seatsList) {
        this.seatsList = seatsList;
    }

    public int getNumberRowSeat() {
        return numberRowSeat;
    }

    public void setNumberRowSeat(int numberRowSeat) {
        this.numberRowSeat = numberRowSeat;
    }
    //only getter
    public List<String> getRow() {
        return row;
    }

    public int getSeats() {
        return seats;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
