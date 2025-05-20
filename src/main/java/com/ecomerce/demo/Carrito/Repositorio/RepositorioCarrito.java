package com.ecomerce.demo.Carrito.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.demo.Carrito.Entity.EntityCarrito;
import java.util.List;


@Repository
public interface RepositorioCarrito extends JpaRepository<EntityCarrito, Long> {
    List<EntityCarrito> findByIdUsuario(Long idUsuario);
    List<EntityCarrito> findByEstado(String estadoCarrito);
    List<EntityCarrito> findByIdUsuarioAndEstado(Long idUsuario, String estadoCarrito);
    

}
