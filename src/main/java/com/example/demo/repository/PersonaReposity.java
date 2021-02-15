package com.example.demo.repository;

import com.example.demo.entity.Persona;
import com.example.demo.entity.TasaDeIntereses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaReposity extends JpaRepository<Persona, Long> {
    //List<Persona> findById(Long id);
    Persona findByNombre(String nombre);
}
