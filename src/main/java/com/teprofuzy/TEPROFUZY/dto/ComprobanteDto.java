package com.teprofuzy.TEPROFUZY.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComprobanteDto {
	
	private Long id;
	
	private String codigo;
	
	private TipoPagoDto tipoPago;
	
	private BigDecimal precioSubTotal;

	private BigDecimal igv;

	private BigDecimal descuento;
	
	private BigDecimal precioTotal;
	
	private EstadoComprobanteDto estadoComprobante;
	
	private TipoComprobanteDto tipoComprobante;
	
	private Long proceso;
	
	private PedidoDto pedido;
	
	private ProveedorProductoDto proveedorProducto;

}
