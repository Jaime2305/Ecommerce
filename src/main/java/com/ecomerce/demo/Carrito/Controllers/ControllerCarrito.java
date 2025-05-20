package com.ecomerce.demo.Carrito.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecomerce.demo.Carrito.DTOs.DTOCarrito;
import com.ecomerce.demo.Carrito.Servicios.ServicioCarrito;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/carrito")
public class ControllerCarrito {

    @Autowired
    private ServicioCarrito servicioCarrito;
    


    @PostMapping("/crear")
    public String Crear(@RequestBody DTOCarrito datosCarrito) {
        return servicioCarrito.crearCarrito(datosCarrito);
    }
   

}
