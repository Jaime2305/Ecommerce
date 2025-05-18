package com.ecomerce.demo.Usuario.codigoAuxiliar.CapaRegistros;

public class RegistroCapaInmutable {
    private final String nombre;
    private final String correo;
    private final String contrasena;

    public RegistroCapaInmutable(String nombre,String correo,String contrasena){
        this.nombre=nombre;
        this.correo=correo;
        this.contrasena=contrasena;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public String getContrasena(){
        return contrasena;
    }
    

}
