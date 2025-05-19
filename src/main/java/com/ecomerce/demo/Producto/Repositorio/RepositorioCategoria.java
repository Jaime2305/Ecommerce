package com.ecomerce.demo.Producto.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.demo.Producto.Entity.Categoria;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findByIdCategoria(Long idCategoria);
    Optional<Categoria> findByNombreCategoria(String nombreCategoria);
    Optional<Categoria> findByDescripcionCategoria(String descripcionCategoria);
    Optional<Categoria> findByNombreCategoriaAndDescripcionCategoria(String nombreCategoria, String descripcionCategoria);

    
} 