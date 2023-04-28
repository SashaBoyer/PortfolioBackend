package com.PrimerApp.SpringBoot.repository;

import com.PrimerApp.SpringBoot.model.HardSkill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HardSkillRepository extends JpaRepository<HardSkill, Integer>{
    Optional<HardSkill> findByNombre(String nombre);
    public boolean existsByNombre (String nombre);
}
