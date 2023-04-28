package com.PrimerApp.SpringBoot.Dto;

import jakarta.validation.constraints.NotBlank;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoExperiencia {
    
    @NotBlank
    private String empresa;
    
    private String puesto;
    private Date fechaDesde;
    private Date fechaHasta;
    
    @NotBlank
    private String descripcion;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String empresa, String puesto, Date fechaDesde, Date fechaHasta, String descripcion) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.descripcion = descripcion;
    }
    
    
}
