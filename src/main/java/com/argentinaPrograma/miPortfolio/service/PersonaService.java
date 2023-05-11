
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Persona;
import com.argentinaPrograma.miPortfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository persoRepository;
    
    @Override
    public List <Persona> getPersonas(){
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Persona perso){
        persoRepository.save(perso);
    }
}
