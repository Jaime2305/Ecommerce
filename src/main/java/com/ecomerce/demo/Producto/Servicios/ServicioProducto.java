package com.ecomerce.demo.Producto.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.demo.Producto.DTOs.RegistroProducto;
import com.ecomerce.demo.Producto.Repositorio.RepositorioCategoria;
import com.ecomerce.demo.Producto.Repositorio.RepositorioProducto;
import com.ecomerce.demo.Producto.entity.Categoria;
import com.ecomerce.demo.Producto.entity.RegistroCamposProductos;


@Service
public class ServicioProducto {

    @Autowired
    private RepositorioProducto repositorioProducto;

    @Autowired
    private RepositorioCategoria repositorioCategoria;


        public String registrarProducto(RegistroProducto datos) {
        if (repositorioProducto.findByNombreProducto(datos.getNombreProducto()).isPresent()) {
            return "El producto ya existe";
        } else {

        Long longCategoria = Long.valueOf(datos.getidCategoria());
        // Si datos.getidCategoria() es int, conviértelo a Long así:
        // Long longCategoria = Long.valueOf(datos.getidCategoria());
        // Si ya es Long, esta conversión no es necesaria.
      Categoria categoria = repositorioCategoria.findByIdCategoria(longCategoria).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));

            RegistroCamposProductos nuevoProducto = new RegistroCamposProductos();

            nuevoProducto.setNombreProducto(datos.getNombreProducto());
            nuevoProducto.setDescripcionProducto(datos.getDescripcionProducto());
            nuevoProducto.setPrecioProducto(datos.getPrecioProducto());
            nuevoProducto.setEmpresaProducto(datos.getEmpresaProducto());
            nuevoProducto.setCantidadProducto(datos.getCantidadProducto());
            nuevoProducto.setFechaVencimientoProducto(datos.getFechaVencimientoProducto());
            nuevoProducto.setCategoria(categoria);
            repositorioProducto.save(nuevoProducto);
            return "Se registro el producto";
        }
    }


    public boolean buscarPorNombre(String nombre) {
        return repositorioProducto.findByNombreProducto(nombre).isPresent();
    }

    public boolean buscarPorPrecio(Double precio) {
        return repositorioProducto.findByPrecioProducto(precio).isPresent();
    }


    public boolean buscarPorNombreYPrecio(String nombre, Double precio) {
        return repositorioProducto.findByNombreProductoAndPrecioProducto(nombre, precio).isPresent();
    }


    public String eliminarProducto(String nombre, Double precio) {
        boolean existe = repositorioProducto.findByNombreProductoAndPrecioProducto(nombre, precio).isPresent();

        if (existe) {
            repositorioProducto.delete(repositorioProducto.findByNombreProductoAndPrecioProducto(nombre, precio).get());
            return "Se elimino el producto";
        } else {
            return "No se encontro el producto";
        }
    }

    
}
