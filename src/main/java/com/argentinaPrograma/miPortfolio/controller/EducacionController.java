
package com.argentinaPrograma.miPortfolio.controller;

import com.argentinaPrograma.miPortfolio.model.Educacion;
import com.argentinaPrograma.miPortfolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService interEducacion;
    
    @CrossOrigin
    @GetMapping("/educacion/traer")
    public List <Educacion> getEducacion(){
        return interEducacion.getEducacion();
    }
    
    @CrossOrigin
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion edu){
        interEducacion.saveEducacion(edu);
        return "La educación fue creada correctamente";
    }
}
