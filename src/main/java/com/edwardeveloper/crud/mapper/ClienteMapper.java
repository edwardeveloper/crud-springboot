package com.edwardeveloper.crud.mapper;

import com.edwardeveloper.crud.model.Cliente;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteMapper implements RowMapper<Cliente> {

    @Override
    public Cliente mapRow(ResultSet resultSet, int i) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId(resultSet.getLong("id"));
//        cliente.setCorreoElectronico(resultSet.getString("correo_electronico"));
//        cliente.setDireccion(resultSet.getString("direccion"));
        cliente.setNombre(resultSet.getString("nombre"));
//        cliente.setTelefono(resultSet.getString("telefono"));
        return cliente;
    }
}
