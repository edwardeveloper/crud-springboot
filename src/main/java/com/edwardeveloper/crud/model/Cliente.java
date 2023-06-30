package com.edwardeveloper.crud.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cliente {
    @Id
    private long id;
    private String nombre;
//    private String direccion;
//    private String telefono;
//    private String correoElectronico;
}

