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
@Table(name = "TipoUsuario")
public class TipoUsuario {

	@Id
	@Column(name="idTipoUsuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idTipoUsuario;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
}
