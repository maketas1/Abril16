package com.softtek.Abril16.modelo.ejercicio4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director implements Empleado{
    @Autowired
    private IInforme informe;

    public Director() {
    }

    public Director(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTarea() {
        return "Tarea: Director";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String toString() {
        return "Director{" +
                "informe=" + informe.getInforme() +
                '}';
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
