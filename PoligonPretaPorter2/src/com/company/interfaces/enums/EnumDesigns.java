package com.company.interfaces.enums;

public enum EnumDesigns {
    BASICO(1.0d),
    COLOREADO(1.15d),
    COLOREADO_DEAUTOR(1.20d),
    ESTAMPADO(1.17d);

    private double incremento;

    EnumDesigns(double incremento) {
        this.incremento = incremento;
    }

    public double getIncremento(){
        return incremento;
    }
}
