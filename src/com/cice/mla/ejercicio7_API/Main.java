package com.cice.mla.ejercicio7_API;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Double> precios = new ArrayList<>();

    public static void main(String[] args) {
        int opcionElegida;
        do {

            showMenu();
            opcionElegida = getOpcion();

        } while (opcionElegida() != 6);

    }

    public static void showMenu() {
        String[] opciones = {"1. Nuevo precio", "2. Precio medio", "3. Precio maximo", "4. Precio minimo", "5. Mostrar los precios", "6. Salir"}

        System.out.println("------- MENU ---------");
        System.out.println("Elige una opción");

        for (String opcion : opciones) {
            System.out.println(opcion);
        }
        System.out.println("----------------------");
    }

    public static int getOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcionElegida;
        opcionElegida = sc.nextInt();

        switch (opcionElegida) {
            case 1:
                System.out.println("Introduce precio: ");
                double precio = sc.nextDouble();
                return opcionElegida;
            case 2:
                System.out.println(getMedia());
                return opcionElegida;
            case 3:
                System.out.println(getMaximo());
                return opcionElegida;
            case 4:
                System.out.println(getMinimo());
                return opcionElegida;
            case 5:
                System.out.println(showTodosPrecios(););
                return opcionElegida;
            case 6:
                System.out.println("Gracias por utilizarme");
                return opcionElegida;
            default:
                System.out.println("La opción elegida no es valida");
                return opcionElegida;
        }
    }
    public static void addPrecio(double precio){
        precios.add(precio);
    }

    public static double getMedia (){
        double total;
        double media;

        for (double precio :precios) {
            total += precio;
        }
        media = total / precios.size();
        return media;
    }
    public static double getMaximo(){
        double maximo = 0;
//        for (int i = 0; i < precios.size(); i++){
//            if (precios.get(i) > maximo){
//                maximo = precios.get(i);
//            }
//        }
        for (double precio: precios) {
            maximo = Math.max(maximo, precio);
        }
        return maximo;
    }
    public static double getMinimo(){
        double minimo= getMaximo();
        for (double precio : precios) {
            minimo = Math.min(minimo, precio);
        }
        return minimo;
    }

    public static void showTodosPrecios (){
        System.out.println("Todos los precios:");
        for (double precio : precios) {
            System.out.println(precio);
        }
    }
}

