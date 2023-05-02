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
    private Long id;
    
    private String empresa;
    private String puesto;
    private Date fecha_desde;
    private Date fecha_hasta;
    private String descripcion;
    
    public Experiencia(){
    }
    
    public Experiencia(String empresa, String puesto, Date fecha_desde, Date fecha_hasta, String descripcion){
        this.empresa = empresa;
        this.puesto = puesto;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.descripcion = descripcion;
    }
    
    
}
