
package com.porfolio.argprog.Repository;

import com.porfolio.argprog.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillRepo extends JpaRepository<Skill, Long> {
    
}
    