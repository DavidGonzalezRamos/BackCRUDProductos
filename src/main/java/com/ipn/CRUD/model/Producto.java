package com.ipn.CRUD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Producto {
    @Id
    @Column
    private long idDelProducto;

    @Column
    private String nombreProducto;

    @Column
    private String categoriaProducto;

    @Column
    private int precioProducto;
}
