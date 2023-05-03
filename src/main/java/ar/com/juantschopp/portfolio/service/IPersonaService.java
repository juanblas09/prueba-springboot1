/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.juantschopp.portfolio.service;

import ar.com.juantschopp.portfolio.models.Persona;
import java.util.List;

/**
 *
 * @author juan-
 */
public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
