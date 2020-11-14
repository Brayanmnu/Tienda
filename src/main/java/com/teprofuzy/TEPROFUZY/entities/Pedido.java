package com.teprofuzy.TEPROFUZY.entities;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
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
@Table(name = "Pedido")
public class Pedido {
	
	@Id
	@Column(name="idPedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idPedido;
	
	@Column
	private String codigo;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idProducto")
	private Producto producto;
	
	@Column
	private BigDecimal cantidad;
	
	@Column
	private Date fecha;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idEmpleado")
	private Empleado empleado;
	
	@Column
	private BigDecimal precioUnitario;
	
	@Column
	private BigDecimal descuento;

	@Column
	private BigDecimal precioUnitarioFinal;
}
