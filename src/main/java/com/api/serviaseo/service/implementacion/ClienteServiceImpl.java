package com.api.serviaseo.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.serviaseo.model.Cliente;
import com.api.serviaseo.repo.IClienteRepo;
import com.api.serviaseo.service.IClienteService;
@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteRepo data;
    @Override
    public Cliente save(Cliente cliente) {
        return data.save(cliente);
    }    

    public List<Cliente> get(){
        return data.findAll();
    }

    public   Cliente search(String cedula){
        return data.search(cedula);
    }
}
