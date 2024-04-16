package com.softtek.Abril16.modelo.ejercicio5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

    @Value("Pepe")
    private String nombre;

    @Value("123456789A")
    private String nif;

    public Cliente() {
    }

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
