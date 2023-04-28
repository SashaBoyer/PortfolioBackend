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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String empresa;
    private String puesto;
    private Date fechaDesde;
    private Date fechaHasta;
    private String descripcion;
    
    public Experiencia(){
    }
    
    public Experiencia(String empresa, String puesto, Date fechaDesde, Date fechaHasta, String descripcion){
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.descripcion = descripcion;
    }
    
    
}
