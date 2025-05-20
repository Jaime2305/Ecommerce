package com.ecomerce.demo.Carrito.DTOs;

public class DTOCarrito {
    
    private int idUsuario;

    public DTOCarrito(int idUsuario) {

        this.idUsuario = idUsuario;
        
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


}
