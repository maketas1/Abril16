package com.softtek.Abril16.modelo.ejercicio3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeguroCoche {

    @Autowired
    private Italler taller;
    private String aseguradora;

    public String reparar(Coche2 coche) {
        return taller.reparar();
    }

}
