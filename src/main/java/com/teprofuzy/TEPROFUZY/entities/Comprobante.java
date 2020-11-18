package com.teprofuzy.TEPROFUZY.entities;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder
@Table(name = "Comprobante")
public class Comprobante {

	@Id
	@Column(name="idComprobante")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idComprobante;
	
	@Column
	private String codigo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipoPago")
	private TipoPago tipoPago;
	
	@Column
	private BigDecimal precioSubTotal;

	@Column
	private BigDecimal igv;

	@Column
	private BigDecimal descuento;
	
	@Column
	private BigDecimal precioTotal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEstadoComprobante")
	private EstadoComprobante estadoComprobante;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipoComprobante")
	private TipoComprobante tipoComprobante;
	
	@Column
	private Long proceso;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPedido")
	private Pedido pedido;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idProveedorProducto")
	private ProveedorProducto proveedorProducto;
}
