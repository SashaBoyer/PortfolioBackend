package com.PrimerApp.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String establecimiento;
    private String titulo;
    private Date fechaDesde;
    private Date fechaHasta;
    private String imagen;
    
    public Educacion(){
    }
    
    public Educacion(Long id, String establecimiento, String titulo, Date fechaDesde, Date fechaHasta, String imagen){
        this.id = id;
        this.establecimiento = establecimiento;
        this.titulo = titulo;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.imagen = imagen;
    }
    
    
}
