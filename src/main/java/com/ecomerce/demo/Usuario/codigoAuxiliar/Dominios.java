package com.ecomerce.demo.Usuario.codigoAuxiliar;

import java.util.ArrayList;
import java.util.List;


interface itfDominios {
    String[] getDominios();
}

public class Dominios {
    private List<String> Lista = new ArrayList<>();

    public Dominios(){
        Lista.add("gmail.com");
        Lista.add("hotmail.com");
        Lista.add("outlook.com");
    }

    public void setDominios(String dominio){
        Lista.add(dominio);
    }

    protected List<String> getDominios() {
        return Lista;

    }
}



class recolectorDominios implements itfDominios {

    private Dominios dominios = new Dominios();

    private String[] Lista = new String[dominios.getDominios().size()];

//se asegura una lista de dominios fija sin modificaciones externas
    public  String[] getDominios() {
        int i = 0;
        for (String dominio : dominios.getDominios()) {
            Lista[i] = dominio;
            i++;
        }
        return Lista;
    }

}


