package com.cice.ficheros;

import com.cice.ficheros.dto.Curso;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final String FILEPATH = "texto.txt";

    public static void main( String[] args )
    {

        Curso curso = new Curso(1L, "Master Java", "Povedilla", "Programación");
        Curso curso2 = new Curso(2L, "Master Oracle", "Povedilla", "Programación");

        List<Curso> lista = new ArrayList<Curso>();
        lista.add(curso);
        lista.add(curso2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Curso> listaFromJson = gson.fromJson(leerFichero(FILEPATH, new TypeToken<ArrayList<Curso>>(){}.getType()));

        //escribirFichero(FILEPATH, gson.toJson(curso));
        //Curso cursoFromJson = new Gson().fromJson(leerFichero(FILEPATH), Curso.class);
    }

    public static String leerFichero(String rutaFichero)
    {
        FileReader reader;
        BufferedReader bfr;
        StringBuilder texto = new StringBuilder();
        try{
            reader = new FileReader(rutaFichero);
            bfr = new BufferedReader(reader);
            String cadena;
            while ((cadena = bfr.readLine()) != null){
                texto.append(cadena);
            }
            reader.close();
            bfr.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texto.toString();
    }

    public static void escribirFichero (String rutaFichero, String texto){
        try{
            PrintWriter printWriter = new PrintWriter(rutaFichero);
            printWriter.write(texto);
            printWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
