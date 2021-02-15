package com.example.demo.service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaReposity personaReposity;

    public Persona getPersonaById(Long id){
        Persona persona = personaReposity.findById(id).get();
        return persona;
    }

    public Persona getPersonaByNombre(String nombre){
        Persona persona = personaReposity.findByNombre(nombre);
        return persona;
    }

    public List<Persona> getPersonas(){
        List<Persona> listaDePersonas = personaReposity.findAll();
        return listaDePersonas;
    }

    public Persona savePersona(Persona persona){
        Persona newPersona = personaReposity.save(persona);
        return newPersona;
    }

    public void deletePersona(Persona persona){
        personaReposity.delete(persona);
    }
}
