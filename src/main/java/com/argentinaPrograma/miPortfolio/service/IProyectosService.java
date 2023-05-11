
package com.argentinaPrograma.miPortfolio.service;

import com.argentinaPrograma.miPortfolio.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    public List <Proyectos> getProyectos();
    
    public void saveProyectos(Proyectos pro);
}
