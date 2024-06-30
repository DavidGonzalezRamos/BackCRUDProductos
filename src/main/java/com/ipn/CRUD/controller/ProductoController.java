package com.ipn.CRUD.controller;

import com.ipn.CRUD.model.Producto;
import com.ipn.CRUD.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins ={"http://localhost:4200" , "https://gorgeous-frangipane-6ba898.netlify.app/"})
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping("/nuevo")

    public Producto newProduct(@RequestBody Producto newProduct){
        return this.productoService.newProducto(newProduct);
    }

    @GetMapping("/mostrar")
    public Iterable<Producto> getAll(){
        return  productoService.getAll();
    }

    @PostMapping("/update")
    public Producto updateProducto(@RequestBody Producto producto){
        return this.productoService.modifyProducto(producto);
    }

    @PostMapping(value ="/{id}")
    public Boolean deleteProducto(@PathVariable(value = "id") Long id){
        return this.productoService.deleteProducto(id);
    }
}
