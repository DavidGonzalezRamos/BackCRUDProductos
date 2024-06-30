package com.ipn.CRUD.service;

import com.ipn.CRUD.model.Producto;
import com.ipn.CRUD.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto newProducto(Producto newProducto) {
        return productoRepository.save(newProducto);
    }

    @Override
    public Iterable<Producto> getAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Producto modifyProducto(Producto producto) {
        Optional<Producto> productoEncontrado = this.productoRepository.findById(producto.getIdDelProducto());;
        if (productoEncontrado.get() != null){
            productoEncontrado.get().setNombreProducto(producto.getNombreProducto());
            productoEncontrado.get().setCategoriaProducto(producto.getCategoriaProducto());
            productoEncontrado.get().setPrecioProducto(producto.getPrecioProducto());
            return this.newProducto(productoEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteProducto(Long idDelProducto) {
        this.productoRepository.deleteById(idDelProducto);
        return true;
    }
}
