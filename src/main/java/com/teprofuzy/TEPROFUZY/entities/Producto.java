package com.teprofuzy.TEPROFUZY.entities;

import java.math.BigDecimal;
import java.util.List;
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
@Table(name = "Producto")
public class Producto {

	@Id
	@Column(name="idProducto")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idProducto;
	
	@Column
	private String codigoProducto;

	@Column
	private String nombre;

	@Column
	private String descripcion;
	
	@Column
	private BigDecimal precio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEstado")
	private Estado estado;
	
	@Column
	private BigDecimal stock;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipoProducto")
	private TipoProducto tipoProducto;

	@OneToMany(mappedBy = "producto")
	private List<HistorialProductoTienda> historialProductoTienda;

}
