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
@Table(name = "EstadoComprobante")
public class EstadoComprobante {


	@Id
	@Column(name="idEstadoComprobante")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idEstadoComprobante;
	
	@Column
	private String descripcion;
}
