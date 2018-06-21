package com.cice.apirest.service;

import com.cice.apirest.entity.Usuario;
import com.cice.apirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("Gestion")
public class GestionUsuarioService implements IGestionUsuarios {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<String> listaNombre() {
        return usuarioRepository.findAll()
                .stream()
                .map(Usuario::getName)
                .collect(Collectors.toList());
    }

    @Override
    public boolean crearUsuario(String nombre, String surname) {
        Usuario usuario = new Usuario(null, nombre, surname);
        usuarioRepository.save(usuario);
        return true;
    }

    @Override
    public boolean actualizarUsuario(String nombre) {
        return false;
    }

    @Override
    public String eliminarUsuario(String nombre) {
        return null;
    }
}
