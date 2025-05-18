package com.ecomerce.demo.Usuario.Controller;

import com.ecomerce.demo.Usuario.DTOs.LoginCD;
import com.ecomerce.demo.Usuario.DTOs.Registro;
import com.ecomerce.demo.Usuario.Service.ServicioUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private ServicioUsuario servicioUsuario;

    @PostMapping("/login")
    public String login(@RequestBody @Validated LoginCD usuario, BindingResult resultadoLog) {

        if (resultadoLog.hasErrors()) {
            return "error en los datos de entrada";
        }
        {

            boolean acceso = servicioUsuario.login(usuario.getCorreo(), usuario.getContrasena());
            if (acceso) {
                return "Acceso permitido";
            } else {
                return "Acceso denegado";
            }
        }

    }

    @PostMapping("/registro")
    public String registro(@RequestBody Registro datos, BindingResult resultadoLog) {

        if (resultadoLog.hasErrors()) {
            return "Error en los datos de entrada";
        }

        {
            try {
                boolean existente = servicioUsuario.buscarPorCorreo(datos.getCorreo());
                if (existente) {
                    // Si el correo ya existe, devuelve un error 409 (conflicto)
                    return "El correo ya está registrado";
                }
                servicioUsuario.registrar(datos);
                return "Usuario registrado correctamente";

            } catch (DataIntegrityViolationException e) {
                // Captura cualquier violación como UNIQUE o NOT NULL
                return "Correo duplicado u otro dato inválido";
            } catch (Exception e) {
                return "Error inesperado: " + e.getMessage();
            }
        }
    }


    @DeleteMapping("/eliminar")
    public String eliminarUsuario(@RequestBody LoginCD usuario, BindingResult resultadoLog) {

        return servicioUsuario.eliminarUsuario(usuario.getCorreo(),usuario.getContrasena());
          
        
    }

}
