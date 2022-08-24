package com.api.serviaseo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.serviaseo.model.Cliente;
import com.api.serviaseo.service.IClienteService;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
    @Autowired
    private IClienteService service;


    @PostMapping("/crear")
    public Cliente save(@RequestBody Cliente cliente) {
        return service.save(cliente);
    }


    @GetMapping("/all")
    public List<Cliente> get() {
        return service.get();
    }

    @GetMapping("/search")
    public Cliente search(  @RequestParam(value = "cedula", required = true) String cedula) {
        return service.search(cedula);
    }
}
