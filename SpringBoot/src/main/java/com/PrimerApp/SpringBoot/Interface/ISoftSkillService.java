package com.PrimerApp.SpringBoot.Interface;

import com.PrimerApp.SpringBoot.model.SoftSkill;
import java.util.List;

public interface ISoftSkillService {
    
     public List<SoftSkill> verSoftSkill ();
    
    public void crearSoftSkill (SoftSkill softSkill);
    
    public void borrarSoftSkill (Long id);
    
    public SoftSkill buscarSoftSkill (Long id);
    
    public void editarSoftSkill (SoftSkill softSkill);

    
}
