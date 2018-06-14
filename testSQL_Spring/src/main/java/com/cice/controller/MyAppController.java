package com.cice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cice.DAO.EntrenadorDAO;
import com.cice.models.Entrenador;


@RestController
@RequestMapping("/")
public class MyAppController {
	
	@Autowired
	private EntrenadorDAO entrenadorDAO;
	
	@RequestMapping("/entrenadores")
	public ResponseEntity<List<Entrenador>> getEntrenadores() {
		
		List<Entrenador> entrenadores = new ArrayList<>();
		try {
			entrenadores = entrenadorDAO.findAll();
		} catch (Exception e) {
			return new ResponseEntity<List<Entrenador>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Entrenador>>(entrenadores, HttpStatus.OK);
	}

}
