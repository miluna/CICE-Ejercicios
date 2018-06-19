package com.cice.apirest.service;

import java.util.List;

public interface IGestionUsuarios {

    List<String> listaNombre();

    boolean crearUsuario(String nombre);

    boolean actualizarUsuario(String nombre);

    String eliminarUsuario(String nombre);
}
