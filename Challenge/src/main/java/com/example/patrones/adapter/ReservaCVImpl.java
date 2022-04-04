package com.example.patrones.adapter;

import java.util.Date;

public class ReservaCVImpl implements ReservaCV{

    @Override
    public String hotelInfo(String idHotel) {
        return "RICHY's hotel tiene el id ->" + idHotel;
    }

    @Override
    public String creaReserva(Date fecha, int dias, String idHotel, String cliente) {
        return "Reserva creada con fecha: " + fecha.toString() + 
                ", por " + dias + " dias " +
                "en el hotel id: " + idHotel +
                " codigo de reservacion -> " + cliente;
    }

    @Override
    public String datoReserva(Long codigo) {
        return "La reserva es con el codigo " + codigo;
    }
    
}
