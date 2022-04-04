package com.example.patrones.adapter;

import java.util.Date;

public interface StandardReservaACME {
    String getInfo(String idHotel);
    String creaReserva(Date fecha, int dias, String idHotel, String cliente);
    String datoReserva(String codigo);
}
