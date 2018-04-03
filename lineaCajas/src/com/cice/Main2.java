package com.cice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    /*
        Este ejemplo crea un pool de clientes para que se lancen con el Executor.
        Los elementos que corren lo que manda el executor tienen que implementar Runnable
     */

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        Cliente cliente2 = new Cliente(new Integer[]{4, 5, 8, 1, 2, 3, 4, 5});
        Cliente cliente3 = new Cliente(new Integer[]{5, 6, 9, 4, 2, 1, 10, 2});
        Cliente cliente4 = new Cliente(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});

        List<Cliente> colaClientes = new ArrayList<>();
        colaClientes.add(cliente1);
        colaClientes.add(cliente2);
        colaClientes.add(cliente3);
        colaClientes.add(cliente4);


        ExecutorService executor = Executors.newFixedThreadPool(3); //le pasas el numero de threads
        for (Cliente cliente : colaClientes) {
            Runnable cajera = new CajeraRunnable(cliente);
            executor.execute(cajera);
        }
    }
}
