/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.juantschopp.portfolio.repository;

import ar.com.juantschopp.portfolio.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juan-
 */
@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
