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
@Table(name = "Genero")
public class Genero {

	@Id
	@Column(name="idGenero")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long idGenero;
	
	@Column
	private String nombre;
}
