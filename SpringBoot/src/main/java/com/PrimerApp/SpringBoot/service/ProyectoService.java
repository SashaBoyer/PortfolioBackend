package com.PrimerApp.SpringBoot.service;

import com.PrimerApp.SpringBoot.Interface.IProyectoService;
import com.PrimerApp.SpringBoot.model.Proyecto;
import com.PrimerApp.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyectoRepo;
    
    //traer, get
    @Override
    public List<Proyecto> verProyecto() {
        return proyectoRepo.findAll();
    }

    //guardar objeto tipo proyecto,save
    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }

    //eliminar proyecto por id,delete
    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    //buscar proyecto por id, find
    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }
    
}
