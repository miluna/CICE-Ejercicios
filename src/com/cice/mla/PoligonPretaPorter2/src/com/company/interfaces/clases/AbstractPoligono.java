package com.company.interfaces.clases;

import com.company.interfaces.IPoligono;
import com.company.interfaces.enums.EnumDesigns;
import com.company.interfaces.enums.EnumMateriales;

public abstract class AbstractPoligono implements IPoligono{

    private EnumMateriales material;
    private EnumDesigns design;
    private double precio;

    protected AbstractPoligono(EnumMateriales material, EnumDesigns design) {
        this.material = material;
        this.design = design;
        setPrecio(calcularPrecio());
    }

    public void setPrecio(double precio){
        if (precio >= 0){
            this.precio = precio;
        } else {
            this.precio = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    private double calcularPrecio(){
        double precioCalculado = material.getPrecio() * design.getIncremento();

        return precioCalculado;
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("El precio de " + this.getClass().getSimpleName() + " es: " + this.precio);
    }
}
