package com.cice.db.dto;

import com.cice.logica.enums.EnumCategorias;

public class Producto implements IProducto{

    private String codigo;
    private String nombre;
    private EnumCategorias categoria;
    private Long stockage;

    public Producto() {
    }

    public Producto(EnumCategorias categoria, String nombre){
        this.categoria = categoria;
        this.nombre = nombre;
        setCodigo(generarCodigoProducto(generarBaseCodigoProducto(categoria)));
    }

    public Producto(String codigo, String nombre, EnumCategorias categoria, Long stockage) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stockage = stockage;
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumCategorias getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategorias categoria) {
        this.categoria = categoria;
    }

    public Long getStockage() {
        return stockage;
    }

    public void setStockage(Long stockage) {
        this.stockage = stockage;
    }

    /**
     * Metodo que va a generar un codigo de 4 numeros dependiendo del nombre del producto
     * 1º - Nxxx donde N es el valor del codigo del pais
     * 2º - xNxx donde N es la suma de los digitos de la categoria -> 1901 -> 11 -> 2
     * 3º - xxNN donde N es un numero aleatorio entre 0 y 99
     * @param baseCodigoProducto -> por ejemplo 8_001
     * @return
     */
    private String generarCodigoProducto(String baseCodigoProducto) {
        StringBuilder codigofinal = new StringBuilder(baseCodigoProducto);

        String datos[] = baseCodigoProducto.split("_");

        String codigoIntermedio = String.valueOf(datos[1].chars().map(Character::getNumericValue).sum());

        if (codigoIntermedio.length() > 2){
            codigoIntermedio = String.valueOf(codigoIntermedio.chars().map(Character::getNumericValue).sum());
        }
        codigofinal.append("_");
        codigofinal.append(codigoIntermedio);
        codigofinal.append(String.valueOf(Math.round(Math.random() * 100)));

        return codigofinal.toString();
    }

    private String generarBaseCodigoProducto(EnumCategorias categoria) {
        String baseCodigoProducto = null;

        baseCodigoProducto = categoria.getCodigoPais().concat("_").concat(categoria.getBaseCodigo());

        return  baseCodigoProducto;
    }
}
