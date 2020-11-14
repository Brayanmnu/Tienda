package com.teprofuzy.TEPROFUZY.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDto {
	private Long id;
	private String codigoCliente;
	private PersonaDto persona;
	private EstadoDto estado;
}
