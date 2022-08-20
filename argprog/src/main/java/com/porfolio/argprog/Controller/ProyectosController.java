package com.porfolio.argprog.Controller;

import com.porfolio.argprog.Entity.Proyectos;
import com.porfolio.argprog.Service.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {

    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    @PostMapping("/add")
    public ResponseEntity<Proyectos> addSkill(@RequestBody Proyectos proyecto) {
        Proyectos addProyecto = proyectosService.addProyecto(proyecto);
        return new ResponseEntity<>(addProyecto, HttpStatus.CREATED);
    }

   
    @GetMapping("/ver")
    public ResponseEntity<List> buscarProyectos() {
        List buscarProyectos = proyectosService.buscarProyectos();
        return new ResponseEntity<>(buscarProyectos, HttpStatus.OK);
    }
    
    
    @PutMapping("/update")
    public ResponseEntity<Proyectos> editarSkill(@RequestBody Proyectos proyecto) {
        Proyectos updateProyecto = proyectosService.editarProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable Long id) {
        proyectosService.borrarProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
