package com.cice.lecturaescritura;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppEscritura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder notas = new StringBuilder();

        String respuesta;
        do {
            System.out.println("Añade una nota? s/n");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("Introduce numero: ");
                String numero = sc.nextLine();
                notas.append(numero);
                notas.append("|");
            }
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Introduce path: ");
        String path = sc.nextLine();

        guardarArchivos(notas.toString(), path);
    }

    private static void guardarArchivos(String texto, String rutaArchivo) {
        try {
            FileWriter fw = new FileWriter(rutaArchivo + ".txt");
            fw.write(texto);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
