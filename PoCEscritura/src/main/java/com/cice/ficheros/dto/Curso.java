package com.cice.ficheros.dto;

public class Curso {

    private Long idCurso;
    private String nombreCurso;
    private String centro;
    private String categoria;

    public Curso() {
    }

    public Curso(Long idCurso, String nombreCurso, String centro, String categoria) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.centro = centro;
        this.categoria = categoria;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
