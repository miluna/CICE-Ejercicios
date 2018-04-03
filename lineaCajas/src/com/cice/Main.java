package com.cice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // CLIENTE es un array de enteros que cada uno significa los segundos que va a tardar la cajera en procesar el producto
        //{25, 2, 1, 5, 3, 7}
        //Hay una cola de 5 clientes



        Cliente cliente1 = new Cliente(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        Cliente cliente2 = new Cliente(new Integer[]{4, 5, 8, 1, 2, 3, 4, 5});
        Cliente cliente3 = new Cliente(new Integer[]{5, 6, 9, 4, 2, 1, 10, 2});
        Cliente cliente4 = new Cliente(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});

        List<Cliente> colaClientes = new ArrayList<>();
        colaClientes.add(cliente1);
        colaClientes.add(cliente2);
        colaClientes.add(cliente3);
        colaClientes.add(cliente4);


        System.out.println("Comienzo de los procesos");
        System.out.println("-----------------------");
        Cajera cajera1 = new Cajera("Pepa");
        Cajera cajera2 = new Cajera("Francisca");
        Cajera cajera3 = new Cajera("Maria");
        Cajera.setColaClientes(colaClientes);
        cajera1.start();
        cajera2.start();
        cajera3.start();



    }
}
