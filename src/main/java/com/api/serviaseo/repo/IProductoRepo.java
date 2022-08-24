package com.api.serviaseo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.serviaseo.model.Producto;

@Repository("producto")
public interface IProductoRepo extends JpaRepository<Producto,Integer> {

}
