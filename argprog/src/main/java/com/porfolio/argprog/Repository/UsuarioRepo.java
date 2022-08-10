package com.porfolio.argprog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.porfolio.argprog.Entity.Usuario;



@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

}
