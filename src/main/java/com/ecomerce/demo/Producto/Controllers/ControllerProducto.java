package com.ecomerce.demo.Producto.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.demo.Producto.DTOs.RegistroProducto;
import com.ecomerce.demo.Producto.Servicios.ServicioProducto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/producto")
public class ControllerProducto {

    @Autowired
    private ServicioProducto servicioProducto;
    
    @PostMapping("/Registro")
    public String registroProduco(@RequestBody RegistroProducto registroProducto){
        String respuesta=servicioProducto.registrarProducto(registroProducto);
        return respuesta;
    }
}
