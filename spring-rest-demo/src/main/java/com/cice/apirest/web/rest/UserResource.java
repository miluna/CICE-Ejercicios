package com.cice.apirest.web.rest;

import com.cice.apirest.service.IGestionUsuarios;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.List;

@Api
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
    public void crearUsuario(@PathParam(value = "nombre") String nombre,
                             @PathParam(value = "surname") String surname) {
        gestionUsuarios.crearUsuario(nombre, surname);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void actualizarUsuario(@PathParam(value = "nombre") String nombre){
        gestionUsuarios.actualizarUsuario(nombre);
    }
}
