package com.teprofuzy.TEPROFUZY.entities;

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
@Table(name = "Usuario")
public class Usuario {

	@Id
	@Column(name="idUsuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idUsuario;
	
	@Column
	private String user;
	
	@Column
	private String password;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idPersona")
    private Persona persona;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipoUsuario")
	private TipoUsuario tipoUsuario;
}
