package com.PrimerApp.SpringBoot.controller;

import com.PrimerApp.SpringBoot.Interface.IProyectoService;
import com.PrimerApp.SpringBoot.model.Proyecto;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyectoServ;
     
    
//EndPoint    
    @PostMapping("/proyecto/crear")
    public void agregarProyecto (@RequestBody Proyecto proyecto){ 
        proyectoServ.crearProyecto(proyecto);
    }
    
    @GetMapping ("/proyecto/ver")
    @ResponseBody//lo que devuelve esta funcion, quiero que me lo devuelvas en el cuerpo de la respuesta
    public List<Proyecto> verProyecto (){
        return proyectoServ.verProyecto();
    }
    
    @DeleteMapping ("/proyecto/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoServ.borrarProyecto(id);
    }
    
    @PutMapping ("/proyecto/editar/{id}")
    public void editarProyecto (@PathVariable Long id, 
                               @RequestBody Proyecto proyecto){
        proyectoServ.buscarProyecto(id);
        proyectoServ.editarProyecto(proyecto);
    }
   
    @GetMapping("/proyecto/ver/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id){
        return proyectoServ.buscarProyecto(id);
    }
    
    
}
