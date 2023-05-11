
package com.argentinaPrograma.miPortfolio.controller;

import com.argentinaPrograma.miPortfolio.model.Experiencia;
import com.argentinaPrograma.miPortfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    @Autowired
    private IExperienciaService interExperiencia;
    
    @CrossOrigin
    @GetMapping("/experiencia/traer")
    public List <Experiencia> getExperiencia(){
        return interExperiencia.getExperiencia();
    }
    
    @CrossOrigin
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia exp){
        interExperiencia.saveExperiencia(exp);
        return "La experiencia fue creada correctamente";
    }
}
