package com.teprofuzy.TEPROFUZY.entities;

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
@Table(name = "Empleado")
public class Empleado {


	@Id
	@Column(name="idEmpleado")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idEmpleado;

	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idPersona")
	private Persona persona;
	
	@Column
	private Date fechaInicioTrabajo;

	@Column
	private Date fechaFinTrabajo;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idEstado")
	private Estado estado;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idCategoriaEmpleado")
	private CategoriaEmpleado categoriaEmpleado;
	
}
