package com.manejofechas.Controller;

import com.manejofechas.Services.InterfaceFechaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FechaController {

    @Autowired
    private InterfaceFechaService fechaService;
    
    @GetMapping ("/calcularedad/{dia}/{mes}/{año}")
    public int calcularEdad(@PathVariable int dia, @PathVariable int mes, @PathVariable int año){
        return fechaService.calcularEdad(dia, mes, año);
    }

}
