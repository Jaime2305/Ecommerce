package com.ecomerce.demo.Usuario.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Login Create or Delete = LoginCD es un DTO Data Transport Object o un clase que transporta datos como objeto
public class LoginCD {
   
    @Size(max=50, message="el correo no puede tener mas de 50 caracteres")
    @Email(message="correo no valido")
    private String correo;

  
    @NotBlank(message="la contrasena no puede estar vacia")
    private String contrasena;

    public LoginCD(){}

    public LoginCD(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
        
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


}
