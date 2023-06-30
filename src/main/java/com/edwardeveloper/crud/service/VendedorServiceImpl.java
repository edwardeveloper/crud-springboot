package com.edwardeveloper.crud.service;

import com.edwardeveloper.crud.DAO.VendedorDAO;
import com.edwardeveloper.crud.model.Vendedor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorServiceImpl implements VendedorService {

    private VendedorDAO vendedorDAO;

    public VendedorServiceImpl(VendedorDAO vendedorDAO) {
        this.vendedorDAO = vendedorDAO;
    }

    @Override
    public List<Vendedor> getVendedorServive() {
        return vendedorDAO.listVendedores();
    }
}
