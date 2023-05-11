
package com.argentinaPrograma.miPortfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String institucion;
    private String descripcion;
    private String periodo; //ejemplo: 2020-2023 2022-en curso
}