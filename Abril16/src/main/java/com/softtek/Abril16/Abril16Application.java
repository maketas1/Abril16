package com.softtek.Abril16;

import com.softtek.Abril16.modelo.ejercicio1.Saludo;
import com.softtek.Abril16.modelo.ejercicio2.Conductor;
import com.softtek.Abril16.modelo.ejercicio2.Coche;
import com.softtek.Abril16.modelo.ejercicio3.Coche2;
import com.softtek.Abril16.modelo.ejercicio3.SeguroCoche;
import com.softtek.Abril16.modelo.ejercicio4.Jefe;
import com.softtek.Abril16.modelo.ejercicio5.Cliente;
import com.softtek.Abril16.persistencia.ejercicio5.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {

	@Autowired
	private Saludo saliudo;

	@Autowired
	private Conductor c1;

	@Autowired
	private SeguroCoche sc;

	@Autowired
	private Jefe jefe;

	@Autowired
	private Coche2 c2;

	@Autowired
	private Cliente cliente;

	@Autowired
	private ClienteDao cd;

	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ejercicio 1");
		System.out.println(saliudo.getSaludo());
		System.out.println(" ");

		System.out.println("Ejercicio 2");
		System.out.println(c1.conducir());
		System.out.println(" ");

		System.out.println("Ejercicio 3");
		System.out.println(sc.reparar(c2));
		System.out.println(" ");

		System.out.println("Ejercicio 4");
		System.out.println(jefe.getTarea() + ", " + jefe.getInforme());
		System.out.println(" ");

		System.out.println("Ejercicio 5");
		System.out.println(cd.insertar(cliente));
	}
}
