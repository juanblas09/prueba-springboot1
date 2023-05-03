/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.juantschopp.portfolio.service;

import ar.com.juantschopp.portfolio.models.Persona;
import ar.com.juantschopp.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juan-
 */
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        personaRepository.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }
    
}
