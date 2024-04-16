package com.softtek.Abril16.persistencia.ejercicio5;

import com.softtek.Abril16.modelo.ejercicio5.Cliente;
import org.springframework.stereotype.Component;

@Component
public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente cliente) {
        return "Desarrollo" + cliente.toString();
    }


}
