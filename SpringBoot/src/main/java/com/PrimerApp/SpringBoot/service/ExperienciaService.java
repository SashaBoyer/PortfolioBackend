package com.PrimerApp.SpringBoot.service;

import com.PrimerApp.SpringBoot.Interface.IExperienciaService;
import com.PrimerApp.SpringBoot.model.Experiencia;
import com.PrimerApp.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
 
    @Autowired
    public ExperienciaRepository expRepo;
    
    //traer, get
    @Override
    public List<Experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    //guardar objeto tipo experiencia,save
    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    //eliminar experiencia por id,delete
    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    //buscar experiencia por id, find
    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }
    
}
