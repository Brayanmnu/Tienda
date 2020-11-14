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
@Table(name = "HistorialProveedorProducto")
public class HistorialProveedorProducto {
	@Id
	@Column(name="idHistorialProveedorProducto")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idHistorialProveedorProducto;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idProveedorProducto")
	private ProveedorProducto proveedorProducto;
	
	@Column
	private BigDecimal precio;
	
	@Column
	private Date fecha;
}
