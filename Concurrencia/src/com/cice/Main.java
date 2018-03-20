package com.cice;

import com.cice.hilos.Hilo;
import com.cice.hilos.HiloDos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread hilo = new Hilo();
        hilo.setName("PeterThread");


        Thread hilo2 = new HiloDos();
        hilo2.setName("PacoThread");


        Thread hilo3 = new Thread(() -> {
            for (int i = 0; i < 50; i++){
                System.out.println(i + " " + Thread.currentThread().getName() + " running!!");
            }
        });
        hilo3.setName("PepitoThread");
        hilo.start();
        hilo2.start();
        hilo3.start();

    }
}
