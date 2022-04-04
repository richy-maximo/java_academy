package com.example.patrones.adapter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RunAdapter {
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date;
        try {
            date = sdf.parse("2022/06/01");        

            ReservaCVImpl reserva = new ReservaCVImpl();

            StandardReservaAdapter adapter 
                                        = new StandardReservaAdapter(reserva);
                            
            System.out.println(adapter.getInfo("DECAMERON"));      
            System.out.println(adapter.creaReserva(date, 3, "DECAMERON", "2957108")); 

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
