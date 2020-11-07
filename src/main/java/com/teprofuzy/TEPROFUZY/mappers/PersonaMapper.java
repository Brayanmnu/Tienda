package com.teprofuzy.TEPROFUZY.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import com.teprofuzy.TEPROFUZY.dto.PersonaDto;
import com.teprofuzy.TEPROFUZY.entities.Persona;

@Mapper(componentModel ="spring", nullValuePropertyMappingStrategy=NullValuePropertyMappingStrategy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PersonaMapper {

	PersonaMapper INSTANCE = Mappers.getMapper( PersonaMapper.class );
	
	@Mappings({
		@Mapping(target="id",source="persona.id"),
		@Mapping(target="dni",source="persona.dni"),
		@Mapping(target="nombres",source="persona.nombres"),
		@Mapping(target="apellidoPaterno",source="persona.apellidoPaterno"),
		@Mapping(target="apellidoMaterno",source="persona.apellidoMaterno"),
		@Mapping(target="fechaNacimiento",source="persona.fechaNacimiento")
	})
	PersonaDto PersonaToPersonaDto(Persona persona,PersonaDto personaDto);
	
	Persona PersonaDtoToPersona(PersonaDto personaDto);
	
	List<Persona> listPersonaDtoToPersona (List<PersonaDto> personaList);
	
	List<PersonaDto> listPersonaToPersonaDto (List<Persona> personaDtoList);
	
}
