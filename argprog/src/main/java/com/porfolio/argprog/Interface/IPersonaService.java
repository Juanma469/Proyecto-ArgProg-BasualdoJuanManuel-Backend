package com.porfolio.argprog.Interface;

import java.util.List;
import com.porfolio.argprog.Entity.Persona;

public interface IPersonaService {
	
	public List<Persona> traerPersonas();
	
	public void guardarPersona (Persona persona);
	
	public void borrarPersona (Long id);
	
	public Persona buscarPersona(Long id);

}
