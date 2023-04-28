package com.PrimerApp.SpringBoot.Interface;

import com.PrimerApp.SpringBoot.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion educacion);
    
    public void borrarEducacion(Long id);
    
    public Educacion buscarEducacion(Long id);
    
    public void editarEducacion (Educacion educacion);
    
}
