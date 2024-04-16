package com.softtek.Abril16.persistencia.ejercicio5;

import com.softtek.Abril16.modelo.ejercicio5.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao {
    @Autowired
    private IDAO conexion;

    public ClienteDao() {
    }

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente cliente) {return conexion.insertar(cliente);}

    @Override
    public String toString() {
        return "ClienteDao{" +
                "conexion=" + conexion +
                '}';
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
