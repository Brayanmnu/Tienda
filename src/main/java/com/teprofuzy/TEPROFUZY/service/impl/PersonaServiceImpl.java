package com.teprofuzy.TEPROFUZY.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teprofuzy.TEPROFUZY.dto.PersonaDto;
import com.teprofuzy.TEPROFUZY.entities.Persona;
import com.teprofuzy.TEPROFUZY.mappers.PersonaMapper;
import com.teprofuzy.TEPROFUZY.repositories.PersonaRepository;
import com.teprofuzy.TEPROFUZY.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
	private PersonaMapper personaMapper;
	
	@Override
	public List<PersonaDto> mostrarPersonas() {
		List<Persona> personas = personaRepository.findAll();
		List<PersonaDto> personasDto = new ArrayList<>();
		for(Persona p:personas) {
			PersonaDto personaDto =  new PersonaDto();
			personaDto= personaMapper.PersonaToPersonaDto(p,personaDto);
			personasDto.add(personaDto);
		}
		return personasDto;  
	}

	@Override
	public String registrarPersonas(PersonaDto personaDto) {
		Persona persona = personaMapper.PersonaDtoToPersona(personaDto);
		personaRepository.saveAndFlush(persona);
		return "regitrado";
	}

}
