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
public class PedidoDto {

	private Long id;
	
	private String codigo;

	private ClienteDto cliente;
	
	private ProductoDto producto;
	
	private BigDecimal cantidad;
	
	private Date fecha;
	
	private EmpleadoDto empleado;
	
	private BigDecimal precioUnitario;
	
	private BigDecimal descuento;

	private BigDecimal precioUnitarioFinal;
}
