package com.cice.lecturaescritura;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class App
{
    private static final String PATH = "notas.txt";


    public static void main( String[] args )
    {
        String contenido = leerArchivo(PATH);
        String[] dividido = contenido.split("\\|");

        List<Double> numeros = new ArrayList<Double>();
        for (String s : dividido) {
            System.out.println(s);
            numeros.add(Double.parseDouble(s.trim()));
        }
        BigDecimal media = BigDecimal.valueOf(calcularMedia(numeros)).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Media es: " + media);

    }

    private static String leerArchivo(String rutaArchivo){
        String cadena;
        StringBuilder textoReturn = new StringBuilder();
        try{
            FileReader fileReader = new FileReader(rutaArchivo);
            BufferedReader bfr = new BufferedReader(fileReader);

            while ((cadena = bfr.readLine()) != null) {
                textoReturn.append(cadena).append("|");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return textoReturn.toString();
    }

    private static double calcularMedia(List<Double> total){
        double numeroReturn = 0.0;
        for (Double n : total) {
            numeroReturn += n;
        }
        return (numeroReturn / total.size());
    }

}
