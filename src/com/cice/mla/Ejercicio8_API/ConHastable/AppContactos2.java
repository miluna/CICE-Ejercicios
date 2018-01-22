package com.mla;

import java.util.Hashtable;
import java.util.Scanner;

public class AppContactos2 {

    private Hashtable<String, String> listaContactos;

    public AppContactos2(){
        listaContactos = new Hashtable<>();
    }

    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("---------------------");
            System.out.println("Bienvenido a esta app");
            System.out.println("Elige tu opcion:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            controles(opcion);
        } while (opcion != 4);
    }

    private void controles(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                crearContacto();
                break;
            case 2:
                eliminarContacto();
                break;
            case 3:
                mostrarListaContactos();
                break;
            case 4:
                System.out.println("Gracias por su tiempo");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    private void crearContacto() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String dniString;
        String fullDNI;

        System.out.println("Introduce el nombre: ");
        nombre = sc.nextLine();

        System.out.println("Introduce el dni: ");
        dniString = sc.nextLine();
        if (isParsable(dniString)){
            fullDNI = verificarDNI.getDNI(dniString);
        } else {
            System.out.println("El dni introducido no es valido, se creará en 0");
            fullDNI = "00000000A";
        }

        listaContactos.put(fullDNI, nombre);
        System.out.println("Contacto creado");
        System.out.println(fullDNI + " : " + nombre);
    }

    private void eliminarContacto(){
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do{
            mostrarListaContactos();
            System.out.println("Introduce dni o nombre a eliminar: ");
            String datoIntroducido = sc.nextLine();
            boolean contactoEliminado = false;

            if (listaContactos.containsKey(datoIntroducido)){
                listaContactos.remove(datoIntroducido);
                System.out.println("Encontrado DNI. Contacto eliminado");
                contactoEliminado = true;
            }else {
                for (String k : listaContactos.keySet()) {
                    String value = listaContactos.get(k);
                    if (value.equals(datoIntroducido)){
                        listaContactos.remove(k);
                        System.out.println("Encontrado nombre. Contacto eliminado.");
                        contactoEliminado = true;
                    }
                }
            }

            if (contactoEliminado == false){ System.out.println("No se ha encontrado el contacto descrito :("); }
            System.out.println("¿Quiere eliminar otro contacto? s/n");
            respuesta = sc.nextLine();
        } while (respuesta.equals("s"));
    }

    private static boolean isParsable(String str){
        boolean parsable = true;
        try{
            Integer.parseInt(str);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }

    private void mostrarListaContactos() {
        System.out.println("Estos son los contactos listados:");
        for (String k : listaContactos.keySet()) {
            System.out.println(k + " : " + listaContactos.get(k));
        }
    }
}
