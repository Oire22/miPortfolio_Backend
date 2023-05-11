
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Proyectos;
import com.argentinaPrograma.miPortfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    @Autowired
    private ProyectosRepository proRepository;
    
    @Override
    public List <Proyectos> getProyectos(){
        List<Proyectos> listaProyectos = proRepository.findAll();
        return listaProyectos;
    }
    
    @Override
    public void saveProyectos(Proyectos pro){
        proRepository.save(pro);
    }
}
