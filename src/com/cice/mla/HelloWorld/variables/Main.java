/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.variables;


public class Main {
    /**
    * Las variables dentro de un método son locales y por lo tanto 
    * no pueden modificar variables externas a ellos
    * @author cice
    */
    int numero; //Variable de clase, atributo de clase
    static int numeroClase;
    public static void main(String[] args){
        // Si el método es static solo puede usar variables y métodos static
        int numero = 0; 
        //Variable local numero no tiene conflicto con la variable de clase
        
        numero = 20;
        if (numero < 30){
            System.out.println("BANANA!" + "numero: " + numero);
            metodoPrueba();
        } else {
            System.out.println ("No banana :(");
        }
    }
    public static void metodoPrueba(){
        numeroClase = 54;
        int numero = 3; 
        System.out.println("BANANA2!" + "numero: " + numero);
        System.out.println("BANANA3!" + "numeroClase: " + numeroClase);
        System.out.println("BANANA4!");
        // Hacemos uso de la variable de clase "numeroClase"        
        // Creamos una variable local 2
        // Esta segunda variable no afecta ninguna de las otras aunque se llamen igual
    }
    
}
