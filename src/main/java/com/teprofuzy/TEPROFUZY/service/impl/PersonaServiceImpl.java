package com.teprofuzy.TEPROFUZY.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teprofuzy.TEPROFUZY.dto.PersonaDto;
import com.teprofuzy.TEPROFUZY.entities.Persona;
import com.teprofuzy.TEPROFUZY.mappers.EntitiesDtosMappers;
import com.teprofuzy.TEPROFUZY.repositories.PersonaRepository;
import com.teprofuzy.TEPROFUZY.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
	private EntitiesDtosMappers personaMapper;
	
	@Override
	public List<PersonaDto> mostrarPersonas() {
		return personaMapper.listPersonaToPersonaDto(personaRepository.findAll()); 
	}

	@Override
	public String registrarPersonas(PersonaDto personaDto) {
		Persona persona = personaMapper.personaDtoToPersona(personaDto);
		personaRepository.saveAndFlush(persona);
		return "regitrado";
	}

}
