
package com.porfolio.argprog.Service;

import com.porfolio.argprog.Entity.Skill;
import com.porfolio.argprog.Repository.SkillRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional 
public class SkillService {
    private final SkillRepo skillRepo;
    
    @Autowired
    public SkillService (SkillRepo skillRepo){
        this.skillRepo = skillRepo;
    }
    
    public Skill  addSkill (Skill skill){
        return skillRepo.save(skill);
    }
    
    public List<Skill> buscarSkill(){
        return skillRepo.findAll();
    }
    
    
    public Skill editarSkill(Skill skill){
        return skillRepo.save(skill);
    }
    
    public void borrarSkill(Long id){
        skillRepo.deleteById(id);
    }
    
    
    
    
}
