package com.teprofuzy.TEPROFUZY.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.teprofuzy.TEPROFUZY.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

	@Query("from Persona p where p.dni = :dni")
	public Optional<Persona> findByDni(@Param("dni") String dni);
}
