package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.Interface.ISoftSkillService;
import com.PrimerApp.SpringBoot.model.SoftSkill;
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
public class SoftSkillController {
    
    @Autowired
    private ISoftSkillService softServ;
     
    
//EndPoint    
    @PostMapping("/soft/skill/crear")
    public void agregarSoftSkill(@RequestBody SoftSkill softSkill){ 
        softServ.crearSoftSkill(softSkill);
    }
    
    @GetMapping ("/soft/skill/ver")
    @ResponseBody//lo que devuelve esta funcion, quiero que me lo devuelvas en el cuerpo de la respuesta
    public List<SoftSkill> verSoftSkill(){
        return softServ.verSoftSkill();
    }
    
    @DeleteMapping ("/soft/skill/borrar/{id}")
    public void borrarSoftSkill(@PathVariable Long id){
        softServ.borrarSoftSkill(id);
    }
    
    @PutMapping ("/soft/skill/editar/{id}")
    public void experienciaSoftSkill (@PathVariable Long id, 
                                      @RequestBody SoftSkill softSkill){
        softServ.buscarSoftSkill(id);
        softServ.editarSoftSkill(softSkill);
    }
   
    @GetMapping("/soft/skill/ver/{id}")
    public SoftSkill buscarSoftSkill(@PathVariable Long id){
        return softServ.buscarSoftSkill(id);
    }
     
    
}
