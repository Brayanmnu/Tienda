package com.teprofuzy.TEPROFUZY.dto;

import java.sql.Date;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonaDto {

	private Long id;
	private String dniRuc;
	private String nombresRazonSocial;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private GeneroDto genero;
	private TipoPersonaDto tipoPersona;
	private List<TelefonoDto> telefono;
	private List<DireccionDto> direccion;
	private List<EmailDto> email;
	private List<UsuarioDto> usuario;

}
