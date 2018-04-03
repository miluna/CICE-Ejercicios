package com.cice;

import java.util.ArrayList;
import java.util.List;

public class Cajera extends Thread {
    private String name;
    private static List<Cliente> colaClientes;
    
    public Cajera(String name) {
        this.name = name;
        colaClientes = new ArrayList<>();
    }

    @Override
    public void run() {
        super.run();
        while (colaClientes.size() > 0){
            atenderCliente(getNextCliente(colaClientes));
        }
        if (colaClientes.size() == 0){
            System.out.println("------------");
            System.out.println(this.name + " HA TERMINADO");
            System.out.println("------------");
        }
    }

    public void atenderCliente(Cliente cliente){
        for (int producto: cliente.getProductos()) {
            try {
                System.out.println(this.name + " esta procesando un producto...");
                Thread.sleep(producto * 1000);
                System.out.println(this.name + " ha terminado con un producto");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public Cliente getNextCliente(List<Cliente> colaClientes) {
        Cliente siguiente = colaClientes.get(0);
        colaClientes.remove(0);
        return siguiente;
    }


    public static void setColaClientes(List<Cliente> colaClientes) {
        Cajera.colaClientes = colaClientes;
    }
}
