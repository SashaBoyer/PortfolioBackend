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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreProyecto;
    private String descripcion;
    private Date fechaRealizacion;
    private String imagen;
    
    public Proyecto(){
    }
    
    public Proyecto(Long id, String nombreProyecto, String descripcion, Date fechaRealizacion, String imagen){
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.imagen = imagen;
    }
    
}
