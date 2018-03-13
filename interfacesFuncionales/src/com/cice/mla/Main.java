package com.cice.mla;

import com.cice.mla.interfaces.InterfazFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        InterfazFuncional interfaz = new InterfazFuncionalimpl();

        List<String> nombres = new ArrayList<>();
        nombres.add("pepe");
        nombres.add("gustavo");
        nombres.add("juan");

        long count = nombres.stream().filter(s -> s.equalsIgnoreCase("pepe")).count();
        System.out.println(count);
    }
}
