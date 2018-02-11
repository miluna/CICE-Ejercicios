package com.mla.Clases;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.ParseException;

public class Revista extends AbstractMaterial {

    private int numero;
    private String periocidad;

    public Revista() {
    }

    public Revista(int numero, String periocidad) {
        this.numero = numero;
        this.periocidad = periocidad;
    }

    public Revista(String fecha, String nombre, boolean isPrestado, int numero, String periocidad) throws ParseException {
        super(fecha, nombre, isPrestado);
        this.numero = numero;
        this.periocidad = periocidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }

}
