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
    
    private String nombre;
    private String descripcion;
    private Date fecha_realizacion;
    private String imagen;
    
    public Proyecto(){
    }
    
    public Proyecto(Long id, String nombre, String descripcion, Date fecha_realizacion, String imagen){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_realizacion = fecha_realizacion;
        this.imagen = imagen;
    }
    
}
