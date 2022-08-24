package com.api.serviaseo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.api.serviaseo.model.Cliente;
@Repository("cliente")
public interface IClienteRepo extends JpaRepository<Cliente,Integer> {
    @Query(value="SELECT * FROM clientes where cedula=?", nativeQuery = true) 
    public Cliente search(String cedula);
}
