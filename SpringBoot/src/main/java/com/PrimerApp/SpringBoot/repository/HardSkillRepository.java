package com.PrimerApp.SpringBoot.repository;

import com.PrimerApp.SpringBoot.model.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HardSkillRepository extends JpaRepository<HardSkill, Long>{
   
}
