package com.teprofuzy.TEPROFUZY.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teprofuzy.TEPROFUZY.dto.PersonaDto;
import com.teprofuzy.TEPROFUZY.services.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@RequestMapping("/obtenerPersonas")
	public List<PersonaDto> obtenerPersonas() {
		return personaService.mostrarPersonas();
	}
	
	
	@PostMapping(path = "/registrarPersonas", consumes = "application/json", produces = "application/json")
	public String registrarPersonas(@RequestBody PersonaDto persona) {
		return personaService.registrarPersonas(persona);
	}
	
}
