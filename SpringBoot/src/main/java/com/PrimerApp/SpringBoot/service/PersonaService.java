package com.PrimerApp.SpringBoot.service;

import com.PrimerApp.SpringBoot.Interface.IPersonaService;
import com.PrimerApp.SpringBoot.model.Persona;
import com.PrimerApp.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository personRepo;
    
    //traer, get
    @Override
    public List<Persona> verPersonas() {
        return personRepo.findAll();
    }

    //guardar objeto tipo persona,save
    @Override
    public void crearPersona(Persona per) {
        personRepo.save(per);
    }

    //eliminar persona por id,delete
    @Override
    public void borrarPersona(Long id) {
        personRepo.deleteById(id);
    }

    //buscar persona por id, find
    @Override
    public Persona buscarPersona(Long id) {
        return personRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarPersona(Persona per) {
        personRepo.save(per);
    }
    
}
