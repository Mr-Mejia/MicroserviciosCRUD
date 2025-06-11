package com.ejemplo.microservicioscrud.service;

import com.ejemplo.microservicioscrud.model.Estudiante;
import com.ejemplo.microservicioscrud.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public Estudiante crearEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public Optional<Estudiante> actualizarEstudiante(Long id, Estudiante estudianteActualizado) {
        return repository.findById(id)
                .map(estudiante -> {
                    estudiante.setNombre(estudianteActualizado.getNombre());
                    estudiante.setEspecialidad(estudianteActualizado.getEspecialidad());
                    estudiante.setGrado(estudianteActualizado.getGrado());
                    return repository.save(estudiante);
                });
    }

    public List<Estudiante> obtenerTodosEstudiantes() {
        return repository.findAll();
    }

    public Optional<Estudiante> obtenerEstudiantePorId(Long id) {
        return repository.findById(id);
    }

    public void eliminarEstudiante(Long id) {
        repository.deleteById(id);
    }
}
