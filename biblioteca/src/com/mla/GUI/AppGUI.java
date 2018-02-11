package com.mla.GUI;

import com.mla.Clases.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppGUI {

    private List<IMaterial> materiales;
    private List<IMaterial> publicaciones;
    private List<IMaterial> discos;

    public AppGUI() {
        materiales = new ArrayList<>();
        publicaciones = new ArrayList<>();
        discos = new ArrayList<>();
    }

    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        String input;
        int respuesta;
        do {
            System.out.println("Bienvenido a la biblioteca 2.0");
            System.out.println("Introduce la opcion deseada");
            System.out.println("------------------------------");
            System.out.println("1. Añadir material a la biblioteca");
            System.out.println("2. Buscar materiales anteriores a una fecha");
            System.out.println("3. Mostrar todas las publicaciones y discos");
            System.out.println("4. Imprimir materiales prestados");
            System.out.println("5. Prestar materiales");
            System.out.println("6. Devolver materiales");
            System.out.println("0. Salir");

            input = sc.nextLine();
            if (!isParsable (input)){
                System.out.println("Respuesta debe ser un numero!");
                System.out.println("-----------------");
            }
        } while (Integer.parseInt(input) > 6);

        controlador(Integer.parseInt(input));
    }

    private void controlador(int respuesta){
        switch (respuesta){
            case 0:
                System.out.println("Gracias por utilizar la biblioteca 2.0");;
                break;
            case 1:
                crearMaterial();
                showMenu();
                break;
            case 2:
                buscarPorFecha();
                showMenu();
                break;
            case 3:
                imprimirListado();
                showMenu();
                break;
            case 4:
                getPrestados();
                showMenu();
                break;
            case 5:
                prestarMateriales();
                showMenu();
                break;
            case 6:
                devolverMateriales();
                showMenu();
                break;
            default:
                System.out.println("La opcion elegida es incorrecta, por favor");

        }

    }

    private void crearMaterial (){
        IMaterial nuevoMaterial = new Libro();
        Scanner sc = new Scanner(System.in);
        int respuesta1;
        int respuesta2;

        System.out.println("Introduce el material que quieres crear:");
        System.out.println("1. Publicaciones");
        System.out.println("2. Multimedia");
        respuesta1 = Integer.parseInt(sc.nextLine());

        if (respuesta1 == 1){
            System.out.println("Indica que tipo de publicacion quieres crear:");
            System.out.println("1. Libro");
            System.out.println("2. Revista");
            System.out.println("3. Comic");
            respuesta2 = Integer.parseInt(sc.nextLine());

            if (respuesta2 == 1){
                nuevoMaterial = new Libro();
            }
            if (respuesta2 == 2){
                nuevoMaterial = new Revista();
            }
            if (respuesta2 == 3){
                nuevoMaterial = new Comic();
            }
            System.out.println("Introduce titulo:");
            nuevoMaterial.setNombre(sc.nextLine());
            System.out.println("Introduce fecha de publicacion:");
            nuevoMaterial.setFechaPublicacion(sc.nextLine());

            materiales.add(nuevoMaterial);
            publicaciones.add(nuevoMaterial);
        }
        if (respuesta1 == 2){
            System.out.println("Solo se puede crear discos");
            nuevoMaterial = new Disco();
            System.out.println("Introduce titulo:");
            nuevoMaterial.setNombre(sc.nextLine());
            System.out.println("Introduce fecha de publicacion:");
            nuevoMaterial.setFechaPublicacion(sc.nextLine());

            materiales.add(nuevoMaterial);
            discos.add(nuevoMaterial);
        }
    }

    private void buscarPorFecha() {
        System.out.println("Esto no lo voy a implementar... pereza");
        System.out.println("-----------------");
    }

    private void imprimirListado() {
        for (IMaterial material: materiales) {
            System.out.println(material.getNombre() + " - " + material.getClass().getSimpleName());
        }
        System.out.println("-----------------");
    }

    private void getPrestados() {
        System.out.println("Materiales prestados:");
        for (IMaterial material : materiales) {
            if (material.isPrestado()) {
                System.out.println(material.getNombre() + " - " + material.getClass().getSimpleName());
            }
        }
        System.out.println("-----------------");
    }

    private void prestarMateriales(){
            String respuesta;
            Scanner sc = new Scanner(System.in);

            System.out.println("Estos son los materiales prestables:");

            System.out.println("Publicaciones:");
            System.out.println("--------------");
            for (IMaterial material : publicaciones) {
                try {
                    if (material.isPrestable()) {
                        System.out.println(material.getNombre());
                    }
                } catch (NotImplementedException e) {
                    continue;
                }
            }
            System.out.println("Multimedia:");
            System.out.println("--------------");
            for (IMaterial material : discos) {
                try {
                    if (material.isPrestable()) {
                        System.out.println(material.getNombre());
                    }
                } catch (NotImplementedException e) {
                    continue;
                }
            }
            do {
                System.out.println("Introduce el nombre del material a prestar");
                respuesta = sc.nextLine();
                for (IMaterial material : materiales) {
                    if (material.getNombre().equalsIgnoreCase(respuesta)) {
                        material.prestar();
                    }
                }
                System.out.println("Quieres prestar otro material? s/n");
                respuesta = sc.nextLine();
            } while (respuesta.equals("s"));
            System.out.println("-----------------");
        }

    private void devolverMateriales(){
        Scanner sc = new Scanner(System.in);
        String respuesta;

        getPrestados();
        System.out.println("Indica el nombre del producto a devolver:");
        respuesta = sc.nextLine();

        for (IMaterial material:materiales) {
            if(material.getNombre().equalsIgnoreCase(respuesta)) {
                material.devolver();
            }
        }
        System.out.println("-----------------");
    }

    private boolean isParsable (String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
