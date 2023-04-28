package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.model.Persona;
import com.PrimerApp.SpringBoot.Interface.IPersonaService;
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
    private IPersonaService personServ;
    
    
//EndPoint    
    @PostMapping("/persona/nueva")
    public void agregarPersona (@RequestBody Persona pers){
        //listaPersonas.add(pers); 
        personServ.crearPersona(pers);
    }
    
//Consultar lista de personas
    @GetMapping ("/persona/ver")
    @ResponseBody//lo que devuelve esta funcion, quiero que me lo devuelvas en el cuerpo de la respuesta
    public List<Persona> verPersonas (){
        //return listaPersonas;
        return personServ.verPersonas();
    }
    
    @DeleteMapping ("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        personServ.borrarPersona(id);
    }
    
    @PutMapping ("/persona/editar/{id}")
    public void editarPersona (@PathVariable Long id, 
                               @RequestBody Persona pers){
        personServ.buscarPersona(id);
        personServ.modificarPersona(pers);
    }
   
    @GetMapping("/persona/ver/{id}")
    public Persona modificarPersona(@PathVariable Long id){
        return personServ.buscarPersona(id);
    }
    
}
