package com.PrimerApp.SpringBoot.service;

import com.PrimerApp.SpringBoot.Interface.IHardSkillService;
import com.PrimerApp.SpringBoot.model.HardSkill;
import com.PrimerApp.SpringBoot.repository.HardSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HardSkillService implements IHardSkillService{
    
    @Autowired
    public HardSkillRepository hardRepo;
    

    @Override
    public List<HardSkill> verHardSkill() {
        return hardRepo.findAll();
    }

    @Override
    public void crearHardSkill(HardSkill hardSkill) {
        hardRepo.save(hardSkill);
    }

    
    @Override
    public void borrarHardSkill(Long id) {
        hardRepo.deleteById(id);
    }

    @Override
    public HardSkill buscarHardSkill(Long id) {
        return hardRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarHardSkill(HardSkill hardSkill) {
        hardRepo.save(hardSkill);
    }
    
    
}
