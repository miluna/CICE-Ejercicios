package com.mla.Clases;

import com.mla.Enums.EnumFormatos;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.ParseException;

public class Disco extends Multimedia{
    private int numeroDiscos;
    private boolean isEdicionEspecial;


    public Disco() {
    }

    public Disco(EnumFormatos formato, double duracion) {
        super(formato, duracion);
    }

    public Disco(EnumFormatos formato, double duracion, int numeroDiscos, boolean isEdicionEspecial) {
        super(formato, duracion);
        this.numeroDiscos = numeroDiscos;
        this.isEdicionEspecial = isEdicionEspecial;
    }

    public Disco(String fecha, String nombre, boolean isPrestado, EnumFormatos formato, double duracion) throws ParseException {
        super(fecha, nombre, isPrestado, formato, duracion);
    }

    public Disco(String fecha, String nombre, boolean isPrestado, EnumFormatos formato, double duracion, int numeroDiscos, boolean isEdicionEspecial) throws ParseException {
        super(fecha, nombre, isPrestado, formato, duracion);
        this.numeroDiscos = numeroDiscos;
        this.isEdicionEspecial = isEdicionEspecial;
    }

    public int getNumeroDiscos() {
        return numeroDiscos;
    }

    public void setNumeroDiscos(int numeroDiscos) {
        this.numeroDiscos = numeroDiscos;
    }

    public boolean isEdicionEspecial() {
        return isEdicionEspecial;
    }

    public void setEdicionEspecial(boolean edicionEspecial) {
        isEdicionEspecial = edicionEspecial;
    }

    @Override
    public boolean isPrestable() throws NotImplementedException {
        return true;
    }
}
