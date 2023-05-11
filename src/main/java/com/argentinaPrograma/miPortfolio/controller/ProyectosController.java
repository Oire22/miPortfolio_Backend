
package com.argentinaPrograma.miPortfolio.controller;

import com.argentinaPrograma.miPortfolio.model.Proyectos;
import com.argentinaPrograma.miPortfolio.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
    @Autowired
    private IProyectosService interProyectos;
    
    @CrossOrigin
    @GetMapping("/Proyectos/traer")
    public List <Proyectos> getProyectos(){
        return interProyectos.getProyectos();
    }
    
    @CrossOrigin
    @PostMapping("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos pro){
        interProyectos.saveProyectos(pro);
        return "El proyecto fue creada correctamente";
    }
}
