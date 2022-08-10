
package com.porfolio.argprog.Service;

import com.porfolio.argprog.Entity.Usuario;
import com.porfolio.argprog.Repository.UsuarioRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional 
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;
    
    @Autowired
    public UsuarioService (UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }
    
    public Usuario  addUsuario (Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public List<Usuario> buscarUsuario(){
        return usuarioRepo.findAll();
    }
    
    
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
    
    
    
    
}
