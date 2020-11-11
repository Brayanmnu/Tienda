package com.teprofuzy.TEPROFUZY.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefonoDto {
	private Long idTelefono;
	private String numero;
	private PersonaDto persona;
}
