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
public class HistorialProveedorProductoDto {
	
	private Long id;
	
	private ProveedorProductoDto proveedorProducto;
	
	private BigDecimal precio;
	
	private Date fecha;

}
