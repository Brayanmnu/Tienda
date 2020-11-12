package com.teprofuzy.TEPROFUZY.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDto {
	private Long idUsuarioDto;
	private String user;
	private String password;
	private PersonaDto persona;
	private TipoUsuarioDto tipoUsuario;
}
