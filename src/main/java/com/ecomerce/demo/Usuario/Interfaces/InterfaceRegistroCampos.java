package com.ecomerce.demo.Usuario.Interfaces;

public interface InterfaceRegistroCampos{
    void setNombre(String nombre);
    void setCorreo(String correo);
    void setContrasena(String contrasena);
    void setUsuarioRol(String usuarioRol);
    String getNombre();
    String getCorreo();
    String getContrasena();
    String getUsuarioRol();    
}
