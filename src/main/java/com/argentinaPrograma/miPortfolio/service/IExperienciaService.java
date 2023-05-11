
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List <Experiencia> getExperiencia();
    
    public void saveExperiencia(Experiencia exp);
}
