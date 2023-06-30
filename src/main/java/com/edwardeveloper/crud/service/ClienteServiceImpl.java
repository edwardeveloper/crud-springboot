package com.edwardeveloper.crud.service;

import com.edwardeveloper.crud.DAO.ClienteDAO;
import com.edwardeveloper.crud.model.Cliente;
import com.edwardeveloper.crud.repository.ClienteEntity;
import com.edwardeveloper.crud.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

//    ClienteRepository repository;
//
//    public ClienteServiceImpl(ClienteRepository repository) {
//        this.repository = repository;
//    }

    ClienteDAO clienteDAO;

    public ClienteServiceImpl(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public List<Cliente> getClienteService() {
        return clienteDAO.listClientes();
    }
}
