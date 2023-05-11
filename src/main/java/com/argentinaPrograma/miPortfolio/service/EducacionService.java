
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Educacion;
import com.argentinaPrograma.miPortfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
     @Autowired
    private EducacionRepository eduRepository;
    
    @Override
    public List <Educacion> getEducacion(){
        List<Educacion> listaEducacion = eduRepository.findAll();
        return listaEducacion;
    }
    
    @Override
    public void saveEducacion(Educacion edu){
        eduRepository.save(edu);
    }
}
