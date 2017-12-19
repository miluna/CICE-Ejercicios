package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Comercial {
	private int id;
	private String nombre;
	private String apellido;
	private int salario;
	
	public Comercial() {}
	public Comercial (int id, String nombre, String apellido, int salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	
	
	public Venta venta() {
		return new Venta();
	}
	
	public Venta venta (int id, String nombre, double precio) {
		return new Venta(id, nombre, precio);
	}
	
	public void devolucion() {
		System.out.println("Me han devuelto, puta vida");
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
