package com.mla.Clases;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface IMaterial {

    void setFechaPublicacion(String fecha);

    String getFechaPublicacion();

    void setNombre(String nombre);

    String getNombre ();

    boolean isPrestado();

    boolean isPrestable() throws NotImplementedException;

    void prestar();

    void devolver();

}
