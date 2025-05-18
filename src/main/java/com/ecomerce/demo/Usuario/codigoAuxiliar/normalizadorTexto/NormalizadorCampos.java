package com.ecomerce.demo.Usuario.codigoAuxiliar.normalizadorTexto;

import java.lang.reflect.Field;


import org.springframework.stereotype.Component;

import com.ecomerce.demo.Usuario.codigoAuxiliar.CleanTexto;


@Component
public class NormalizadorCampos {

  public NormalizadorCampos() {}
    
    private CleanTexto cleanTexto;
    // Normaliza el texto de los campos de un objeto RegistroCampos

    public void limpiadorTexto(Object datos) {
      cleanTexto = new CleanTexto(); // Instancia de la clase CleanTexto

      Class<?> claseCampos = datos.getClass();
  
      for (Field campo : claseCampos.getDeclaredFields()) {
          campo.setAccessible(true); // 🔓 permite acceder aunque sea private
  
          try {
              Object valor = campo.get(datos); // obtiene el valor real del campo
  
              if (valor instanceof String) { // solo limpiamos si es un String
                  String textoOriginal = (String) valor;
                  String textoLimpio = cleanTexto.limpiar(textoOriginal); // limpia el valor
                  campo.set(datos, textoLimpio); // actualiza el campo con el texto limpio
  
                  System.out.println("Se limpió el campo: " + campo.getName() + 
                                     " | Original: '" + textoOriginal + 
                                     "' → Limpio: '" + textoLimpio + "'");
              }
  
          } catch (IllegalAccessException e) {
              System.out.println("Error accediendo al campo: " + campo.getName());
              e.printStackTrace();
          }
      }
  }
  

}
