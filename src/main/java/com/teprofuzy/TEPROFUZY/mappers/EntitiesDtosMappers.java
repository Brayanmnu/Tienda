package com.teprofuzy.TEPROFUZY.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import com.teprofuzy.TEPROFUZY.dto.DireccionDto;
import com.teprofuzy.TEPROFUZY.dto.EmailDto;
import com.teprofuzy.TEPROFUZY.dto.EstadoDto;
import com.teprofuzy.TEPROFUZY.dto.GeneroDto;
import com.teprofuzy.TEPROFUZY.dto.PersonaDto;
import com.teprofuzy.TEPROFUZY.dto.TelefonoDto;
import com.teprofuzy.TEPROFUZY.dto.TipoPersonaDto;
import com.teprofuzy.TEPROFUZY.dto.TipoUsuarioDto;
import com.teprofuzy.TEPROFUZY.dto.UsuarioDto;
import com.teprofuzy.TEPROFUZY.entities.Direccion;
import com.teprofuzy.TEPROFUZY.entities.Email;
import com.teprofuzy.TEPROFUZY.entities.Estado;
import com.teprofuzy.TEPROFUZY.entities.Genero;
import com.teprofuzy.TEPROFUZY.entities.Persona;
import com.teprofuzy.TEPROFUZY.entities.Telefono;
import com.teprofuzy.TEPROFUZY.entities.TipoPersona;
import com.teprofuzy.TEPROFUZY.entities.TipoUsuario;
import com.teprofuzy.TEPROFUZY.entities.Usuario;

@Mapper(componentModel ="spring", nullValuePropertyMappingStrategy=NullValuePropertyMappingStrategy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface EntitiesDtosMappers {

	EntitiesDtosMappers INSTANCE = Mappers.getMapper( EntitiesDtosMappers.class );
	
	//PERSONA
	@Mappings({
		@Mapping(target="id",source="persona.idPersona"),
		@Mapping(target="dniRuc",source="persona.dniRuc"),
		@Mapping(target="nombresRazonSocial",source="persona.nombresRazonSocial"),
		@Mapping(target="apellidoPaterno",source="persona.apellidoPaterno"),
		@Mapping(target="apellidoMaterno",source="persona.apellidoMaterno"),
		@Mapping(target="fechaNacimiento",source="persona.fechaNacimiento"),
		@Mapping(target="genero",source="persona.genero"),
		@Mapping(target="telefono",source="persona.telefono"),
		@Mapping(target="tipoPersona",source="persona.tipoPersona"),
		@Mapping(target="email",source="persona.email"),
		@Mapping(target="direccion",source="persona.direccion"),
		@Mapping(target="usuario",source="persona.usuario")
	})
	PersonaDto personaToPersonaDto(Persona persona);
	
	@Mappings({
		@Mapping(target="idPersona",source="personaDto.id"),
		@Mapping(target="dniRuc",source="personaDto.dniRuc"),
		@Mapping(target="nombresRazonSocial",source="personaDto.nombresRazonSocial"),
		@Mapping(target="apellidoPaterno",source="personaDto.apellidoPaterno"),
		@Mapping(target="apellidoMaterno",source="personaDto.apellidoMaterno"),
		@Mapping(target="fechaNacimiento",source="personaDto.fechaNacimiento"),
		@Mapping(target="genero",source="personaDto.genero"),
		@Mapping(target="telefono",source="personaDto.telefono"),
		@Mapping(target="tipoPersona",source="personaDto.tipoPersona"),
		@Mapping(target="email",source="personaDto.email"),
		@Mapping(target="direccion",source="personaDto.direccion"),
		@Mapping(target="usuario",source="personaDto.usuario")
	})
	Persona personaDtoToPersona(PersonaDto personaDto);
	
	List<Persona> listPersonaDtoToPersona (List<PersonaDto> personadDtoList);
	
	List<PersonaDto> listPersonaToPersonaDto (List<Persona> personaList);
	
	//GENERO
	@Mappings({
		@Mapping(target="id",source="genero.idGenero"),
		@Mapping(target="nombre",source="genero.nombre")
	})
	GeneroDto generoToGeneroDto(Genero genero);
	
	@Mappings({
		@Mapping(target="idGenero",source="generoDto.id"),
		@Mapping(target="nombre",source="generoDto.nombre")
	})
	Genero generoDtoToGenero(GeneroDto generoDto);
	
	List<Genero> listGeneroDtoToGenero (List<GeneroDto> generoDtoList);
	
	List<GeneroDto> listGeneroToGeneroDto (List<Genero> generoList);
	
	//TIPO_PERSONA
	@Mappings({
		@Mapping(target="id",source="tipoPersona.idTipoPersona"),
		@Mapping(target="nombre",source="tipoPersona.nombre")
	})
	TipoPersonaDto tipoPersonaToTipoPersonaDto(TipoPersona tipoPersona);
	
	@Mappings({
		@Mapping(target="idTipoPersona",source="tipoPersonaDto.id"),
		@Mapping(target="nombre",source="tipoPersonaDto.nombre")
	})
	TipoPersona tipoPersonaDtoToTipoPersona(TipoPersonaDto tipoPersonaDto);
	
	List<TipoPersona> listTipoPersonaDtoToTipoPersona (List<TipoPersonaDto> tipoPersonaDtoList);
	
	List<TipoPersonaDto> listTipoPersonaToTipoPersonaDto (List<TipoPersona> tipoPersonaList);
	
	//TELEFONO
	@Mappings({
		@Mapping(target="idTelefono",source="telefono.idTelefono"),
		@Mapping(target="numero",source="telefono.numero"),
		@Mapping(target="persona",source="telefono.persona")
	})
	TelefonoDto telefonoToTelefonoDto(Telefono telefono);
	
	@Mappings({
		@Mapping(target="idTelefono",source="telefonoDto.idTelefono"),
		@Mapping(target="numero",source="telefonoDto.numero"),
		@Mapping(target="persona",source="telefonoDto.persona")
	})
	Telefono telefonoDtoToTelefono(TelefonoDto telefonoDto);
	
	List<Telefono> listTelefonoDtoToTelefono (List<TelefonoDto> telefonoDtoList);
	
	List<TelefonoDto> listTelefonoToTelefonoDto (List<Telefono> telefonoList);
	
	//EMAIL
	@Mappings({
		@Mapping(target="idEmail",source="email.idEmail"),
		@Mapping(target="correo",source="email.correo"),
		@Mapping(target="persona",source="email.persona")
	})
	EmailDto emailToEmailDto(Email email);
	
	@Mappings({
		@Mapping(target="idEmail",source="emailDto.idEmail"),
		@Mapping(target="correo",source="emailDto.correo"),
		@Mapping(target="persona",source="emailDto.persona")
	})
	Email emailDtoToEmail(EmailDto emailDto);
	
	List<Email> listEmailDtoToEmail (List<EmailDto> emailDtoList);
	
	List<EmailDto> listEmailToEmailDto (List<Email> emailList);
	
	//DIRECCION
	@Mappings({
		@Mapping(target="idDireccion",source="direccion.idDireccion"),
		@Mapping(target="descripcion",source="direccion.descripcion"),
		@Mapping(target="persona",source="direccion.persona")
	})
	DireccionDto direccionToDireccionDto(Direccion direccion);
	
	@Mappings({
		@Mapping(target="idDireccion",source="direccionDto.idDireccion"),
		@Mapping(target="descripcion",source="direccionDto.descripcion"),
		@Mapping(target="persona",source="direccionDto.persona")
	})
	Direccion direccionDtoToDireccion(DireccionDto direccionDto);
	
	List<Direccion> listDireccionDtoToDireccion (List<DireccionDto> direccionDtoList);
	
	List<DireccionDto> listDireccionToDireccionDto (List<Direccion> direccionList);
	
	//USARIO
	@Mappings({
		@Mapping(target="idUsuarioDto",source="usuario.idUsuario"),
		@Mapping(target="user",source="usuario.user"),
		@Mapping(target="password",source="usuario.password"),
		@Mapping(target="persona",source="usuario.persona"),
		@Mapping(target="tipoUsuario",source="usuario.tipoUsuario")
	})
	UsuarioDto usuarioToUsuarioDto(Usuario usuario);
	
	@Mappings({
		@Mapping(target="idUsuario",source="usuarioDto.idUsuarioDto"),
		@Mapping(target="user",source="usuarioDto.user"),
		@Mapping(target="password",source="usuarioDto.password"),
		@Mapping(target="persona",source="usuarioDto.persona"),
		@Mapping(target="tipoUsuario",source="usuarioDto.tipoUsuario")
	})
	Usuario direccionDtoToDireccion(UsuarioDto usuarioDto);
	
	List<Usuario> listUsuarioDtoToUsuario (List<UsuarioDto> usuarioDtoList);
	
	List<UsuarioDto> listUsuarioToUsuarioDto (List<Usuario> usuarioList);
	
	//TIPO_USUARIO
	@Mappings({
		@Mapping(target="id",source="tipoUsuario.idTipoUsuario"),
		@Mapping(target="nombre",source="tipoUsuario.nombre"),
		@Mapping(target="descripcion",source="tipoUsuario.descripcion")
	})
	TipoUsuarioDto tipoUsuarioToTipoUsuarioDto(TipoUsuario tipoUsuario);
	
	@Mappings({
		@Mapping(target="idTipoUsuario",source="tipoUsuarioDto.id"),
		@Mapping(target="nombre",source="tipoUsuarioDto.nombre"),
		@Mapping(target="descripcion",source="tipoUsuarioDto.descripcion")
	})
	TipoUsuario tipoUsuarioStoToTipoUsuario(TipoUsuarioDto tipoUsuarioDto);
	
	List<TipoUsuario> listTipoUsuarioDtoTipoUsuario (List<TipoUsuarioDto> tipoUsuarioDtoList);
	
	List<TipoUsuarioDto> listTipoUsuarioToTipoUsuarioDto (List<TipoUsuario> tipoUsuarioList);
	
	//ESTADO
	@Mappings({
		@Mapping(target="id",source="estado.idEstado"),
		@Mapping(target="nombre",source="estado.nombre")
	})
	EstadoDto estadoToEstadoDto(Estado estado);
	
	@Mappings({
		@Mapping(target="idEstado",source="estadoDto.id"),
		@Mapping(target="nombre",source="estadoDto.nombre")
	})
	Estado estadoDtoToEstado(EstadoDto estadoDto);
	
	List<Estado> listEstadoDtoToEstado (List<EstadoDto> estadoDtoList);
	
	List<EstadoDto> listEstadoToEstadoDto (List<Estado> estadoList);
	
}
