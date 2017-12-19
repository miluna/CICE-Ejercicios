package com.cice.mla.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int numero = 256;
//
//        if (numero % 2 == 0){
//            System.out.println("El numero es par");
//        } else {
//            System.out.println("El numero es impar!!!!!");
//        }

        System.out.println("Calculo de par/impar");
        System.out.println("Escribe tu numero: ");

        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = sc.nextInt();

        if (numeroIntroducido % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar!!!!!");
        }
    }
}
