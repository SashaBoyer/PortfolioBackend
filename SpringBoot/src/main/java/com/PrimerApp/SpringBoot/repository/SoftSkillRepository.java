package com.PrimerApp.SpringBoot.repository;

import com.PrimerApp.SpringBoot.model.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SoftSkillRepository extends JpaRepository<SoftSkill, Long>{
 
}
