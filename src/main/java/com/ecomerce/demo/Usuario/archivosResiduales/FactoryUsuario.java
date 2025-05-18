package com.ecomerce.demo.Usuario.archivosResiduales;

import com.ecomerce.demo.Usuario.entity.RegistroCamposUsuario;

public class FactoryUsuario {
    public RegistroCamposUsuario crearUsuario(String nombre, String email, String password, String usuarioRol) {
        String rol= usuarioRol.toLowerCase();

        if (rol == null || rol.isEmpty()) {
            throw new IllegalArgumentException("Rol de usuario no puede ser nulo o vacío");
        }
        if (rol.equals("admin")) {
            rol = "ROLE_ADMIN";
        } else if (rol.equals("user")) {
            rol = "ROLE_USER";
        } else {
            throw new IllegalArgumentException("Rol de usuario no válido");
        }
        return new RegistroCamposUsuario(nombre, email, password, usuarioRol);
    }
       

    
    
}
