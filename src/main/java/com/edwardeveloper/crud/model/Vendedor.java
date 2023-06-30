package com.edwardeveloper.crud.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Vendedor {
    @Id
    private long id;
    private String nombre;
    private String telefono;
}
