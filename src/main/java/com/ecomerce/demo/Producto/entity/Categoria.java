package com.ecomerce.demo.Producto.Entity;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categoria")
@DynamicInsert
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCategoria")
    private Long idCategoria;


    @Column(name="nombreCategoria", nullable=false)
    private String nombreCategoria;


    @Column(name="descripcionCategoria", nullable=false)
    private String descripcionCategoria;


    public Categoria(){}

    public Categoria(String nombreCategoria,String descripcionCategoria){
        this.nombreCategoria=nombreCategoria;
        this.descripcionCategoria=descripcionCategoria;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }


}
