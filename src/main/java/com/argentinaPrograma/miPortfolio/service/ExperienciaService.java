
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Experiencia;
import com.argentinaPrograma.miPortfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    private ExperienciaRepository expRepository;
    
    @Override
    public List <Experiencia> getExperiencia(){
        List<Experiencia> listaExperiencia = expRepository.findAll();
        return listaExperiencia;
    }
    
    @Override
    public void saveExperiencia(Experiencia exp){
        expRepository.save(exp);
    }
}
