package com.teprofuzy.TEPROFUZY.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoPersonaDto {
	private Long id;
	private String nombre;
}
