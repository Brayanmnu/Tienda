package com.teprofuzy.TEPROFUZY.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "TipoPago")
public class TipoPago {


	@Id
	@Column(name="idTipoPago")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idTipoPago;
	
	@Column
	private String descripcion;
}
