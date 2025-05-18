package com.ecomerce.demo.Usuario.codigoAuxiliar;

interface Verificacion {
    boolean esValido(String variable);

    boolean getValidacion();
}

class CorreoVerificador implements Verificacion{
    private recolectorDominios dominios = new recolectorDominios();
    private boolean validador=false;

    @Override
    public boolean esValido(String correo) {
        if (!correo.isEmpty()) {
            for (String dominio : dominios.getDominios()) {

                String regex = "^[a-zA-Z0-9._%+-]+@" + dominio.replace(".", "\\.") + "$";

                // Validar usando el patrón
                if (correo.matches(regex)) {
                    validador=true;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean getValidacion(){
        return validador;
    }
}
