package com.ecomerce.demo.Producto.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "productos")
public class RegistroCamposProductos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProducto")
    private Long idProducto;

    @Column(name="nombreProducto", nullable=false)
    private String nombreProducto;

    @Column(name="descripcionProducto", nullable=false)
    private String descripcionProducto;

    @Column(name="precioProducto", nullable=false)
    private float precioProducto;

    @Column(name="empresaProducto", nullable=false)
    private String empresaProducto;

    @Column(name="cantidadProducto", nullable=false)
    private int cantidadProducto;

    @Column(name="fechaVencimientoProducto", nullable=false)
    private LocalDateTime fechaVencimientoProducto;

    @ManyToOne
    @JoinColumn(name = "idCategoriaProducto", referencedColumnName = "idCategoria")
    private Categoria categoria;



    public RegistroCamposProductos(){}
    public RegistroCamposProductos(String nombreProducto, String descripcionProducto, float precioProducto, String empresaProducto,
            int cantidadProducto, LocalDateTime fechaVencimientoProducto, Categoria categoria) 
        {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.empresaProducto = empresaProducto;
        this.cantidadProducto = cantidadProducto;
        this.fechaVencimientoProducto = fechaVencimientoProducto;
        this.categoria = categoria;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getEmpresaProducto() {
        return empresaProducto;
    }

    public void setEmpresaProducto(String empresaProducto) {
        this.empresaProducto = empresaProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public LocalDateTime getFechaVencimientoProducto() {
        return fechaVencimientoProducto;
    }

    public void setFechaVencimientoProducto(LocalDateTime fechaVencimientoProducto) {
        this.fechaVencimientoProducto = fechaVencimientoProducto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


}
