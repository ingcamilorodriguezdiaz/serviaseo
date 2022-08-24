package com.api.serviaseo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.api.serviaseo.model.Factura;

public interface IFacturaService {
    Factura save(Factura factura);
    List <Factura> get();
    Page <Factura> getPagination(int page, int pageSize);
}
