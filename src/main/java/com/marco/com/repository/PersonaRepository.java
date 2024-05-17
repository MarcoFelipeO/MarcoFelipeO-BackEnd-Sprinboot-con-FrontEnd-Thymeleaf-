package com.marco.com.repository;

import com.marco.com.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //esteriotipo
public interface PersonaRepository extends JpaRepository<Persona , Long> {




}
