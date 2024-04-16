package com.softtek.Abril16.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Saludo {

    @Value("Hola mundo")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }
}
