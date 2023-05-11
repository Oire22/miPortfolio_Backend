
package com.argentinaPrograma.miPortfolio.controller;

import com.argentinaPrograma.miPortfolio.model.Persona;
import com.argentinaPrograma.miPortfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @CrossOrigin
    @GetMapping("/personas/traer")
    public List <Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @CrossOrigin
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
}
