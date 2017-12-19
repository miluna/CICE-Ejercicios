package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComercialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercialApplication.class, args);
		
		
		Comercial pepe = new Comercial(1234, "Pepe", "Martinez", 35000);
		Comercial ramon = new Comercial();
		
		pepe.venta();
		
		ramon.setNombre("Ramon");
		ramon.setApellido("Alvarez");
		System.out.println("y yo me llamo " + ramon.getNombre() + " " + ramon.getApellido());
		ramon.devolucion();
		ramon.setSalario(85000);
		System.out.println(ramon.getSalario());
		
		
		
		
	}
}
