package com.company.interfaces.clases;

import com.company.interfaces.enums.EnumDesigns;
import com.company.interfaces.enums.EnumMateriales;

public class Pentagono extends AbstractPoligono {
    //coloreados con las firmas de diseñadores para la coleccion primavera-verano 2013 -> valor añadido 20%


    public Pentagono(EnumMateriales material, EnumDesigns design) {
        super(material, design);
    }

    @Override
    public void mostrarDescripcion() {

    }
}
