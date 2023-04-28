package com.PrimerApp.SpringBoot.repository;

import com.PrimerApp.SpringBoot.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}
