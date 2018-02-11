package com.mla.Clases;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.ParseException;

public class Comic extends AbstractMaterial{

    private int numero;
    private String coleccion;

    public Comic() {
    }

    public Comic(int numero, String coleccion) {
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public Comic(String fecha, String nombre, boolean isPrestado, int numero, String coleccion) throws ParseException {
        super(fecha, nombre, isPrestado);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

}
