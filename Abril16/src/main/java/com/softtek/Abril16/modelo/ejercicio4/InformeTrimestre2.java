package com.softtek.Abril16.modelo.ejercicio4;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre2 implements IInforme {
    @Override
    public String getInforme() {
        return "Informe del trimestre 2";
    }
}
