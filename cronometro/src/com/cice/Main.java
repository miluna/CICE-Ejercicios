package com.cice;

public class Main {

    public static void main(String[] args) {
        CronoForm gui = new CronoForm();
        Crono crono = new Crono(gui);

        gui.setCrono(crono);
    }
}
