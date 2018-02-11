package com.mla.Clases;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class AbstractMaterial implements IMaterial{

    protected String fechaDePublicacion;
    protected String nombre;
    protected boolean isPrestado;

    public AbstractMaterial() {
    }

    public AbstractMaterial(String fecha, String nombre, boolean isPrestado) {
        this.fechaDePublicacion = fecha;
        this.nombre = nombre;
        this.isPrestado = isPrestado;
    }

    @Override
    public void setFechaPublicacion(String fecha){
        this.fechaDePublicacion = fecha;
    }


    @Override
    public String getFechaPublicacion() {
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

    @Override
    public boolean isPrestable() throws NotImplementedException {
        throw new NotImplementedException();
    }

    @Override
    public void prestar() {
        try{
            if (this.isPrestable()){
                this.isPrestado = true;
            }
        } catch (NotImplementedException e){
            System.out.println("Objeto no prestable");;
        }
    }

    @Override
    public void devolver() {
        this.isPrestado = false;
    }
}
