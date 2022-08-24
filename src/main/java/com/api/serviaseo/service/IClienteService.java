package com.api.serviaseo.service;

import java.util.List;

import com.api.serviaseo.model.Cliente;
public interface IClienteService {
    Cliente save(Cliente cliente);
    List <Cliente> get();
    Cliente search(String cedula);
}
