package com.ecomerce.demo.Usuario.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.demo.Usuario.entity.RegistroCamposUsuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<RegistroCamposUsuario, Long> {
    Optional<RegistroCamposUsuario> findByNombre(String nombre);
    Optional<RegistroCamposUsuario> findByCorreo(String correo);
    Optional<RegistroCamposUsuario> findByCorreoAndContrasena(String correo, String contrasena);
 
}

