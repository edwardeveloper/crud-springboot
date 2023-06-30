package com.edwardeveloper.crud.DAO;

import com.edwardeveloper.crud.mapper.ClienteMapper;
import com.edwardeveloper.crud.model.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ClienteDAOImpl implements ClienteDAO {
    private JdbcTemplate jdbcTemplateObject;

    public ClienteDAOImpl(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Cliente> listClientes() {
        String SQL = "select * from cliente_entity";
        List <Cliente> cliente = jdbcTemplateObject.query(SQL, new ClienteMapper());
        return cliente;
    }
}
