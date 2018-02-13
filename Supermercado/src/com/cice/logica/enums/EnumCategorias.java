package com.cice.logica.enums;

public enum EnumCategorias {

    PERECEDEROS_NACIONALES("0001", "8"),
    PERECEDEROS_NO_NACIONALES("0001", "4");

    private String baseCodigo;
    private String codigoPais;


    EnumCategorias(String baseCodigo, String codigoPais) {
        this.baseCodigo = baseCodigo;
        this.codigoPais = codigoPais;
    }

    public String getBaseCodigo() {
        return baseCodigo;
    }

    public void setBaseCodigo(String baseCodigo) {
        this.baseCodigo = baseCodigo;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }
}
