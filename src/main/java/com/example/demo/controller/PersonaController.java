package com.example.demo.controller;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/obtenerPersona/{id}")
    public Persona obtenerPersona(@PathVariable Long id){
        return personaService.getPersonaById(id);
    }

    @RequestMapping(value="obtenerPersonaPorNombre", method = RequestMethod.GET)
    public Persona obtenerPersona(@RequestParam(value = "nombre") String nombre){
        return personaService.getPersonaByNombre(nombre);
    }

    @PostMapping(path = "/persona", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Persona> guardarPersona(@RequestBody Persona persona){
        Persona newPersona = personaService.savePersona(persona);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(newPersona);
    }

}
