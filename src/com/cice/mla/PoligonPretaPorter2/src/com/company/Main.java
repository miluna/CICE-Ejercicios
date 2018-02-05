package com.company;

import com.company.interfaces.IPoligono;
import com.company.interfaces.clases.Cuadrado;
import com.company.interfaces.enums.EnumMateriales;

public class Main {

    public static void main(String[] args) {
        IPoligono poligono = new Cuadrado(EnumMateriales.MADERA);
    }
}
