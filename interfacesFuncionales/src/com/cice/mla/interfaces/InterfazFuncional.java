package com.cice.mla.interfaces;

/**
 * una interfaz funcional es aquella estructura que contiene un unico metodo abstracto.
 * Contener un unico metodo no significa que no pueda contener metodos por defecto.
 */

public interface InterfazFuncional<T, R> {

    /**
     * Unico metodo abstracto de la interfaz funcional
     * @param a
     * @param b
     * @return
     */
    R test(T a, T b);

}
