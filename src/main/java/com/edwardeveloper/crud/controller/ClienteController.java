package com.edwardeveloper.crud.controller;
import com.edwardeveloper.crud.repository.ClienteEntity;
import com.edwardeveloper.crud.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public List<ClienteEntity> getClientesController(){
        return clienteService.getClienteService();
    }

}
