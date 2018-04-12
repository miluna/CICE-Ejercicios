package com.cice.mla.ejercicio1;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int hora;

        while (true) {
            System.out.println("Dime que hora es, con numeros, que sino me rompo:");
            hora = sc.nextInt();

            if (hora >= 6 && hora < 12) {
                System.out.println("BUENOZ DIAZZZ!!!");
            } else if (hora >= 12 && hora < 21) {
                System.out.println("Buenas tardes");
            } else if ((hora >= 0 && hora  < 6) || (hora >= 21 && hora <= 24)) {
                System.out.println("Buenas noches");
            } else {
                System.out.println("Ese numero no existe!!!");
            }
        }


    }


}
