package com.mla.Clases;

import java.text.ParseException;
import java.util.Date;

public interface IMaterial {

    void setFechaPublicacion(String fecha)throws ParseException;

    Date getFechaPublicacion();

    void setNombre(String nombre);

    String getNombre ();

    boolean isPrestado();

}
