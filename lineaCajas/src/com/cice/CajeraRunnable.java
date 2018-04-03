package com.cice;


public class CajeraRunnable implements Runnable {
    private Cliente cliente;

    public CajeraRunnable(Cliente cliente) {
        this.cliente = cliente;
    }


    public void atenderCliente(Cliente cliente){
        for (int producto: cliente.getProductos()) {
            try {
                System.out.println(Thread.currentThread().getName() + " esta procesando un producto...");
                Thread.sleep(producto * 1000);
                System.out.println(Thread.currentThread().getName() + " ha terminado con un producto");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        atenderCliente(cliente);
    }
}
