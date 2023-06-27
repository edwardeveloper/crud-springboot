package com.edwardeveloper.crud.controller;

import com.edwardeveloper.crud.service.VendedorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedorController {
    private VendedorService vendedorService;

    public VendedorController(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    @GetMapping("/vendedores")
    public int getVendedores(){
        return vendedorService.getVendedorServive();
    }
}
