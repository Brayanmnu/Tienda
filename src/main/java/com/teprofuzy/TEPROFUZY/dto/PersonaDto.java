package com.teprofuzy.TEPROFUZY.dto;

import java.sql.Date;

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
	private String dni;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	

}
