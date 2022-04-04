package com.example.patrones.adapter;

import java.util.Date;

public class StandardReservaAdapter implements StandardReservaACME{

    ReservaCV miSistema;

    public StandardReservaAdapter(ReservaCV miSistema){
        this.miSistema = miSistema;
    }

    @Override
    public String getInfo(String idHotel) {
        return miSistema.hotelInfo(idHotel);
    }

    @Override
    public String creaReserva(Date fecha, int dias, String idHotel, String cliente) {
        return miSistema.creaReserva(fecha, dias, idHotel, cliente);
    }

    @Override
    public String datoReserva(String codigo) {
        return miSistema.datoReserva(Long.valueOf(codigo));
    }

    //Class
    public ReservaCV getMiSistema() {
        return miSistema;
    }

    public void setMiSistema(ReservaCV miSistema) {
        this.miSistema = miSistema;
    }

    
    
}
