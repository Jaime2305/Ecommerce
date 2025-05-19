package com.ecomerce.demo.Carrito.Servicios;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ServicioCarrito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCarrito")
    private Long idCarrito;

    @Column(name="idUsuario", nullable=false)
    private Long idUsuario;

    @Column(name="cantidad", nullable=false)
    private int cantidad;

    @Column(name="precioUnitario", nullable=false)
    private float precioUnitario;

    @Column(name="estado", nullable=false)
    private String estadoCarrito;

    public ServicioCarrito() {
    }

    public ServicioCarrito(Long idCarrito, Long idUsuario, int cantidad, float precioUnitario, String estadoCarrito) {
        this.idCarrito = idCarrito;
        this.idUsuario = idUsuario;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.estadoCarrito = estadoCarrito;
    }


    public Long getIdCarrito() {
        return idCarrito;
    }
    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public String getEstadoCarrito() {
        return estadoCarrito;
    }
    public void setEstadoCarrito(String estadoCarrito) {
        this.estadoCarrito = estadoCarrito;
    }
    

}
