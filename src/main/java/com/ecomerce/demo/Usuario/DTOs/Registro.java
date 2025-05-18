package com.ecomerce.demo.Usuario.DTOs;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Registro {
    
    @NotBlank(message = "nombre no puede estar vacio")
    @Size(min=4, max=20, message="el nombre debe tener minimo 4 caracteres y maximo 20")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "el nombre solo puede contener letras y espacios")
    private String nombre;

    @Email(message="correo no valido")
    @Size(max=50, message="el correo no puede tener mas de 50 caracteres")
    private String correo;

    @NotBlank(message="la contrasena no puede estar vacia")
    @Size(min=8, max=50, message="la contrasena debe tener minimo 8 caracteres")
    private String contrasena;

    public Registro(){}

    public Registro(String nombre,String correo,String contrasena){
        this.nombre=nombre;
        this.correo=correo;
        this.contrasena=contrasena;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo=correo;
    }

    public String getContrasena(){
        return contrasena;
    }

    public void setContrasena(String contrasena){
        this.contrasena=contrasena;
    }
}
