package com.ecomerce.demo.Usuario.entity;

import com.ecomerce.demo.Usuario.Interfaces.InterfaceRegistroCampos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class RegistroCamposUsuario implements InterfaceRegistroCampos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    @NotBlank(message = "nombre no puede estar vacio")
    @Size(min=4, max=20, message="el nombre debe tener minimo 4 caracteres y maximo 20")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "el nombre solo puede contener letras y espacios")
    private String nombre;

    @Column(name = "correo", nullable = false, unique = true)
    @Email(message="correo no valido")
    private String correo;

    @Column(name = "contrasena", nullable = false)
    @NotBlank(message="la contrasena no puede estar vacia")
    @Size(min=8, message="la contrasena debe tener minimo 8 caracteres")
    private String contrasena;

    @Column(name = "usuarioRol", nullable = false)
    private String usuarioRol;


    public RegistroCamposUsuario(){}

    public RegistroCamposUsuario(String nombre, String correo, String contrasena, String usuarioRol) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.usuarioRol = usuarioRol;
    }


    public Long getId(){
        return id;
    }

    public Long setId(Long id){
        return this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setUsuarioRol(String usuarioRol) {
        this.usuarioRol = usuarioRol;
    }

    public String getUsuarioRol(){
        return usuarioRol;
    }


}