package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.model.Educacion;
import com.PrimerApp.SpringBoot.service.EducacionService;
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
@CrossOrigin(origins = {"http://localhost:4200"})

public class EducacionController {
    
    @Autowired 
    private EducacionService educacionService;
    
    
    //EndPoint
    //obtener educacion
    @GetMapping("/educacion/ver")
    public List<Educacion> verEducacion(){
       System.out.print("Holiss Algo");
        return educacionService.verEducacion();
    }
    
    
    //crear nueva educacion
    @PostMapping("/educacion/crear")
    public void crearEducacion(@RequestBody Educacion educacion){
        educacionService.crearEducacion(educacion);
    }
    
    
    //borrar educacion
    @DeleteMapping("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionService.borrarEducacion(id);
    }
    
    
    //encontrar educacion
    @GetMapping("/educacion/ver/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        return educacionService.buscarEducacion(id);
    }
    
    //editar educacion
    
    @PutMapping("/educacion/editar/{id}")
    public void editarEducacion(@PathVariable Long id,
                             @RequestParam("establecimiento")String nuevoEst,
                             @RequestParam("titulo")String nuevoTitulo,
                             @RequestParam("fechaDesde")Date nuevoDesde,
                             @RequestParam("fechaHasta")Date nuevoHasta,
                             @RequestParam("imagen")String nuevaImagen
                             
    ){
        Educacion educacion = educacionService.buscarEducacion(id);
        educacion.setEstablecimiento(nuevoEst);
        educacion.setTitulo(nuevoTitulo);
        educacion.setFechaDesde(nuevoDesde);
        educacion.setFechaHasta(nuevoHasta);
        educacion.setImagen(nuevaImagen);
        
        educacionService.editarEducacion(educacion);
    }

    /*@PutMapping ("/editar/educacion/{id}")
    public void editarEducacion (@PathVariable Long id, 
                                 @RequestBody Educacion educacion){
        educacionService.buscarEducacion(id);
        educacionService.editarEducacion(educacion);
    }
    
    */
    
}

