
package com.ecomerce.demo.Producto.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.demo.Producto.Entity.Categoria;
import com.ecomerce.demo.Producto.Entity.RegistroCamposProductos;


@Repository
public interface RepositorioProducto extends JpaRepository<RegistroCamposProductos, Long> {
    Optional<RegistroCamposProductos> findByNombreProducto(String nombre);
    Optional<RegistroCamposProductos> findByPrecioProducto(Double precio);
    Optional<RegistroCamposProductos> findByCategoria_nombreCategoria(Categoria categoria);
    Optional<RegistroCamposProductos> findByNombreProductoAndPrecioProducto(String nombre, Double precio);
    
} 
