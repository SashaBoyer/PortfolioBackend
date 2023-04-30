package com.PrimerApp.SpringBoot.service;

import com.PrimerApp.SpringBoot.Interface.IEducacionService;
import com.PrimerApp.SpringBoot.model.Educacion;
import com.PrimerApp.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{
    
    @Autowired 
    public EducacionRepository educacionRepository;

    @Override
    public List<Educacion> verEducacion() {
        List<Educacion> educacion = educacionRepository.findAll(); 
        return educacion;
    }

    @Override
    public void crearEducacion(Educacion educacion) {
       educacionRepository.save(educacion); 
    }

    @Override
    public void borrarEducacion(Long id) {
        educacionRepository.deleteById(id); 
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        Educacion educacion = educacionRepository.findById(id).orElse(null);
        return educacion;
    }
    
    @Override
    public void editarEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }
    
}
