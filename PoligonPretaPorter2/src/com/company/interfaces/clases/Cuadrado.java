package com.company.interfaces.clases;

import com.company.interfaces.enums.EnumDesigns;
import com.company.interfaces.enums.EnumMateriales;

public class Cuadrado extends AbstractPoligono {

    //puede salir por temporada, se hace de otro material (TELA) es estampado valor añadido 15%
    private String material;
    private String design;
    private String season;

    public Cuadrado(EnumMateriales material, EnumDesigns design) {
        super(material, design);
    }

    @Override
    public void mostrarDescripcion() {

    }
}
