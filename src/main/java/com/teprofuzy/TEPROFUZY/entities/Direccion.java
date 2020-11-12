package com.teprofuzy.TEPROFUZY.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Direccion")
public class Direccion {
	@Id
	@Column(name="idDireccion")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idDireccion;
	
	@Column
	private String descripcion;
	
	@ManyToOne
    @JoinColumn(name = "idPersona", nullable = false, updatable = false)
    private Persona persona;

}
