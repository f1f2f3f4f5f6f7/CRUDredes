package com.crud.ppersona.service;

import com.crud.ppersona.model.Persona;
import com.crud.ppersona.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;
    public void crearYactualizarPersona(Persona persona){
        personaRepository.save(persona);
    }
    public List<Persona> verPersona(){
        List<Persona> personas = new ArrayList<Persona>();
        personas.addAll(personaRepository.findAll());
        return personas;
    }
    public void eliminarPersona(Long id){
        personaRepository.deleteById(id);
    }
}
