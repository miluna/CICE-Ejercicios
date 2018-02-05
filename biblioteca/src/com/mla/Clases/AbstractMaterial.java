package com.mla.Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractMaterial implements IMaterial{

    Date fechaDePublicacion;
    String nombre;
    boolean isPrestado;

    public AbstractMaterial() {
    }

    public AbstractMaterial(String fecha, String nombre, boolean isPrestado) throws ParseException {
        setFechaPublicacion(fecha);
        this.nombre = nombre;
        this.isPrestado = isPrestado;
    }

    @Override
    public void setFechaPublicacion(String fecha) throws ParseException {
        SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
        Date date = parser.parse(fecha);
        this.fechaDePublicacion = date;
    }


    @Override
    public Date getFechaPublicacion() {
        return this.fechaDePublicacion;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean isPrestado() {
        return this.isPrestado;
    }

    protected void prestar(){
        this.isPrestado = true;
    }

    protected void devolver(){
        this.isPrestado = false;
    }
}
