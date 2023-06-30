package com.edwardeveloper.crud.DAO;

import com.edwardeveloper.crud.model.Cliente;

import javax.sql.DataSource;
import java.util.List;

public interface ClienteDAO {
//    public void setDataSource(DataSource ds);
    public List<Cliente> listClientes();
}
