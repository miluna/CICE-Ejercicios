package com.cice.hilos;

public class Hilo extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50; i++){
            System.out.println(i + " " + this.currentThread().getName() + " running!!");
        }
    }
}
