package com.PrimerApp.SpringBoot.Interface;

import com.PrimerApp.SpringBoot.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia ();
    
    public void crearExperiencia (Experiencia experiencia);
    
    public void borrarExperiencia (Long id);
    
    public Experiencia buscarExperiencia (Long id);
    
    public void editarExperiencia (Experiencia experiencia);

}
