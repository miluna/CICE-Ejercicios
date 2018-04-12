package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiceClasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiceClasesApplication.class, args);
		
		Vehiculo coche1 = new Vehiculo();
		Vehiculo coche2 = new Vehiculo(4, "rojo", 130, "Opel");
		
		coche1.arrancar();
		System.out.println("-------------");
		coche2.arrancar();
		System.out.println("-------------");
		coche1.apagar();
		System.out.println("-------------");
		coche2.apagar();
		System.out.println("-------------");
		// Ahora queremos ver lo que dice el metodo apagar
		System.out.println(coche1.apagar());
		System.out.println("-------------");
		System.out.println(coche2.apagar());
		System.out.println("-------------");
		// Get y set
		coche1.setRueda(6);
		System.out.println("Ruedas: " + coche1.getRueda());
		System.out.println("-------------");
		// Intercambiar potencia
		coche1.setPotencia(coche2.getPotencia());
		System.out.println("Potencia coche 1: " + coche1.getPotencia());
		System.out.println("Potencia coche 2: " + coche2.getPotencia());
		
	}
}
