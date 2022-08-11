
package com.porfolio.argprog.Service;

import com.porfolio.argprog.Entity.Educacion;
import com.porfolio.argprog.Repository.EducacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional 
public class EducacionService {
    private final EducacionRepo educacionRepo;
    
    @Autowired
    public EducacionService (EducacionRepo educacionRepo){
        this.educacionRepo = educacionRepo;
    }
    
    
    
    public Educacion  addEducacion (Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public List<Educacion> buscarEducacion(){
        return educacionRepo.findAll();
    }
    
    
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
    
    
    
    
}
