package com.teprofuzy.TEPROFUZY.entities;

import java.math.BigDecimal;
import java.sql.Date;

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
@Table(name = "HistorialProductoTienda")
public class HistorialProductoTienda {
	@Id
	@Column(name="idHistorialProductoTienda")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idHistorialProductoTienda;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idProducto")
    private Producto producto;

	@Column
	private Date fecha;
	
	@Column
	private BigDecimal precio;
}
