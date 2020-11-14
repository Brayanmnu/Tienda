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
public class EmpleadoDto {
	
	private Long id;
	private PersonaDto persona;
	private Date fechaInicioTrabajo;
	private Date fechaFinTrabajo;
	private EstadoDto estado;
	private CategoriaEmpleadoDto categoriaEmpleado;

}
