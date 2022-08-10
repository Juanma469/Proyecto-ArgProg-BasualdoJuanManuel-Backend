package com.porfolio.argprog.Interface;

import java.util.List;
import com.porfolio.argprog.Entity.Usuario;

public interface IPersonaService {
	
	public List<Usuario> traerPersonas();
	
	public void guardarPersona (Usuario persona);
	
	public void borrarPersona (Long id);
	
	public Usuario buscarPersona(Long id);

}
