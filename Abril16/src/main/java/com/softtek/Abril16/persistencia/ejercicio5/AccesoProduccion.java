package com.softtek.Abril16.persistencia.ejercicio5;

import com.softtek.Abril16.modelo.ejercicio5.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AccesoProduccion implements IDAO{
    @Override
    public String insertar(Cliente cliente) {
        return "Produccion" + cliente.toString();
    }
}
