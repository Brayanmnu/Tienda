package com.teprofuzy.TEPROFUZY.services;

import java.util.List;

import com.teprofuzy.TEPROFUZY.dto.PersonaDto;

public interface PersonaService {

	public List<PersonaDto> mostrarPersonas();
	
	public String registrarPersonas(PersonaDto personaDto);
}
