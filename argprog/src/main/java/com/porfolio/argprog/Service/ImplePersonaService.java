package com.porfolio.argprog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.porfolio.argprog.Entity.Persona;
import com.porfolio.argprog.Interface.IPersonaService;
import com.porfolio.argprog.Repository.IPersonaRepository;

@Service
public class ImplePersonaService implements IPersonaService {

	@Autowired 
	public IPersonaRepository ipersonarepository;
	
	
	@Override
	public List<Persona> traerPersonas() {
		List<Persona> persona = ipersonarepository.findAll();
		return persona;
	}

	@Override
	public void guardarPersona(Persona persona) {
		ipersonarepository.save(persona);
		
	}

	@Override
	public void borrarPersona(Long id) {
		ipersonarepository.deleteById(id);
		
	}

	@Override
	public Persona buscarPersona(Long id) {
		Persona persona = ipersonarepository.findById(id).orElse(null);
		return persona;
	}

}
