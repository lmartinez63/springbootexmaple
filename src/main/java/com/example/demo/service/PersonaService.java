package com.example.demo.service;

import com.example.demo.entity.Persona;

import java.util.List;

public interface PersonaService {
    public Persona getPersonaById(Long id);
    public Persona getPersonaByNombre(String nombre);
    public List<Persona> getPersonas();
    public Persona savePersona(Persona persona);
    public void deletePersona(Persona persona);
}
