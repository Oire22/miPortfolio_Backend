
package com.argentinaPrograma.miPortfolio.repository;

import com.argentinaPrograma.miPortfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
