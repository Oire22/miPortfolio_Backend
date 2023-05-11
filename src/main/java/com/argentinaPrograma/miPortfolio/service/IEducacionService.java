
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List <Educacion> getEducacion();
    
    public void saveEducacion(Educacion edu);
}
