package com.ecomerce.demo.Carrito.Entity;

import java.sql.Date;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "carrito")
@DynamicInsert
public class EntityCarrito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCarrito")
    private Long idCarrito;

    @Column(name="idUsuario", nullable=false)
    private Long idUsuario;

    @Column(name="fechaCreacion", nullable = true)
    private Date fechaCreacion;

    @Column(name="estado", nullable = true)
    private String estado;

    public EntityCarrito() {
    }

    public EntityCarrito(Long idCarrito, Long idUsuario, Date fechaCreacion, String estado) {
        this.idCarrito = idCarrito;
        this.idUsuario = idUsuario;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
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
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getestado() {
        return estado;
    }
    public void setestado(String estado) {
        this.estado = estado;
    }
    

}
