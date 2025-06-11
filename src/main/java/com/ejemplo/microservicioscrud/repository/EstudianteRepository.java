package com.ejemplo.microservicioscrud.repository;

import com.ejemplo.microservicioscrud.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
