package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.Interface.IExperienciaService;
import com.PrimerApp.SpringBoot.model.Experiencia;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService experienciaService;
     
    
//EndPoint    
    @PostMapping("/experiencia/crear")
    public void agregarExperiencia(@RequestBody Experiencia experiencia){ 
        experienciaService.crearExperiencia(experiencia);
    }
    
    
     @GetMapping("/experiencia/ver")
    public List<Experiencia> verExperiencia(){
        return experienciaService.verExperiencia();
    }

    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaService.borrarExperiencia(id);
    }
       
   
    @GetMapping("/experiencia/ver/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return experienciaService.buscarExperiencia(id);
    }

    @PutMapping("/experiencia/editar/{id}")
    public void editarExperiencia(@PathVariable Long id,
                             @RequestParam("empresa")String nuevaEmpresa,
                             @RequestParam("puesto")String nuevoPuesto,
                             @RequestParam("fecha_desde")Date nuevoDesde,
                             @RequestParam("fecha_hasta")Date nuevoHasta,
                             @RequestParam("descripcion")String nuevaDescripcion
                             
    ){
        Experiencia experiencia = experienciaService.buscarExperiencia(id);
        experiencia.setEmpresa(nuevaEmpresa);
        experiencia.setPuesto(nuevoPuesto);
        experiencia.setFecha_desde(nuevoDesde);
        experiencia.setFecha_hasta(nuevoHasta);
        experiencia.setDescripcion(nuevaDescripcion);
        
        experienciaService.editarExperiencia(experiencia);
    } 

}
