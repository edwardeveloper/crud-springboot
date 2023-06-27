package com.edwardeveloper.crud.service;

import com.edwardeveloper.crud.repository.ClienteEntity;
import com.edwardeveloper.crud.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    ClienteRepository repository;

    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ClienteEntity> getClienteService() {
        return repository.findAll();
    }
}
