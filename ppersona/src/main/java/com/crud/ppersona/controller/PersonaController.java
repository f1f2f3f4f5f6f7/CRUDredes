package com.crud.ppersona.controller;

import com.crud.ppersona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.crud.ppersona.model.Persona;
import java.util.List;

@RestController
public class PersonaController{
    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    private List<Persona> verPersona(){
        return personaService.verPersona();
    }
    @PostMapping("/persona")
    private void crearYactualizarPersona(@RequestBody Persona persona){
        personaService.crearYactualizarPersona(persona);

    }
    @DeleteMapping("/persona/{id}")
    private void eliminarPersona(@PathVariable("id") Long id){
        personaService.eliminarPersona(id);

    }
    @PutMapping("/persona")
    private void editarPersona(@RequestBody Persona persona){
        personaService.crearYactualizarPersona(persona);
    }
}
