package com.teprofuzy.TEPROFUZY.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "ProveedorProducto")
public class ProveedorProducto {

	@Id
	@Column(name="idProveedorProducto")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idProveedorProducto;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idProveedor")
	private Proveedor proveedor;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idProducto")
	private Producto producto;
	
	@Column
	private BigDecimal precio;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedorProducto")
	private List<HistorialProveedorProducto> historialProveedorProducto;
	
}
