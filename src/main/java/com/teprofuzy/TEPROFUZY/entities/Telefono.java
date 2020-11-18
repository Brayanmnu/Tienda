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
@Table(name = "Telefono")
public class Telefono {

	@Id
	@Column(name="idTelefono")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idTelefono;
	
	@Column
	private String numero;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idPersona")
    private Persona persona;
}
