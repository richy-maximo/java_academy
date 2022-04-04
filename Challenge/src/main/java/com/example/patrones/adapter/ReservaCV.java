package com.example.patrones.adapter;

import java.util.Date;

public interface ReservaCV {
    String hotelInfo(String idHotel);
    String creaReserva(Date fecha, int dias, String idHotel, String cliente);
    String datoReserva(Long codigo);
}
