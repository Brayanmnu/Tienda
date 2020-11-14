package com.teprofuzy.TEPROFUZY.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoDto {
	private Long id;
	private String codigoProducto;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private EstadoDto estado;
	private BigDecimal stock;
	private TipoProductoDto tipoProducto;
	private List<HistorialProductoTiendaDto> historialProductoTienda;
}
