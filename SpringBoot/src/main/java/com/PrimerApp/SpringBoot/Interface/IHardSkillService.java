package com.PrimerApp.SpringBoot.Interface;

import com.PrimerApp.SpringBoot.model.HardSkill;
import java.util.List;

public interface IHardSkillService {
    
    public List<HardSkill> verHardSkill ();
    
    public void crearHardSkill (HardSkill hardSkill);
    
    public void borrarHardSkill (Long id);
    
    public HardSkill buscarHardSkill (Long id);
    
    public void editarHardSkill (HardSkill hardSkill);

}
