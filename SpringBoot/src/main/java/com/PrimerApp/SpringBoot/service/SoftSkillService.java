/*package com.PrimerApp.SpringBoot.service;

import com.PrimerApp.SpringBoot.repository.SoftSkillRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class SoftSkillService implements IEducacionService{
    
    @Autowired
    public SoftSkillRepository softSkillRepository;
    
    public List<SoftSkill> list(){
    return softSkillRepository.findAll();
    }
    
    public Optional<SoftSkill> gerOne (int id){
    return softSkillRepository.findById(id);
    }
    
    public Optional<SoftSkill> getByNombre(String nombre){
    return softSkillRepository.findByNombre (nombre);
    }
    
    public void save(SoftSkill softSkill){
        softSkillRepository.save(softSkill);
    }
    
    public void delete (long id){
        softSkillRepository.deleteById(id);
    }
    
    public boolean existsById(long id){
    return softSkillRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
    return softSkillRepository.existsByNombre(nombre);
    }
    
    
}*/
