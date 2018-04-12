package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Vehiculo {

	//Variables de clase / Atributos
	private int rueda;
	private String color;
	private int potencia;
	private String marca;
	
	//Constructores (los parametros no tienen por qué llamarse igual que las variables)
	public Vehiculo() {
		
	}
	public Vehiculo (int rueda, String color, int potencia, String marca) {
		this.rueda = rueda;
		this.color = color;
		this.potencia = potencia;
		this.marca = marca;
	}
	
	//Métodos de la clase
	public void arrancar() {
		System.out.println("He arrancado");
	}
	
	public String apagar() {
		String string = "Soy el coche " + marca + " y he parado con mi super potencia de " + potencia;
		return string;
	}
	public void setRueda (int r) {
		this.rueda = r;
	}
	public int getRueda () {
		return rueda;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
