
package com.porfolio.argprog.Service;

import com.porfolio.argprog.Entity.Proyectos;
import com.porfolio.argprog.Repository.ProyectosRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional 
public class ProyectosService {
    private final ProyectosRepo proyectosrepo;
    
    @Autowired
    public ProyectosService (ProyectosRepo proyectosrepo){
        this.proyectosrepo = proyectosrepo;
    }
    
    public Proyectos  addProyecto(Proyectos proyecto){
        return proyectosrepo.save(proyecto);
    }
    
    public List<Proyectos> buscarProyectos(){
        return proyectosrepo.findAll();
    }
    
    
    public Proyectos editarProyecto(Proyectos proyecto){
        return proyectosrepo.save(proyecto);
    }
    
    public void borrarProyecto(Long id){
        proyectosrepo.deleteById(id);
    }
    
    
    
    
}

