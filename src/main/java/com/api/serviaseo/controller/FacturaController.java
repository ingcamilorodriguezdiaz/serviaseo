package com.api.serviaseo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.api.serviaseo.model.Cliente;
import com.api.serviaseo.model.Factura;
import com.api.serviaseo.service.IClienteService;
import com.api.serviaseo.service.IFacturaService;

@RestController
@RequestMapping("/factura")
@CrossOrigin(origins = "http://localhost:4200")
public class FacturaController {
    @Autowired
    private IFacturaService service;

    @Autowired
    private IClienteService serviceCliente;

    @PostMapping("/save")
    public Factura save(@RequestBody Factura factura) {
        Cliente cliente = serviceCliente.search(factura.getCliente().getCedula());
        if(cliente == null){
            factura.setCliente(serviceCliente.save(factura.getCliente()));
        }
        return service.save(factura);
    }

    @GetMapping("/get")
    public List<Factura> get() {
        return service.get();
    }

    @GetMapping("/getPagination")
    public Page<Factura> getPagination(
            @RequestParam(value = "page", required = false) int page,
            @RequestParam(value = "pageSize", required = false) int pageSize) {
        return service.getPagination(page,pageSize);
    }
}
