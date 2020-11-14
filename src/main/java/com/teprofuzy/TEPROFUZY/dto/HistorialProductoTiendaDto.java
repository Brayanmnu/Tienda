package com.teprofuzy.TEPROFUZY.dto;

import java.math.BigDecimal;
import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistorialProductoTiendaDto {
	private Long id;

    private ProductoDto producto;
    
	private Date fecha;
	
	private BigDecimal precio;
}
