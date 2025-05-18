package com.ecomerce.demo.Usuario.Service;
    
import com.ecomerce.demo.Usuario.DTOs.Registro;
import com.ecomerce.demo.Usuario.Interfaces.InterfaceRegistroCampos;
import com.ecomerce.demo.Usuario.Repositorio.RepositorioUsuario;
import com.ecomerce.demo.Usuario.codigoAuxiliar.DTOconCapa.MetodoRegistroLogin;

import com.ecomerce.demo.Usuario.entity.RegistroCamposUsuario;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioUsuario{

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    
    public boolean login(String correo, String contrasena) {

        return repositorioUsuario.findByCorreoAndContrasena(correo, contrasena).isPresent();
    }

    public InterfaceRegistroCampos registrar(Registro datos) {
        MetodoRegistroLogin metodoRegistroLogin = new MetodoRegistroLogin();
        RegistroCamposUsuario datosNuevos= metodoRegistroLogin.TransporteDatosInmutables(datos);
        return repositorioUsuario.save(datosNuevos);
    }

    public boolean buscarPorCorreo(String correo) {
        return repositorioUsuario.findByCorreo(correo).isPresent();
    }

    public String eliminarUsuario(String correo, String contrasena) {

        Optional<RegistroCamposUsuario> usuario= repositorioUsuario.findByCorreoAndContrasena(correo, contrasena);
    
        boolean existe=repositorioUsuario.findByCorreoAndContrasena(correo, contrasena).isPresent();

        if(existe==true)
        {
            repositorioUsuario.delete(usuario.get());
            return "Se elimino el usuario";
        }else{
            return "No se encontro el usuario";
        }
        
    }

    
}


