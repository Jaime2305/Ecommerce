package com.ecomerce.demo.Usuario.codigoAuxiliar.DTOconCapa;

import com.ecomerce.demo.Usuario.DTOs.Registro;
import com.ecomerce.demo.Usuario.codigoAuxiliar.CapaRegistros.RegistroCapaInmutable;
import com.ecomerce.demo.Usuario.codigoAuxiliar.normalizadorTexto.NormalizadorCampos;
import com.ecomerce.demo.Usuario.entity.RegistroCamposUsuario;

public class MetodoRegistroLogin {

    private NormalizadorCampos normalizadorCampos;

    private RegistroCamposUsuario registroCampos;


    public MetodoRegistroLogin(){}

    public RegistroCamposUsuario TransporteDatosInmutables(Registro datos){
       
        normalizadorCampos= new NormalizadorCampos();
        normalizadorCampos.limpiadorTexto(datos);
        
        RegistroCapaInmutable registroCapaInmutable= new RegistroCapaInmutable(datos.getNombre(), datos.getCorreo(), datos.getContrasena());
       
            registroCampos=new RegistroCamposUsuario(
            registroCapaInmutable.getNombre(),
            registroCapaInmutable.getCorreo(),
            registroCapaInmutable.getContrasena(),
            ""
        );

        return registroCampos;
        
    }

    


}
