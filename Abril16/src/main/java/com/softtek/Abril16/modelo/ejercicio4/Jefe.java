package com.softtek.Abril16.modelo.ejercicio4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jefe implements Empleado{
    @Autowired
    private IInforme informe;

    public Jefe() {
    }

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTarea() {
        return "Tarea: Jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "informe=" + informe.getInforme() +
                '}';
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
