package com.ipn.CRUD.service;

import com.ipn.CRUD.model.Producto;

public interface ProductoService {
    Producto newProducto(Producto newProducto);
    Iterable<Producto> getAll();
    Producto modifyProducto(Producto producto);
    Boolean deleteProducto(Long idDelProducto);
}
