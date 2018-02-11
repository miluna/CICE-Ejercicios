package com.mla.Clases;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.ParseException;

public class Libro extends AbstractMaterial{
    private String isbn;
    private String autor;

    public Libro() {
        super();
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

    @Override
    public boolean isPrestable() throws NotImplementedException {
        return true;
    }
}
