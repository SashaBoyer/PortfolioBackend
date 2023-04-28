package com.PrimerApp.SpringBoot.Security.Repository;

import com.PrimerApp.SpringBoot.Security.Entity.Rol;
import com.PrimerApp.SpringBoot.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
