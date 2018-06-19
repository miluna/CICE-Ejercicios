package com.cice.apirest.web.rest;

import com.cice.apirest.service.IGestionUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController("/usuario")
public class UserResource {

    @Autowired
    @Qualifier("Gestion")
    IGestionUsuarios gestionUsuarios;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<String>> getUsuarios(){
        return new ResponseEntity<>(gestionUsuarios.listaNombre(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String crearUsuario(@PathParam(value = "nombre") String nombre) {
        return "Hola " + nombre;
    }
}
