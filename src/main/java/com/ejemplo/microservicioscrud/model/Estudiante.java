package com.ejemplo.microservicioscrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRUEBAESTUDIANTE")
public class Estudiante {
    
    @Id
    @Column(name = "Eid")
    private Long id;
    
    @Column(name = "Nombre", length = 50)
    private String nombre;
    
    @Column(name = "Especialidad", length = 50)
    private String especialidad;
    
    @Column(name = "Grado", length = 5)
    private String grado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    
}
