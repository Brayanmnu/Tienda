package com.teprofuzy.TEPROFUZY.dto;

import java.math.BigDecimal;
import java.util.List;

import com.teprofuzy.TEPROFUZY.entities.Proveedor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProveedorProductoDto {

	private Long id;
	
	
	private Proveedor proveedor;
	
	
	private ProductoDto producto;
	
	
	private BigDecimal precio;
	
	private List<HistorialProveedorProductoDto> historialProveedorProducto;
}
