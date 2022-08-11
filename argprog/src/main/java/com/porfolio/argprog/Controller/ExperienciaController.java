package com.porfolio.argprog.Controller;

import com.porfolio.argprog.Entity.Experiencia;
import com.porfolio.argprog.Service.ExperienciaService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {

    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia addExperiencia = experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(addExperiencia, HttpStatus.OK);
    }

    @GetMapping("/ver")
    public ResponseEntity<List> buscarExperiencia() {
        List buscarExperiencia = experienciaService.buscarExperiencia();
        return new ResponseEntity<>(buscarExperiencia, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia = experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        experienciaService.borrarExperiencia(id);
    }

}
