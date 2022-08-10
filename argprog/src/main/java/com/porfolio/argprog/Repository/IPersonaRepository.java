package com.porfolio.argprog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.porfolio.argprog.Entity.Persona;



@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
