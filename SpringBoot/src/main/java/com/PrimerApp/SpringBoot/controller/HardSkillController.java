package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.Interface.IHardSkillService;
import com.PrimerApp.SpringBoot.model.HardSkill;
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
public class HardSkillController {
    
    @Autowired
    private IHardSkillService hardServ;
     
    
//EndPoint    
    @PostMapping("/hard/skill/crear")
    public void agregarHardSkill(@RequestBody HardSkill hardSkill){ 
        hardServ.crearHardSkill(hardSkill);
    }
    
    @GetMapping ("/hard/skill/ver")
    @ResponseBody//lo que devuelve esta funcion, quiero que me lo devuelvas en el cuerpo de la respuesta
    public List<HardSkill> verHardSkill(){
        return hardServ.verHardSkill();
    }
    
    @DeleteMapping ("/hard/skill/borrar/{id}")
    public void borrarHardSkill(@PathVariable Long id){
        hardServ.borrarHardSkill(id);
    }
    
    @PutMapping ("/hard/skill/editar/{id}")
    public void experienciaHardSkill (@PathVariable Long id, 
                                      @RequestBody HardSkill hardSkill){
        hardServ.buscarHardSkill(id);
        hardServ.editarHardSkill(hardSkill);
    }
   
    @GetMapping("/hard/skill/ver/{id}")
    public HardSkill buscarHardSkill(@PathVariable Long id){
        return hardServ.buscarHardSkill(id);
    }
     
    
}
