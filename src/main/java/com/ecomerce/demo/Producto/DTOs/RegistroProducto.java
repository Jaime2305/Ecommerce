package com.ecomerce.demo.Producto.DTOs;

import java.time.LocalDateTime;

public class RegistroProducto {

    
    private String nombreProducto;

    private String descripcionProducto;

    private float precioProducto;


    private String empresaProducto;

    private int cantidadProducto;

    private LocalDateTime fechaVencimientoProducto;

    private int idCategoria;



    public RegistroProducto(){}
    public RegistroProducto(String nombreProducto, String descripcionProducto, float precioProducto, String empresaProducto,
            int cantidadProducto, LocalDateTime fechaVencimientoProducto, int idCategoria) 
        {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.empresaProducto = empresaProducto;
        this.cantidadProducto = cantidadProducto;
        this.fechaVencimientoProducto = fechaVencimientoProducto;
        this.idCategoria = idCategoria;
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

    public int getidCategoria() {
        return idCategoria;
    }

    public void setidCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }



}

