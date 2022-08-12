package com.porfolio.argprog.Controller;

import com.porfolio.argprog.Entity.Skill;
import com.porfolio.argprog.Service.SkillService;
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
@RequestMapping("/skill")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping("/add")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
        Skill addSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(addSkill, HttpStatus.CREATED);
    }

    @GetMapping("/ver")
    public ResponseEntity<List> buscarSkill() {
        List buscarSkill = skillService.buscarSkill();
        return new ResponseEntity<>(buscarSkill, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Skill> editarSkill(@RequestBody Skill skill) {
        Skill updateSkill = skillService.editarSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable Long id) {
        skillService.borrarSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
