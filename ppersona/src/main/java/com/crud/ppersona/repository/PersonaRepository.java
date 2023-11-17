package com.crud.ppersona.repository;

import com.crud.ppersona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
