package com.mla.Clases;

import com.mla.Enums.EnumFormatos;

import java.text.ParseException;

public class Multimedia extends AbstractMaterial {
    private EnumFormatos formato;
    private double duracion;

    public Multimedia() {
    }

    public Multimedia(EnumFormatos formato, double duracion) {
        this.formato = formato;
        this.duracion = duracion;
    }

    public Multimedia(String fecha, String nombre, boolean isPrestado, EnumFormatos formato, double duracion) throws ParseException {
        super(fecha, nombre, isPrestado);
        this.formato = formato;
        this.duracion = duracion;
    }

    public EnumFormatos getFormato() {
        return formato;
    }

    public void setFormato(EnumFormatos formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
