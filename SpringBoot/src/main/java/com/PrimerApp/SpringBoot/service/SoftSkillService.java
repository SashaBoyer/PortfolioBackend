package com.PrimerApp.SpringBoot.service;

import com.PrimerApp.SpringBoot.Interface.ISoftSkillService;
import com.PrimerApp.SpringBoot.model.SoftSkill;
import com.PrimerApp.SpringBoot.repository.SoftSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SoftSkillService implements ISoftSkillService{
    
    @Autowired
    public SoftSkillRepository softRepo;
    
  
    @Override
    public List<SoftSkill> verSoftSkill() {
        return softRepo.findAll();
    }

    @Override
    public void crearSoftSkill(SoftSkill softSkill) {
        softRepo.save(softSkill);
    }

    @Override
    public void borrarSoftSkill(Long id) {
        softRepo.deleteById(id);
    }

    @Override
    public SoftSkill buscarSoftSkill(Long id) {
        return softRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarSoftSkill(SoftSkill softSkill) {
        softRepo.save(softSkill);
    }
    
}
