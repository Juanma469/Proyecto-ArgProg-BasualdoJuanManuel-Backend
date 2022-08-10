package com.porfolio.argprog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.porfolio.argprog.Entity.Persona;
import com.porfolio.argprog.Interface.IPersonaService;

@RestController
public class PersonaController {
	@Autowired
	public IPersonaService ipersonaservice;
	
	@GetMapping("persona/ver")
	public List<Persona> traerPersonas(){
		return ipersonaservice.traerPersonas();
	}
	
	
	@PostMapping("persona/crear")
	public String crearPersona(@RequestBody Persona persona) {
		ipersonaservice.guardarPersona(persona);
		return "Se guardo correctamente";
	}
	
	@DeleteMapping("persona/borrar/{id}")
	public String borrarPersona(@PathVariable Long id) {
		ipersonaservice.borrarPersona(id);
		return "Se borro correctamente la persona";
	}
	
	
	@PutMapping("persona/editar/{id}")
	public Persona editarPersona(@PathVariable Long id,
							   	 @RequestParam("nombre") String nNombre,
								 @RequestParam("apellido") String nApellido,
								 @RequestParam("img") String nImg) {
		Persona persona = ipersonaservice.buscarPersona(id);
		
		persona.setNombre(nNombre);
		persona.setApellido(nApellido);
		persona.setImg(nImg);
		ipersonaservice.guardarPersona(persona);
		
		return persona;
		
	}
}
