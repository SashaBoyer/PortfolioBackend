package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.Interface.IExperienciaService;
import com.PrimerApp.SpringBoot.model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService experienciaServ;
     
    
//EndPoint    
    @PostMapping("/experiencia/nuevo")
    public void agregarExperiencia(@RequestBody Experiencia experiencia){ 
        experienciaServ.crearExperiencia(experiencia);
    }
    
    @GetMapping ("/experiencia/ver")
    @ResponseBody//lo que devuelve esta funcion, quiero que me lo devuelvas en el cuerpo de la respuesta
    public List<Experiencia> verExperiencia (){
        return experienciaServ.verExperiencia();
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public void experienciaProyecto (@PathVariable Long id, 
                                     @RequestBody Experiencia experiencia){
        experienciaServ.buscarExperiencia(id);
        experienciaServ.editarExperiencia(experiencia);
    }
   
    @GetMapping("/experiencia/ver/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return experienciaServ.buscarExperiencia(id);
    }
     
    
}
