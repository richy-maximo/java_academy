
package com.example.collection.list;

import java.util.Objects;


public class Seat {
    //atributes
    private int line;
    private String row;
    
    //Constructor
    public Seat(String row, int line){
        this.row  = row;
        this.line = line;
    }
    
    //Custom
    @Override
    public String toString() {
        
        return "["+ row + line +"]";
    }
    
    @Override
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true 
        if (o == this) {
            return true;
        }
        
        /* Check if o is an instance of Seat or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Seat)) {
            return false;
        }
        //System.out.println("row:"+row);
        //System.out.println("line:"+line);
        // typecast o to Complex so that we can compare data members
        Seat s = (Seat) o;
        
        return s.getRow().equals(row) && s.getLine() == line;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.line;
        hash = 89 * hash + Objects.hashCode(this.row);
        return hash;
    }
    
    //Class setters and getters
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }
}
