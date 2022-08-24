package com.api.serviaseo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="secuencia_factura")
    @SequenceGenerator(name="secuencia_factura", sequenceName="secuencia_factura", allocationSize=1)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="id_cliente", nullable=false)
    private Cliente cliente;
    @Column(name = "tipo_limpieza", nullable = false)
    private String tipo;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @ManyToMany
    @JsonIgnoreProperties("factura")
    @JoinTable(name = "producto_facturas", joinColumns = {
            @JoinColumn(name = "id_factura", referencedColumnName = "id") }, inverseJoinColumns = {
                    @JoinColumn(name = "id_producto", referencedColumnName = "id",unique=true) })
    private List<Producto> productos = new ArrayList<>();


    
    public Factura() {
    }

    public Factura(Integer id, Cliente cliente, String tipo, Date fecha, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.tipo = tipo;
        this.fecha = fecha;
        this.productos = productos;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
