package com.mla.Clases;

import java.text.ParseException;

public class Libro extends AbstractMaterial {
    private String isbn;
    private String autor;

    public Libro() {
    }

    public Libro(String isbn, String autor) {
        this.isbn = isbn;
        this.autor = autor;
    }

    public Libro(String fecha, String nombre, boolean isPrestado, String isbn, String autor) throws ParseException {
        super(fecha, nombre, isPrestado);
        this.isbn = isbn;
        autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
