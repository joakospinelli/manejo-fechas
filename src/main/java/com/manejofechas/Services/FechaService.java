package com.manejofechas.Services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

@Service
public class FechaService implements InterfaceFechaService{

    @Override
    public int calcularEdad(int dia, int mes, int año) {
        LocalDate fecha = LocalDate.of(año,mes,dia);
        return (int) ChronoUnit.YEARS.between(fecha, LocalDate.now());
    }
    
}
