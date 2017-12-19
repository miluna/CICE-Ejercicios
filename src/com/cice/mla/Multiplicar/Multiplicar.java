package com.cice.mla.ejercicio1;

import java.util.Scanner;

public class Multiplicar {


    public static void main(String[] args) {

        System.out.println("Imprimir tabla del: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();


        for (int i = 1; i <= 10 ; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        //Si concatenas numeros a secas, se juntan los caracters ejemplo 2 + 4 es 24 mientras que (2+4) es 6
    }
}
