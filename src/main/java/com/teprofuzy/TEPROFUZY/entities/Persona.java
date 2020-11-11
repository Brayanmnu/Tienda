package com.teprofuzy.TEPROFUZY.entities;

import java.sql.Date;
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
@Table(name = "Persona")
public class Persona {

	@Id
	@Column(name="idPersona")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idPersona;
	
	@Column
	private String dni;
	
	@Column
	private String nombres;
	
	@Column
	private String apellidoPaterno;
	
	@Column
	private String apellidoMaterno;
	
	@Column
	private Date fechaNacimiento;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="idGenero")
	private Genero genero;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
	private List<Telefono> telefono;
	
}
