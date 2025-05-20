package com.ecomerce.demo.Carrito.Servicios;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.demo.Carrito.DTOs.DTOCarrito;
import com.ecomerce.demo.Carrito.Entity.EntityCarrito;
import com.ecomerce.demo.Carrito.Repositorio.RepositorioCarrito;

@Service
public class ServicioCarrito {


    @Autowired
    private RepositorioCarrito repositorioCarrito;

    public String crearCarrito(DTOCarrito datosCarrito) {


        // Lógica para crear un carrito para el usuario

        Long idUsuario = Long.valueOf(datosCarrito.getIdUsuario());



        EntityCarrito nuevoCarrito = new EntityCarrito();
        nuevoCarrito.setIdUsuario(idUsuario); 
        repositorioCarrito.save(nuevoCarrito);


        return "Carrito creado con éxito";



    }
    
}
