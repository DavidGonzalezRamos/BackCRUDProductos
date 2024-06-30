package com.ipn.CRUD.repository;

import com.ipn.CRUD.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
