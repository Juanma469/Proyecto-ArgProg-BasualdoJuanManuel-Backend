
package com.porfolio.argprog.Service;

import com.porfolio.argprog.Entity.Usuario;
import com.porfolio.argprog.Repository.UsuarioRepo;
import com.porfolio.argprog.exception.UserNotFoundException;
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
    
    public Usuario buscarUsuarioConId(Long id){
        return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("No hay usuario con ese id"));
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
