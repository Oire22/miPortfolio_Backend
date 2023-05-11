
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Persona;
import java.util.List;



public interface IPersonaService {
    public List <Persona> getPersonas();
    
    public void savePersona(Persona perso);
}
