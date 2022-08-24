package com.api.serviaseo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.serviaseo.model.Factura;

@Repository("factura")
public interface IFacturaRepo extends JpaRepository<Factura,Integer> {

}
