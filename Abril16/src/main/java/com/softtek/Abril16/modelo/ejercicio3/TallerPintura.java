package com.softtek.Abril16.modelo.ejercicio3;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class TallerPintura implements Italler{
    @Override
    public String reparar() {
        return "Pintado";
    }
}
