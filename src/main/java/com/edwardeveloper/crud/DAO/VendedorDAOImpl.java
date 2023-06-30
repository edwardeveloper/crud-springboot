package com.edwardeveloper.crud.DAO;

import com.edwardeveloper.crud.mapper.ClienteMapper;
import com.edwardeveloper.crud.model.Cliente;
import com.edwardeveloper.crud.model.Vendedor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class VendedorDAOImpl implements VendedorDAO {

    private JdbcTemplate jdbcTemplateObject;

    public VendedorDAOImpl(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Vendedor> listVendedores() {
        String SQL = "select * from vendedor";
        List <Vendedor> vendedors = (List<Vendedor>) new Vendedor();//jdbcTemplateObject.query(SQL, new VendedorMapper());
        return vendedors;
    }
}
