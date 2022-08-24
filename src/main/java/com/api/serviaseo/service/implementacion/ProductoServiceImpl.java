package com.api.serviaseo.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.serviaseo.model.Producto;
import com.api.serviaseo.repo.IProductoRepo;
import com.api.serviaseo.service.IProductoService;


@Service
public class ProductoServiceImpl implements IProductoService{
    @Autowired
    private IProductoRepo data;

    @Override
    public List<Producto> get() {    
        return data.findAll();
    }
    
}
