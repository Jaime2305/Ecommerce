package com.ecomerce.demo.Usuario.codigoAuxiliar;

public class CleanTexto {

    public CleanTexto() {
        // Constructor privado para evitar instanciación
    }

    public String limpiar(String texto) {
        if (texto == null) return "";
    
        // Convertir a minúsculas y eliminar espacios
        texto = texto.trim().toLowerCase();
    
        // Solo se permiten estos caracteres (puedes ajustar)
        String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyz0123456789.@_-+";
    
        StringBuilder limpio = new StringBuilder();
    
        for (char c : texto.toCharArray()) {
            if (caracteresPermitidos.indexOf(c) != -1) {
                limpio.append(c);
            }
        }
    
        return limpio.toString();
    }
    
}
