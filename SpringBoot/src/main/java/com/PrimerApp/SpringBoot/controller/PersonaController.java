package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.model.Persona;
import com.PrimerApp.SpringBoot.Interface.IPersonaService;
import jakarta.annotation.security.PermitAll;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService personaServ;
    
    
//EndPoint    
    @PostMapping("/persona/nueva")
    public void agregarPersona (@RequestBody Persona pers){
        //listaPersonas.add(pers); 
        personaServ.crearPersona(pers);
    }
    
//Consultar lista de personas
    @GetMapping ("/persona/ver")
    @ResponseBody//lo que devuelve esta funcion, quiero que me lo devuelvas en el cuerpo de la respuesta
    @PermitAll
    public List<Persona> verPersonas (){
        //return listaPersonas;
        return personaServ.verPersonas();
    }
    
    @DeleteMapping ("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaServ.borrarPersona(id);
    }
    
    @PutMapping ("/persona/editar/{id}")
    public void editarPersona (@PathVariable Long id, 
                               @RequestBody Persona pers){
        personaServ.buscarPersona(id);
        personaServ.modificarPersona(pers);
    }
   
    @GetMapping("/persona/ver/{id}")
    public Persona modificarPersona(@PathVariable Long id){
        return personaServ.buscarPersona(id);
    }
    
}
