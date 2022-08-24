package com.api.serviaseo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;


@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="secuencia_producto")
    @SequenceGenerator(name="secuencia_producto", sequenceName="secuencia_producto", allocationSize=1)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @JsonIgnore
    @ManyToMany(mappedBy = "productos",cascade = CascadeType.REMOVE)
    private List<Factura> facturas = new ArrayList<Factura>();
 
    

    public Producto(Integer id, String nombre, List<Factura> facturas) {
        this.id = id;
        this.nombre = nombre;
        this.facturas = facturas;
    }



    public Producto() {

    }



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }



    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }    

}
