package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.Dto.dtoExperiencia;
import com.PrimerApp.SpringBoot.Security.Controller.Mensaje;
import com.PrimerApp.SpringBoot.model.Experiencia;
import com.PrimerApp.SpringBoot.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("expLab")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ExperienciaController {
    
     @Autowired
     ExperienciaService experienciaService;
 
     
     @GetMapping("/experiencia/ver")
     public ResponseEntity<List<Experiencia>> list(){
         List<Experiencia> list = experienciaService.list();
         return new ResponseEntity(list, HttpStatus.OK);
     }
     
     @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!experienciaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = experienciaService.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
     
     
     @PostMapping("/experiencia/nueva")
     public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoExp){
         Experiencia experiencia = new Experiencia(dtoExp.getEmpresa(), dtoExp.getPuesto(), dtoExp.getFechaDesde(), dtoExp.getFechaHasta(), dtoExp.getDescripcion());
         experienciaService.save(experiencia);
         return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
     }
     
     @PutMapping("/experiencia/editar/{id}")
     public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoExp){
         Experiencia experiencia = experienciaService.getOne(id).get();
         experiencia.setEmpresa(dtoExp.getEmpresa());
         experiencia.setPuesto(dtoExp.getPuesto());
         experiencia.setFechaDesde(dtoExp.getFechaDesde());
         experiencia.setFechaHasta(dtoExp.getFechaHasta());
         experiencia.setDescripcion(dtoExp.getDescripcion());
         
         return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
     }
     
     
     public ResponseEntity<?> delete(@PathVariable("id") int id){
     experienciaService.delete(id);
     return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
     }
     
    
}
