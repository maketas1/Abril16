package com.softtek.Abril16.modelo.ejercicio3;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Primary
public class TallerMecanica implements Italler {

    @Override
    public String reparar() {
        return "Reparado";
    }
}
