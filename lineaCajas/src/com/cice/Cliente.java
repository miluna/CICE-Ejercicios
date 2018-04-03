package com.cice;


public class Cliente {
    private Integer[] productos;


    public Cliente(Integer[] productos) {
        this.productos = productos;
    }

    public Integer[] getProductos() {
        return productos;
    }

    public void setProductos(Integer[] productos) {
        this.productos = productos;
    }
}
