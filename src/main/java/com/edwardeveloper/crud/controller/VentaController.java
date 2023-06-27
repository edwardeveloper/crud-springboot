package com.edwardeveloper.crud.controller;

import com.edwardeveloper.crud.service.VentaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {

    private VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping("/ventas")
    public int getVentas(){
        return ventaService.getVentaService();
    }

}
